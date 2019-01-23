a = int(input())
b = int(input())
c = int(input())

if(((2*b) + (4*c)) > ((2*a) + (2*c)) < ((4*a)+(2*b))):
    print((2*a) + (2*c))
elif(((2*a) + (2*c)) > ((2*b) + (4*c)) < ((4*a)+(2*b))):
    print((2*b) + (4*c))
elif(((2*a) + (2*c)) > ((4*a)+(2*b)) < ((2*b) + (4*c))):
    print((4*a)+(2*b))
else:
    print((2*a) + (2*c))