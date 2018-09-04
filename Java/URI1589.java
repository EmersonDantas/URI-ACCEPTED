import java.util.Scanner;
public class URI1589{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int k = 0; k < t;k++){
            int r1 = input.nextInt();
            int r2 = input.nextInt();
            int conduit = (r1 + r2);
            System.out.println(conduit);
        }
    }
}