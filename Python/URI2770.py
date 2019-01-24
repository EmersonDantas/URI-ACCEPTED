import sys

for line in sys.stdin:
    entrada1 = line.replace("\n","").split(" ")
    dimEmpA = int(entrada1[0])
    dimEmpB = int(entrada1[1])
    numT = int(entrada1[2])
    for i in range(numT):
        entrada2 = input().replace("\n","").split(" ")
        dimUsA = int(entrada2[0])
        dimUsB = int(entrada2[1])
        if((dimUsA <= dimEmpA or (dimUsA <= dimEmpB and dimUsB <= dimEmpA)) and (dimUsB <= dimEmpB or (dimUsB <= dimEmpA and dimUsA <= dimEmpB))):
            print("Sim")
        else:
            print("Nao")