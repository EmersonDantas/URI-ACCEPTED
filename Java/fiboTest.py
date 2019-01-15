n = int(input())
ultimo = 1
penultimo = 0
proximo = 0
print("0",end=" ")
for i in range(n):
    print(ultimo,end=" ")
    proximo = penultimo + ultimo
    penultimo = ultimo
    ultimo = proximo
    
print()