package parser.generic.instruction

import parser.generic.Method


abstract class Instruction() { abstract var instruction: String }
data class InstructionNone(override var instruction: String) : Instruction()
data class InstructionBrTarget(override var instruction: String, var target: String): Instruction()
data class InstructionString(override var instruction: String, var content: String): Instruction()
data class InstructionMethod(override var instruction: String, var method: Method): Instruction()

