import java.util.Scanner;
public class URI1160{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int cont = 0;
        for (int k = 0; k < t; k++){
            cont = 0;
            int PA = input.nextInt();
            int PB = input.nextInt();
            double G1 = input.nextDouble();
            double G2 = input.nextDouble();

            while(PA <= PB){
                PA += PA * (G1/100);
                PB += PB * (G2/100);
                cont ++;
                if (cont > 100){
                    break;
                }
            }

            if (cont > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println(cont+" anos.");
            }
            

        }
    }
}