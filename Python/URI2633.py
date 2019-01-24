import sys

def insertionSort(A):
    for j in range(1,len(A)):
        key = A[j]
        i = j-1 
        while (i > -1) and int(key[1]) < int(A[i][1]):
            A[i+1]=A[i] 
            i=i-1 
        A[i+1] = key

for line in sys.stdin:
    n = int(line)
    carnesEv = []
    for i in range(n):
        entrada = input().replace("\n","").split(" ")
        carnesEv.append(entrada)
    insertionSort(carnesEv)
    for i in range(len(carnesEv)-1):
        print(carnesEv[i][0], end=" ")
    print(carnesEv[len(carnesEv)-1][0])