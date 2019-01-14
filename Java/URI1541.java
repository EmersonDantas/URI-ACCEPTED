import java.util.Scanner;
public class URI1541{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        
       do{
            String[] entrada = input.nextLine().split(" ");
            a = Integer.parseInt(entrada[0]);
            if(a != 0){
                b = Integer.parseInt(entrada[1]);
                c = Integer.parseInt(entrada[2]);

                int result = (int) Math.sqrt((a*b*100)/c);
                System.out.println(result);
            }
            
        } while(a != 0);
    }
}