import sys

for line in sys.stdin:
    n = int(line)
    r = 0
    for i in range(n):
        duin, diin = input().split(" ")
        rin = int(diin)/int(duin)
        if(rin > r):
            r = rin
            print(i+1)