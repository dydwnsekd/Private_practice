import sys

n = int(sys.stdin.readline())

for i in range(n):
    a, b = list(map(int, sys.stdin.readline().split(" ")))
    print ("Case #%d: %d" % (i+1, a+b))