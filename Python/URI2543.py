import sys

for line in sys.stdin:
    entrada1 = line.split(" ")
    ng = int(entrada1[0])
    iden = int(entrada1[1])
    contra_stk_cont = 0
    for i in range(ng):
        entrada2 = input().split(" ")
        iden_new = int(entrada2[0])
        game = int(entrada2[1])
        if(iden_new == iden and game == 0):
            contra_stk_cont += 1
    
    print(contra_stk_cont)