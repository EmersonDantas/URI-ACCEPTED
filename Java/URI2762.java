import java.util.Scanner;
public class URI2762{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String [] num = n.split("[\\W]");
        System.out.println(Integer.parseInt(num[1])+"."+num[0]);
    }
}