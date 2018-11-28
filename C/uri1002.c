#include <stdio.h>

void main(){
    double n = 3.14159;
    double raio;
    scanf("%lf", &raio);
    double area = n * raio * raio;
    printf("A=%.4lf\n", area);
}