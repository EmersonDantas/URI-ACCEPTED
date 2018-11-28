#include <stdio.h>

void main(){
    int valor,k;
    int notas[7] = {100, 50, 20, 10, 5, 2, 1};
    scanf("%d", &valor);
    printf("%d\n", valor);
    for(k = 0; k < 7; k++){
        printf("%d nota(s) de R$ %d,00\n", valor/notas[k], notas[k]);
        valor = valor%notas[k];
    }
}