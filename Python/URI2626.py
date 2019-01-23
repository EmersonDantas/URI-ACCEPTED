import sys
PEDRA = "pedra"
PAPEL = "papel"
TESOURA = "tesoura"

for line in sys.stdin:
    entrada = line.split(" ")
    dodo = entrada[0]
    leo = entrada[1]
    papper = entrada[2].replace("\n","")

    if(((dodo == leo and leo != papper) and ((dodo == PEDRA and papper == TESOURA) or (dodo == PAPEL and papper == PEDRA) or (dodo == TESOURA and papper == PAPEL))) or 
    ((dodo == papper and leo != papper)  and ((dodo == PEDRA and leo == TESOURA) or (dodo == PAPEL and leo == PEDRA) or (dodo == TESOURA and leo == PAPEL))) or 
    ((leo == papper and dodo != papper) and ((leo == PEDRA and dodo == TESOURA) or (leo == PAPEL and dodo == PEDRA) or (leo == TESOURA and dodo == PAPEL))) or
    (dodo == leo and leo == papper) or (dodo != leo and leo != papper and dodo != papper)):
        print("Putz vei, o Leo ta demorando muito pra jogar...")
    else:
        if((dodo == PEDRA and leo == TESOURA and papper == TESOURA) or
            (dodo == PAPEL and leo == PEDRA and papper == PEDRA) or
            (dodo == TESOURA and leo == PAPEL and papper == PAPEL)):
            print("Os atributos dos monstros vao ser inteligencia, sabedoria...")
        elif((leo == PEDRA and dodo == TESOURA and papper == TESOURA) or
            (leo == PAPEL and dodo == PEDRA and papper == PEDRA) or
            (leo == TESOURA and dodo == PAPEL and papper == PAPEL)):
            print("Iron Maiden's gonna get you, no matter how far!")
        else:
            print("Urano perdeu algo muito precioso...")

    


