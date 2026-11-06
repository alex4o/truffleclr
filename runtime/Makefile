DOTNET ?= dotnet
ILDASM ?= ./ildasm

.PHONY: all
all:
	$(DOTNET) build libraries/System.Private.CoreLib/System.Private.CoreLib.csproj
	$(ILDASM) -utf8 libraries/System.Private.CoreLib/bin/Debug/netstandard2.0/System.Private.CoreLib.dll > ../truffleclr/language/src/main/resources/System.Private.CoreLib.il
