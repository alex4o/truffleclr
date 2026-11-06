#!/bin/bash
# Usage: test/mktest.sh <name> <source.cs> [Debug|Release]
set -euo pipefail
name=$1
src=$(cd "$(dirname "$2")" && pwd)/$(basename "$2")
configuration=${3:-Debug}
case "$configuration" in Debug|Release) ;; *) echo 'Expected Debug or Release' >&2; exit 1;; esac
export DOTNET_ROOT=${DOTNET_ROOT:-/tmp/dotnet}
export PATH="$DOTNET_ROOT:$PATH" DOTNET_CLI_TELEMETRY_OPTOUT=1 DOTNET_NOLOGO=1
T=$(cd "$(dirname "$0")" && pwd)
W=$(mktemp -d)
trap 'rm -rf "$W"' EXIT
dotnet new console -o "$W/p" >/dev/null
cp "$src" "$W/p/Program.cs"
dotnet build "$W/p" -c "$configuration" -v q -nologo -p:Nullable=disable -p:ImplicitUsings=disable >"$W/build.log" 2>&1 || { more "$W/build.log"; exit 1; }
"${ILDASM:-/Users/alex4o/.cache/truffleclr-tools/ildasm}" -utf8 "$W/p/bin/$configuration/"*/p.dll > "$T/$name.il"
if [ "$src" != "$T/cs/Program_$name.cs" ]; then cp "$src" "$T/cs/Program_$name.cs"; fi
dotnet "$W/p/bin/$configuration/"*/p.dll > "$T/expected/$name.out"
echo "wrote $name ($configuration)"
