import sys
from antlr4 import *
from CryptlangLexer import CryptlangLexer
from CryptlangParser import CryptlangParser
from CryptlangExtendListener import CryptlangExtendListener
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = CryptlangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CryptlangParser(stream)
    tree = parser.sourceUnit()
    # print(tree.toStringTree(recog=parser))
    # traverse the tree through the listener
    listener = CryptlangExtendListener(output_file=argv[2])
    walker = ParseTreeWalker()
    walker.walk(listener, tree)
    walker.walk(listener, tree)
 
if __name__ == '__main__':
    main(sys.argv)