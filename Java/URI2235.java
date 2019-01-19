import java.util.Scanner;
public class URI2235{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if((a+b) == c || (a+c) == b || (b+c) == a || (a - b) == 0 || (a - c) == 0 || (b - c) == 0){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}