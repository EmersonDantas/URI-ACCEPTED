#include <stdio.h>

void main(){
    int cod, quant;
    double valor;
    double soma = 0;
    int k;
    for(k = 0; k<2; k++){
        scanf("%d %d %lf", &cod, &quant, &valor);
        soma += quant*valor;
    }

    printf("VALOR A PAGAR: R$ %.2lf\n", soma);
}