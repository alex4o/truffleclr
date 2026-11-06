DOTNET ?= dotnet

.PHONY: all
all:
	$(DOTNET) build libraries/System.Private.CoreLib/System.Private.CoreLib.csproj
	cp libraries/System.Private.CoreLib/bin/Debug/netstandard2.0/System.Private.CoreLib.dll ../truffleclr/language/src/main/resources/System.Private.CoreLib.dll
