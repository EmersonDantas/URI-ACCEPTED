import java.util.Scanner;
public class URI1179{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] vPar = new int [5];
        int [] vImpar = new int [5];

        int contPar = 0;
        int contImpar = 0;

        for (int k = 0; k < 15; k++){
            int n = input.nextInt();
            if (n % 2 == 0){
                vPar[contPar] = n;
                contPar++;
            }else{
                vImpar[contImpar] = n;
                contImpar++;
            }

            if (contPar == 5){
                contPar = 0;
                for (int j = 0; j < vPar.length;j++){
                    System.out.printf("par[%d] = %d\n",j,vPar[j]);
                }
            }else if(contImpar == 5){
                contImpar = 0;
                for (int i = 0; i < vImpar.length;i++){
                    System.out.printf("impar[%d] = %d\n",i,vImpar[i]);
                }
            }
        }

        for (int k = 0; k < contImpar;k++){
            System.out.printf("impar[%d] = %d\n",k,vImpar[k]);
        }

        for (int k = 0; k < contPar;k++){
            System.out.printf("par[%d] = %d\n",k,vPar[k]);
        }
    }
}