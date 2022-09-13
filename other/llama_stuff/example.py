"""
Any python - one method that will have test coverage and one that won't.
"""
import sys

def no_code_coverage():
    return 0
    
def code_coverage():
    return 1

def main():
    print(code_coverage())

if __name__ == '__main__':
    sys.exit(main())