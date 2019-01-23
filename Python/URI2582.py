musicas = ["PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"]
n = int(input())

for i in range(n):
    entrada = input().split()
    soma = int(entrada[0]) + int(entrada[1])
    print(musicas[soma])
