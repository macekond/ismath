#!/bin/sh

#
# Simple build script for thesis
#
# Requires 'latexmk' script installed.
#
# Author: Martin Vejmelka <martin.vejmelka@fel.cvut.cz>
#

generate_cd_listing()
{
    cd ../cd/
    tree --charset=iso-8859-2 > ../thesis/listings/cd.tex
    cd -
}

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
    dot -Tpng ./graphs/system_extensions.dot -o ./graphs/system_extensions.png
}

build_deps()
{
    build_graphs
}

if [ "$1" == "cd" ]; then # (!) run only by hand (not to overwrite custom changes)
    generate_cd_listing
    exit 0
fi

if [ "$1" == "depsonly" ]; then # only by hand now
    build_deps
    exit 0
fi

if [ "$1" == "interactive" ]; then
    latexmk -pvc
else
    latexmk
fi

#
