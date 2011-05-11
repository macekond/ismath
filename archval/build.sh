#!/bin/sh

#
# This script should build complete distribution
# - paper
# - cd
# - software
#
# Author: Martin Vejmelka <martin.vejmelka@fel.cvut.cz>
#

cp ./thesis/archval.pdf ./cd/text/
cp -a project/av-core/build/javadoc/ ./cd/html/

#
