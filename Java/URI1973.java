import java.util.Scanner;

import java.util.ArrayList;
public class URI1973{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long numSitios = Integer.parseInt(input.nextLine());
        String[] numCarneirosPorSitio = input.nextLine().split(" ");
        long numCarneiros = 0L;
        for(int k = 0; k < numSitios; k++){
            numCarneiros += Long.parseLong(numCarneirosPorSitio[k]);
        }
        int i = 0;
        boolean voltou = false;
        int sitiosVisitados = 0;
        while(i >= 0 && i < numSitios ){ 
            long q = Long.parseLong(numCarneirosPorSitio[i]);
            if(q > 0){
                numCarneiros--;
                if(!voltou){
                    sitiosVisitados++;
                }
                numCarneirosPorSitio[i] = Long.toString(Long.parseLong(numCarneirosPorSitio[i])-1);
            }

            if(q % 2 == 0){
                i--;
                voltou = true;
            }else{
                i++;
            }
        }

        System.out.println(sitiosVisitados + " " + numCarneiros);
    }
}