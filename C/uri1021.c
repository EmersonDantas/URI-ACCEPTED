#include <stdio.h>
#include <math.h>

void main(){
    double valor, calc;
    scanf("%lf", &valor);
    double valores[12] = {100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.10, 0.05, 0.01};
    int k;
    for(k = 0; k < 12; k++){
        calc = valor/valores[k];
        if(k == 0) printf("NOTAS:\n");
        if(k == 6) printf("MOEDAS:\n");
        if(k < 6){
            printf("%d nota(s) de R$ %.2lf\n", (int) calc, valores[k]);
        }else if(k == 11){
            printf("%.0lf moeda(s) de R$ %.2lf\n", calc, valores[k]);
        }else{
            printf("%d moeda(s) de R$ %.2lf\n", (int) calc, valores[k]);
        }
        valor = fmod(valor,valores[k]);
    }
}