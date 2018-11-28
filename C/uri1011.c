#include <stdio.h>

void main(){
    double pi = 3.14159;
    double raio;
    scanf("%lf", &raio);
    printf("VOLUME = %.3lf\n", ((4.0/3)*pi*raio*raio*raio));
}