import sys

h, m = list(map(int, sys.stdin.readline().split(" ")))

if m >= 45:
    m = m - 45
else:
    h = h - 1
    m = m+60-45

print(h, m)