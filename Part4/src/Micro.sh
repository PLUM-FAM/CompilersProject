#!/bin/bash
arg=$1
java -Xmx500M -cp "/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool Plum.g4
javac *.java
java CompilerDriver "$arg"