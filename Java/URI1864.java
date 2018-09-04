import java.util.Scanner;
public class URI1864{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int indice = input.nextInt();
        
        for(int k = 0; k < indice; k++){
            System.out.print(frase.charAt(k));
        }
        System.out.println();
    }
}