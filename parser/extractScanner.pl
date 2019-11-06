# Licensed to the .NET Foundation under one or more agreements.
# The .NET Foundation licenses this file to you under the MIT license.
# See the LICENSE file in the project root for more information.
#
# a simple script that extracts the grammar from a yacc file

undef $/;			# read in the whole file
my $file = <>;
$file =~ /^(.*)%%(.*)%%/s || die "Could not find %% markers";
my $prefix = $1;
my $grammar = $2;

my $defs = "";
my $tokens = "";
my $line;


foreach $line (split /\n/s, $prefix) {
	if ($line =~ /^\s*%token/) {
		$line =~ s/\s*<.*>//g;
		$line =~ s/%token //g;
		$line =~ s/\/\*.*?\*\///g;
		if ($line =~ /([A-Z_]*)\s*"(.+)"/) {
			$tokens = $tokens . "$1 = \"$2\"\n";
			$defs = $defs . "{$1} { return CilParser.$1; }\n";
			next;
		}

		foreach $word (split /\s/g, $line) {
			if( length $word > 0) {
				if( $word =~ /K_([A-Z0-9_]+)/ ) {
					$lcw = lc $1;
					$tokens = $tokens . "$word = \"$lcw\"\n";

					$defs = $defs . "{$word} { return CilParser.$word; }\n";
				
				
				} elsif( $word =~ /D_([A-Z0-9]+)/ ) {
					$lcw = lc $1;
					$tokens = $tokens . "$word = \".$lcw\"\n";

					$defs = $defs . "{$word} { return CilParser.$word; }\n";

				} elsif( $word =~ /P_([A-Z0-9]+)/ ) {
					$lcw = lc $1;
					$tokens = $tokens . "$word = \".$lcw\"\n";

					$defs = $defs . "{$word} { return CilParser.$word; }\n";
				} else {
					# print "$word\n";

				}
			}
		}
		
	}
}

print $tokens;

print "\n%%\n\n";

print $defs;