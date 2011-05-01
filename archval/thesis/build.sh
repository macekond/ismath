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
    dot -Tpng ./graphs/demeter_law_types.dot -o ./graphs/demeter_law_types.png
    dot -Tpng ./graphs/global_structure.dot -o ./graphs/global_structure.png
    dot -Tpng ./graphs/graph_example.dot -o ./graphs/graph_example.png
    dot -Tpng ./graphs/demeter_graph.dot -o ./graphs/demeter_graph.png
    dot -Tpng ./graphs/validator_io_graph.dot -o ./graphs/validator_io_graph.png
    dot -Tpng ./graphs/graph_generator_io_graph.dot -o ./graphs/graph_generator_io_graph.png
    dot -Tpng ./graphs/validation_model_generator_io_graph.dot -o ./graphs/validation_model_generator_io_graph.png
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
