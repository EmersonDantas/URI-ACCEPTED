import java.util.Scanner;
public class URI2685{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            int m = Integer.parseInt(input.nextLine());

            if(m >= 0 && m <= 360){
                if(m >= 0 && m < 90 || m == 360){
                    System.out.println("Bom Dia!!");
                }else if(m >= 90 && m < 180){
                    System.out.println("Boa Tarde!!");
                }else if(m >= 180 && m < 270){
                    System.out.println("Boa Noite!!");
                }else{
                    System.out.println("De Madrugada!!");
                }
            } 
        }
    }
}