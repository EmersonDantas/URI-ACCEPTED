#include <stdio.h>
#include <stdlib.h>

int ehPrimo(int n){
    if(n == 0 || n == 1){
        return 0;
    }

    int cont = 0;
    for(int k = 1; k <= n; k++){
        if(n%k==0){
            cont++;
        }

        if(cont > 2){
            return 0;
        }
    }

    return 1;
}

int contaDigitos(int valor){
    int contaDigitos = 0;

    while (valor != 0){
        contaDigitos++;
        valor = valor / 10;
    }
    return contaDigitos;
}

void main(){
    int n;
    while(scanf("%d", &n) != EOF){
        if(n < 10){
            if(n == 0 || n == 1){
                printf("Nada\n");
            }
                
            else if(ehPrimo(n)){
                printf("Super\n");
            }else{
                printf("Nada\n");
            }
        }else{
            int t = 10;
            t = contaDigitos(n);
            char y[t] = "";
            sprintf(y, "%i", n);
            int cont = 0;
            int ehP = ehPrimo(n);

            if(ehP){
                for (int i = 0; i < sizeof(y); i++){
                    char u[1] = b;
                    if(ehPrimo(atoi(u))){
                        cont++;
                    }else{
                        break;
                    }
                }
            }
            
            if(cont == sizeof(y) && ehP){
                printf("Super\n");
            }else if(ehP){
                printf("Primo\n");
            }else{
                printf("Nada\n");
            }  
        }
    }
}