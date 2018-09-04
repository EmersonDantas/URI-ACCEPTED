import java.util.Scanner;
public class URI2759{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String a,b,c;
        a = input.nextLine();
        b = input.nextLine();
        c = input.nextLine();
        System.out.printf("A = %s, B = %s, C = %s\nA = %s, B = %s, C = %s\nA = %s, B = %s, C = %s\n",a,b,c,b,c,a,c,a,b);
    }
}