import java.util.Scanner;
public class URI1866{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int testes = input.nextInt();
        int num;
        int res = 0;
        for(int k = 0; k<testes;k++){
            num = input.nextInt();
            res = 0;
            for(int i = 1;i<=num;i++){
                if (i%2==0){
                    res--;
                }else{   
                    res++;
                } 
            }
            System.out.println(res);
        }
    }
}