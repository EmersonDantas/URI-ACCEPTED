import java.util.Scanner;
public class URI2160{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String texto = input.nextLine();
        System.out.println(texto.length() > 80?"NO":"YES");
    }
}