import java.util.Scanner;
public class URI1929{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        String resultado = "N";

        if(((Math.abs(b - c)) < a && a < (b + c)) &&
            ((Math.abs(a - c)) < b && b < (a + c)) &&
            ((Math.abs(a - b)) < c && c < (a + b))){
            resultado = "S";
            //ABC

        }else if(((Math.abs(c - d)) < a && a < (c + d)) &&
        ((Math.abs(a - d)) < c && c < (a + d)) &&
        ((Math.abs(a - c)) < d && d < (a + c))){
            resultado = "S";
            //ACD

        }else if(((Math.abs(c - d)) < b && b < (c + d)) &&
        ((Math.abs(b - d)) < c && c < (b + d)) &&
        ((Math.abs(b - c)) < d && d < (b + c))){
            resultado = "S";
            //BCD
            
        }else if(((Math.abs(b - d)) < a && a < (b + d)) &&
        ((Math.abs(a - d)) < b && b < (a + d)) &&
        ((Math.abs(a - b)) < d && d < (a + b))){
            resultado = "S";
            //ABD

        }
        System.out.println(resultado);
        
    }
}