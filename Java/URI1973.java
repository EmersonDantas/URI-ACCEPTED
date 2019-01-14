/*/import java.util.Scanner;
public class URI1973{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n,roubados,carneirosApos, carneirosAntes,sobra,parou;
        sobra = 0;
        carneiros = 0;
        roubados = 0;
        n = Integer.parseInt(input.nextLine());
        String [] seila = input.nextLine().split(" ");

        int cont = 0;
        while(cont < seila.length && cont >= 0){
            carneirosApos = Integer.parseInt(seila[cont+1]);
            carneirosAntes = Integer.parseInt(seila[cont-1]);
            if (carneirosApos % 2 > 0){
                if (carneiros > 0){
                    System.out.println("Oi1");
                    roubados++;
                    seila[cont] = Integer.toString(carneiros-1);
                    cont++;
                }else{
                    System.out.println("Oi2");
                    cont++;
                }

            }else{
                System.out.println("Oi3");
                if (carneiros > 0){
                    roubados++;
                    seila[cont] = Integer.toString(carneiros-1);
                    cont--;
                }else{
                    cont--;
                }
                
            }

        }

        for (int k = 0; k < seila.length;k++){
            sobra += Integer.parseInt(seila[k]);
        }


        System.out.printf("%d %d\n",roubados,sobra);
    }
}*/