import sys
from antlr4 import *
from CryplangLexer import CryplangLexer
from CryplangParser import CryplangParser
from CryplangExtendListener import CryplangExtendListener
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = CryplangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CryplangParser(stream)
    tree = parser.sourceUnit()
    # print(tree.toStringTree(recog=parser))
    # traverse the tree through the listener
    listener = CryplangExtendListener(output_file=argv[2])
    walker = ParseTreeWalker()
    walker.walk(listener, tree)
    walker.walk(listener, tree)
 
if __name__ == '__main__':
    main(sys.argv)