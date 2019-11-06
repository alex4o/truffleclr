const { Parser, parse } = require("papaparse");
const fs = require("fs")
const _ = require("lodash");


res = _.mapValues(
    _.groupBy(parse(fs.readFileSync("./op.csv").toString()).data.map(row => row.map( item => item.trim().replace('"', "'").replace('"', "'") )),
     row => row[4].replace("Short", "")), value => _.uniq(value.map(row => row[1])).join(" | "))

for(let [key, value] of _.toPairs(res)) {
    console.log(`${key.replace("Inline", "INSTR_").toLocaleUpperCase()}: ${value};`)
}

