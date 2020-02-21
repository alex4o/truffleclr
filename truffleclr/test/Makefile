ilfiles := $(wildcard *.il)
exefiles:= $(patsubst %.il,%.exe,$(ilfiles))
outfiles:= $(patsubst %.il,./out/%.out,$(ilfiles))

all: $(outfiles)

%.exe: %.il
	ilasm $^

./out/%.out: %.exe
	@mkdir -p $(@D)
	mono $^ > $@

