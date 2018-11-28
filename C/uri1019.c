#include <stdio.h>

void main(){
    int valor;
    scanf("%d", &valor);
    int horas, minutos, segundos;
    horas = valor/3600;
    valor = valor%3600;
    minutos = valor/60;
    segundos = valor%60;
    printf("%d:%d:%d\n",horas, minutos, segundos);
}