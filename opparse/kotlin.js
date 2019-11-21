const { Parser, parse } = require("papaparse");
const fs = require("fs")
const _ = require("lodash");

const stackVar = "stack"
const resVar = "res"


let ld = []
let st = []
let b = []
let c = []
let grouped = _.groupBy(parse(fs.readFileSync("./op.csv").toString()).data.map(row => row.map(item => item.trim())), item => item[1].match(/"(.*?)"/)[1].split(".")[0])
for (key in grouped) {

    if (key.startsWith('unused')) { continue }
    if (key.includes("prefix")) { continue }
    if (key.includes("illegal")) { continue }

 
    if (key.startsWith('ld')) {
        ld.push([key, grouped[key]])
        continue
    }


    if (key.startsWith('st')) {
        st.push([key, grouped[key]])
        continue
    }

    if (key.startsWith('b')) {
        b.push([key, grouped[key]])
        continue
    }

    if (key.startsWith('c')) {
        c.push([key, grouped[key]])
        continue
    }

    for (row of grouped[key]) {
       

        console.log(transform(row))
    }
}

for([key, rows] of ld) {
    _.values(_.groupBy(rows, row => row[4].replace("Short", ""))).forEach(row => {
        console.log(transformMem(key, row))
    })
}


for([key, rows] of st) {

    _.values(_.groupBy(rows, row => row[4].replace("Short", ""))).forEach(row => {
        console.log(transformMem(key, row))
    })

}


for([key, rows] of b) {

    _.values(_.groupBy(rows, row => row[4].replace("Short", ""))).forEach(row => {
        console.log(transformMem(key, row))
    })

}


for([key, rows] of c) {

    _.values(_.groupBy(rows, row => row[4].replace("Short", ""))).forEach(row => {
        console.log(transformMem(key, row))
    })

}


function transformMem(key, types) {
    let row = types[0]

    /** @type {Array<String>} */
    let pop = row[2].split("+").map(item => item.replace("Pop", ""))
    /** @type {Array<String>} */
    let push = row[3].split("+").map(item => item.replace("Push", ""))

    /** @type {String} */
    let instruction = row[1]
    let type = "Instruction" + row[4].replace("Short", "").replace("Inline", "")




    if (instruction.includes('call')) { pop = []; push = []; }
    if (instruction.includes('dup')) { pop = []; push = []; }


    if (pop[0] == "0") {
        pop = []
    }

    if (push[0] == "0") {
        push = []
    }

    let res = ""
    if (push.length == 0) {
        res += `\n\t${resVar}.add(node)\n`
    }

    let pops = pop.map((type, index) => `\tval s${index} = ${stackVar}.pop()\n\t${type != "1" ? `if(s${index}.first != "${type}") { error("") }` : ``}\n`).join("")
    let pushs = push.map((type, index) => `\t${stackVar}.push(Pair("${type}", node))\n`).join("")

    return (`//types: ${types.map(t => t[1])}\n if(instruction.instruction.startsWith("${key}") && instruction is ${type}) {\n\tTODO("not implemented")\n${pops}\n\tval node = null\n${res}${pushs}}`)

}

function transform(row) {

    /** @type {Array<String>} */
    let pop = row[2].split("+").map(item => item.replace("Pop", ""))
    /** @type {Array<String>} */
    let push = row[3].split("+").map(item => item.replace("Push", ""))

    /** @type {String} */
    let instruction = row[1]
    let type = "Instruction" + row[4].replace("Short", "").replace("Inline", "")




    if (instruction.includes('call')) { pop = []; push = []; }
    if (instruction.includes('dup')) { pop = []; push = []; }


    if (pop[0] == "0") {
        pop = []
    }

    if (push[0] == "0") {
        push = []
    }

    let res = ""
    if (push.length == 0) {
        res += `\n\t${resVar}.add(node)\n`
    }

    let pops = pop.map((type, index) => `\tval s${index} = ${stackVar}.pop()\n\t${type != "1" ? `if(s${index}.first != "${type}") { error("") }` : ``}\n`).join("")
    let pushs = push.map((type, index) => `\t${stackVar}.push(Pair("${type}", node))\n`).join("")

    return (`if(instruction.instruction == ${instruction} && instruction is ${type}) {\n\tTODO("not implemented")\n${pops}\n\tval node = null\n${res}${pushs}}`)

}