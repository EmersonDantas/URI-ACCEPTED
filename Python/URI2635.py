n = int(input())
palavras = []
for i in range(n):
    palavras.append(input())

p = int(input())
for i in range(p):
    teste = input()
    cont = 0
    maior = ""
    for p in palavras:
        if(teste in p):
            cont += 1
            if(len(p) > len(maior)):
                maior = p
    if(cont > 0):
        print("%d %d"%(cont, len(maior)))
    else:
        print(-1)