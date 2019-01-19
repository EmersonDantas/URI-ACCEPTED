import java.util.Scanner;
public class URI2313{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        boolean valido = false;;

        if(Math.abs(b-c) < a && a < (b+c) ||
            Math.abs(a-c) < b && b < (a+c) ||
            Math.abs(a-b) < c && c < (a+b)){
                valido = true;
        }

        if(valido){
            if(a == b && b == c){
                System.out.println("Valido-Equilatero");
            }else if((a == b && b != c) || (b == c && c != a) || (c == a && c != b)){
                System.out.println("Valido-Isoceles");
            }else if(a != b && b != c && a != c){
                System.out.println("Valido-Escaleno");
            }

            int maior = a;
            int cateto1, cateto2;
            cateto1 = b;
            cateto2 = c;
            if(b > maior && b > c){
                maior = b;
                cateto1 = a;
                cateto2 = c;
            }else if(c > maior && c > b){
                maior = c;
                cateto1 = a;
                cateto2 = b;
            }

            if((maior*maior) == ((cateto1*cateto1)+(cateto2*cateto2))){
                System.out.println("Retangulo: S");
            }else{
                System.out.println("Retangulo: N");
            }

        }else{
            System.out.println("Invalido");
        }
    }
}