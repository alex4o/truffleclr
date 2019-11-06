all:
	echo "specify which file to build"

clean:
	rm CliParser.java
	rm CliScanner.java
	rm CliScanner.java~

CliParser.java:
	jay grammar.jay < /usr/share/jay/skeleton > CliParser.java

CliScanner.java:
	./jflex-1.7.0/bin/jflex --skel jflex-1.7.0/src/main/resources/jflex/skeleton.default scanner.jflex

grammar.jay: extractGrammar.pl asmparse.y
	perl extractGrammar.pl asmparse.y > grammar.jay

