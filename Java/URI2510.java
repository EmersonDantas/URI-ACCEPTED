import java.util.Scanner;
public class URI2510{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        for(int k = 0; k < n; k++){
            System.out.println(input.nextLine().equals("Batmain")?"N":"Y");
        }
    }
}