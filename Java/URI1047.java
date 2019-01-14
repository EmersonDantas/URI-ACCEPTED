import java.util.Scanner;
public class URI1047{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] tempos = input.nextLine().split(" ");
        int hIn, mIn, hFin, mFin, dMin, dH;

        hIn = Integer.parseInt(tempos[0]);
        mIn = Integer.parseInt(tempos[1]);
        hFin = Integer.parseInt(tempos[2]);
        mFin = Integer.parseInt(tempos[3]);

        dH = hFin - hIn; //Faço a diferença de horas

        dMin = mFin - mIn; //Faço a diferença de minutos

        if((dH < 0 && dMin != 0) || (dH == 0 && dMin <= 0)){ 
            dH += 24;
        }

        if(dMin < 0){
            dH--;
            dMin += 60;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",dH, dMin);
    }
}