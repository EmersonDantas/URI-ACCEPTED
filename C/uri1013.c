#include <stdio.h>

void main(){
    int a,b,c, maior;
    scanf("%d %d %d", &a, &b, &c);
    maior = 0;
    if(a > b && a > c){
        maior = a;
    }else if (b > c && b > a){
        maior = b;
    }else{
        maior = c;
    }

    printf("%d eh o maior\n", maior);
}