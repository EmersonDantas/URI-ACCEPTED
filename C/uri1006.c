#include <stdio.h>
void main(){
    double a,b,c;
    scanf("%lf %lf %lf", &a, &b, &c);
    printf("MEDIA = %.1lf\n", (a*2 + b*3 + c*5)/10);
}