#!/bin/sh

#
# Simple build script for thesis
#
# Requires 'latexmk' script installed.
#
# Author: Martin Vejmelka <martin.vejmelka@fel.cvut.cz>
#

dot -Tpng ./graphs/oop_design_principles.dot -o ./graphs/oop_design_principles.png
latexmk

#
