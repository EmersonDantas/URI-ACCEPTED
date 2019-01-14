import java.util.Scanner;
public class URI1837{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] entrada = input.nextLine().split(" ");
        int dividendo = Integer.parseInt(entrada[0]);
        int divisor = Integer.parseInt(entrada[1]);

        int a = divisor * (dividendo/divisor) + Math.abs(dividendo % divisor);
        int q = 0, r =0;

        if((dividendo < 0 && divisor > 0) || (dividendo < 0 && divisor < 0) || (dividendo > 0 && dividendo < 0)){
            for(r = 0; r < Math.abs(divisor) && a != dividendo; r++){
                for(q = -1000; q <= 1000; q++){
                    if((a = divisor * q + r) == dividendo){
                        break;
                    }
                }
            }

            r--;
        }else{
            q = dividendo/divisor;
            r = dividendo % divisor;
        }
        System.out.println(q + " " + r);
    }
}