#include <stdio.h>

void main(){
    int km;
    double comb;
    scanf("%d %lf", &km, &comb);
    printf("%.3lf km/l\n", km/comb);
}