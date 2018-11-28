#include <stdio.h>

void main(){
    int tempo, km;
    scanf("%d %d", &tempo, &km);
    printf("%.3lf\n", (tempo * km)/12.0);
}