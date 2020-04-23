TruffleCLR
==========

The main goal of this project is to implement the Common Language Infrastructure (CLI) using Truffle [GraalVM]. The project requires the the use of a disassembled file in the `.il` format. To obtain that file the `ildasm` program should be used. The main component of this project resides inside of the `truffleclr` folder. 

## Building

When inside of the `truffleclr` folder the project can be build using `./gradlew fatJar copyJar`. This will produce artifacts inside `./build/libs`.

## Running

After the project has been build it can be ran with this command: `java -Dtruffle.class.path.append=./build/libs/language-1.0.0.jar -jar build/libs/launcher-1.0.0.jar --class HelloWorld.Program ./test/loop.il`. Help can be obtained using: `java -jar build/libs/launcher-1.0.0.jar --help`.

## Obtaining CIL (.il) files
To execute a program an `.il` file is needed. The instructions below describe how such file can be obtained when using the 2 C# compilers on supporting linux.

### Mono
After a C# program has been compiled an `.exe` file is produced. This file can then directly be given to `ildasm`.

### NetCore
When using NetCore the resulting binary is a `.dll` file. It can be found using `./bin/*/*/*.dll`. This file can then be disassembled using `ildasm`.

