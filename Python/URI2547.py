import sys

for line in sys.stdin:
    entrada1 = line.split(" ")
    n = int(entrada1[0])
    amin = int(entrada1[1])
    amax = int(entrada1[2])
    cont = 0
    for i in range(n):
        a = int(input())
        if(amin <= a <= amax):
            cont += 1

    print(cont)