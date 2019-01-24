import sys

def ehPrimo(n):
    if(n == 0 or n == 1):
        return False

    cont = 0
    for i in range(1,n+1):
        if(n%i==0):
            cont += 1
        if(cont > 2):
            break
    
    return cont == 2 if True else False

for line in sys.stdin:
    n = int(line)

    if(n < 10):
        if(n == 0 or n == 1):
            print("Nada")
        elif(ehPrimo(n)):
            print("Super")
        else:
            print("Nada")
    else:
        ns = str(n)
        cont = 0
        ehP = ehPrimo(n)

        if(ehP):
            for i in range(len(ns)):
                if(ehPrimo(int(ns[i]))):
                    cont += 1
                else:
                    break
        
        if(cont == len(ns) and ehP):
            print("Super")
        elif(ehP):
            print("Primo")
        else:
            print("Nada")