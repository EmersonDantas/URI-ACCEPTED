import java.util.Scanner;
public class URI1061N{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int diaIn = Integer.parseInt(input.nextLine().replaceAll("Dia ", ""));
        String[] tempoIn = input.nextLine().replaceAll(" ", "").split(":");
        int diaFin = Integer.parseInt(input.nextLine().replaceAll("Dia ", ""));
        String[] tempoFin = input.nextLine().replaceAll(" ", "").split(":");

        //Trabalhando com os dias

        int tDias = diaFin - diaIn;

        // Trabalhando com as horas, minutos e segundos
        int horaIn = Integer.parseInt(tempoIn[0]);
        int minIn = Integer.parseInt(tempoIn[1]);
        int segIn = Integer.parseInt(tempoIn[2]);

        int horaFin = Integer.parseInt(tempoFin[0]);
        int minFin = Integer.parseInt(tempoFin[1]);
        int segFin = Integer.parseInt(tempoFin[2]);
        
        int dH = horaFin - horaIn;
        int dM = minFin - minIn;
        int dS = segFin - segIn;

        if(dS < 0){
            dS += 60;
            dM--;
        }

        if(dM < 0){
            dM += 60;
            dH--;
        }

        if(dH < 0 ){
            dH += 24;
            tDias--;
        }

        if(dH == 24){
            dH = 0;
            tDias++;
        }

        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", tDias, dH, dM, dS);
    }
}