import sys

for line in sys.stdin:
    n = int(line)
    if(n <= 1):
        print(0)
    else:
        soma = 1
        cont = 0;
        for i in range(n):
            soma *= 2
            cont += 1
            if(soma == n):
                break
        print(cont)