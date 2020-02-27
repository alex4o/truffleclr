package metadata.instruction

import metadata.IlMethod


abstract class Instruction() {
    abstract var instruction: String
    val instructionArgs = mutableListOf<String>()
}



data class InstructionNone(override var instruction: String) : Instruction()
data class InstructionVar(override var instruction: String, var value: Int) : Instruction()
data class InstructionVarS(override var instruction: String, var id: String) : Instruction()
data class InstructionI(override var instruction: String, var arg: Int) : Instruction()
data class InstructionI8(override var instruction: String, var arg: Long) : Instruction()
data class InstructionR(override var instruction: String, var arg: Float) : Instruction()
data class InstructionR8(override var instruction: String, var arg: Double) : Instruction()
data class InstructionBrTarget(override var instruction: String, var target: String) : Instruction()
data class InstructionMethod(override var instruction: String, var method: IlMethod, var callConv: Set<String>) : Instruction()
data class InstructionField(override var instruction: String, var type: String, var member: String, var name: String) :
    Instruction()

data class InstructionType(override var instruction: String, var type: String) : Instruction()
data class InstructionString(override var instruction: String, var content: String) : Instruction()
data class InstructionSig(override var instruction: String) : Instruction()
data class InstructionTok(override var instruction: String) : Instruction()
data class InstructionSwitch(override var instruction: String) : Instruction()

