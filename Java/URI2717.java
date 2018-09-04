import java.util.Scanner;
public class URI2717{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int temp,ba,bb;
        temp = input.nextInt();
        ba = input.nextInt();
        bb = input.nextInt();
        if(ba+bb > temp){
            System.out.println("Deixa para amanha!");
        }else{
            System.out.println("Farei hoje!");
        }
    }
}