import java.util.Scanner;
public class URI2006{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String tc;
        int cont = 0;
        tc = input.nextLine();
        
        String [] cha = input.nextLine().split(" ");

        for (int k = 0; k < 5;k++){
            if (cha[k].equals(tc)){
                cont++;
            }
        }
        System.out.println(cont);
    }
}