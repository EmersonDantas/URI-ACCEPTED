import java.util.Scanner;
public class URI1150{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int x,z, soma, cont;
        cont = 1;
        x = input.nextInt();
        z = input.nextInt();
        while (z <= x){
            z = input.nextInt();
        }
        soma = x;
        
        while(soma <= z){
            soma+= ++x;
            cont++;
        }
        System.out.println(cont);

    }
}