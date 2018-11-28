#include <stdio.h>
#include <math.h>

void main(){
    double a,b,c;
    scanf("%lf %lf %lf", &a,&b,&c);
    double delta = b*b -4 * a * c;
    
    if(a == 0 || delta < 0){
        printf("Impossivel calcular\n");
    }else{
        printf("R1 = %.5lf\n",(-b+sqrt(delta))/(2*a));
        printf("R2 = %.5lf\n",(-b-sqrt(delta))/(2*a));
    }
}