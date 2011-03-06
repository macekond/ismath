#!/bin/sh

#
# Simple build script for thesis
#
# Requires 'latexmk' script installed.
#
# Author: Martin Vejmelka <martin.vejmelka@fel.cvut.cz>
#

build_graphs()
{
    dot -Tpng ./graphs/oop_design_principles.dot -o ./graphs/oop_design_principles.png
    dot -Tpng ./graphs/java_top_elements.dot -o ./graphs/java_top_elements.png
    dot -Tpng ./graphs/toplevel_types.dot -o ./graphs/toplevel_types.png
}

build_deps()
{
    build_graphs
    # build_svg_images
    # ...
}

build_deps
[ "$1" == "depsonly" ] && exit 0

if [ "$1" == "interactive" ]; then
    latexmk -pvc
else
    latexmk
fi

#
