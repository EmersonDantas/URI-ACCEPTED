#include <stdio.h>

void main(){
    int CACHORRO_QUENTE = 1;
    int X_SALADA = 2;
    int X_BACON = 3;
    int TORRADA_SIMPLES = 4;
    int REFRIGERANTE = 5;

    int cod,quant;
    double total;
    scanf("%d %d", &cod, &quant);
    if(cod == CACHORRO_QUENTE){
        total = quant * 4;
    }else if(cod == X_SALADA){
        total = quant * 4.5;
    }else if(cod == X_BACON){
        total = quant * 5;
    }else if(cod == TORRADA_SIMPLES){
        total = quant * 2;
    }else if(cod == REFRIGERANTE){
        total = quant * 1.5;
    }

    printf("Total: R$ %.2lf\n", total);
}