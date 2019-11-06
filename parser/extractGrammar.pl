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

#my $line;
#foreach $line (split /\n/s, $prefix) {
#	if ($line =~ /^\s*%token/) {
#		$line =~ s/\s*<.*>//g;
#		print "$line\n"
#	}
#}

	# remove any text in {}
while ($grammar =~ s/\s*([^']){[^{}]*}/$1/sg) {}

	# change keyword identifiers into the string they represent
$grammar =~ s/\b([A-Z0-9_]+)_\b/K_$1\E/sg;
$prefix =~ s/\b([A-Z0-9_]+)_\b/K_$1\E/sg;

# $grammar =~ s/_class/klass/sg;

	# change assembler directives into their string
$grammar =~ s/\b_([A-Z0-9]+)\b/D_$1\E/sg;
$prefix =~ s/\b_([A-Z0-9]+)\b/D_$1\E/sg;


=pod

=cut


$grammar =~ s/'{'/OPEN_BRACE/sg;
$grammar =~ s/'}'/CLOSE_BRACE/sg;

$grammar =~ s/'\['/OPEN_BRACKET/sg;
$grammar =~ s/'\]'/CLOSE_BRACKET/sg;

$grammar =~ s/'\('/OPEN_PARENS/sg;
$grammar =~ s/'\)'/CLOSE_PARENS/sg;

$grammar =~ s/'<'/OPEN_ANGLE_BRACKET/sg;
$grammar =~ s/'>'/CLOSE_ANGLE_BRACKET/sg;

$grammar =~ s/','/COMMA/sg;
$grammar =~ s/':'/COLON/sg;

$grammar =~ s/'='/ASSIGN/sg;
$grammar =~ s/'\*'/STAR/sg;
$grammar =~ s/'\&'/AMPERSAND/sg;
$grammar =~ s/'\+'/PLUS/sg;

$grammar =~ s/'\/'/SLASH/sg;
$grammar =~ s/'!'/BANG/sg;
$grammar =~ s/'-'/DASH/sg;




	# do the special punctuation by hand
# $grammar =~ s/\bELIPSIS\b/'...'/sg;
# $grammar =~ s/\bDCOLON\b/'::'/sg;

#<STRIP>
	# remove TODO comments
# $grammar =~ s/\n\s*\/\*[^\n]*TODO[^\n]*\*\/\s*\n/\n/sg;
#</STRIP>
print $prefix;
print '
%token DOT           "."
%token OPEN_BRACE    "{"
%token CLOSE_BRACE   "}"
%token OPEN_BRACKET  "["
%token CLOSE_BRACKET "]"
%token OPEN_PARENS   "("
%token CLOSE_PARENS  ")"
%token COMMA         ","
%token COLON         ":"
%token DOUBLE_COLON  "::"
%token SEMICOLON     ";"
%token ASSIGN        "="
%token STAR          "*"
%token AMPERSAND     "&"
%token PLUS          "+"
%token SLASH         "/"
%token BANG          "!"
%token ELLIPSIS      "..."
%token DASH          "-"
%token OPEN_ANGLE_BRACKET   "<"
%token CLOSE_ANGLE_BRACKET  ">"
';
print '%%';
print $grammar;
print '%%';
print '}';
