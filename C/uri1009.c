#include <stdio.h>

void main(){
    char nome[50];
    double salario, vendas;
    scanf("%s %lf %lf", nome, &salario, &vendas);
    printf("TOTAL = R$ %.2lf\n", (salario + 0.15*vendas));
}