Microsoft (R) .NET Framework IL Disassembler.  Version 4.5.30319.0
C

MULTIPLE INPUT FILES SPECIFIED

Usage: ildasm [options] <file_name> [options]

Options for output redirection:
  /OUT=<file name>    Direct output to file rather than to console.
[Undefined resource string ID:0xCC]  /HTML               Output in HTML format (valid with /OUT option only).
  /RTF                Output in rich text format (valid with /OUT option only).
Options for file/console output:
  /BYTES              Show actual bytes (in hex) as instruction comments.
  /RAWEH              Show exception handling clauses in raw form.
  /TOKENS             Show metadata tokens of classes and members.
  /SOURCE             Show original source lines as comments.
  /PRETTY             This option is obsolete and no longer supported.
  /LINENUM            Include references to original source lines.
  /VISIBILITY=<vis>[+<vis>...]    Only disassemble the items with specified
          visibility. (<vis> = PUB | PRI | FAM | ASM | FAA | FOA | PSC)
  /PUBONLY            Only disassemble the public items (same as /VIS=PUB).
  /QUOTEALLNAMES      Include all names into single quotes.
  /NOCA               Suppress output of custom attributes.
  /CAVERBAL           Output CA blobs in verbal form (default - in binary form).
[Undefined resource string ID:0xDC]The following options are valid for file/console output only:
Options for EXE and DLL files:
  /UTF8               Use UTF-8 encoding for output (default - ANSI).
  /UNICODE            Use UNICODE encoding for output.
  /NOIL               Suppress IL assembler code output.
  /FORWARD            Use forward class declaration.
  /TYPELIST           Output full list of types (to preserve type ordering in round-trip).
  /PROJECT            Display .NET projection view if input is a .winmd file.
  /HEADERS            Include file headers information in the output.
  /ITEM=<class>[::<method>[(<sig>)]  Disassemble the specified item only

  /STATS              Include statistics on the image.
  /CLASSLIST          Include list of classes defined in the module.
  /ALL                Combination of /HEADER,/BYTES,/STATS,/CLASSLIST,/TOKENS

  /METADATA[=<specifier>] Show MetaData, where <specifier> is:
          MDHEADER    Show MetaData header information and sizes.
          HEX         Show more things in hex as well as words.
          CSV         Show the record counts and heap sizes.
          UNREX       Show unresolved externals.
          SCHEMA      Show the MetaData header and schema information.
          RAW         Show the raw MetaData tables.
          HEAPS       Show the raw heaps.
          VALIDATE    Validate the consistency of the metadata.

Option key is '-' or '/', options are recognized by first 3 characters

Example:  ildasm /tok /byt myfile.exe /out=myfile.il

