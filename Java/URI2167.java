import java.util.Scanner;
public class URI2167{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] entrada = input.nextLine().split(" ");
        if(n >= 2){
            int k = 0;
            for(; k < (n-1); k++){
                if(Integer.parseInt(entrada[k]) > Integer.parseInt(entrada[k+1])){
                    System.out.println(k+2);
                    k=-1;
                    break;
                }
            }
            if(k == (n-1)){
                System.out.println(0);
            }
        }else{
            System.out.println(0);
        }
    }
}