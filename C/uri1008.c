#include <stdio.h>

void main(){
    int num, qhoras;
    double valor;

    scanf("%d %d %lf", &num, &qhoras, &valor);
    printf("NUMBER = %d\nSALARY = U$ %.2lf\n", num, (qhoras*valor));
}