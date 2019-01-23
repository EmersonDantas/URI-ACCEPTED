n = int(input())
for i in range(n):
    conv = input()
    rgb = input().split(" ")
    rgb = [int(i) for i in rgb]

    r = rgb[0]
    g = rgb[1]
    b = rgb[2]

    rgb.sort()
    print("Caso #%d: "%(i+1), end="")
    if(conv == "eye"):
        print(int((0.3*r)+(0.59*g)+(0.11*b)))
    elif(conv == "mean"):
        print(int((r+g+b)/3))
    elif(conv == "max"):
        print(rgb[len(rgb)-1])
    else:
        print(rgb[0])

