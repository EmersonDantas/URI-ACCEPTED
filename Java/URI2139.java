import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class URI2139{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        //diasDe2016 = 366;
        int diaDeNatal = 360;
        
        int[] meses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while((entrada = input.readLine()) != null){
            String[] mesEDia = entrada.split(" ");
            int dia = Integer.parseInt(mesEDia[1]);
            int mes = Integer.parseInt(mesEDia[0]);
            int diasT = 0;
            if(mes == 12 && dia > 25){
                System.out.println("Ja passou!");
            }else if(mes == 12 && dia == 25){
                System.out.println("E natal!");
            }else if(mes == 12 && dia == 24){
                System.out.println("E vespera de natal!");
            }else{
                diasT += dia;
                for(int k = 0; k < (mes-1); k++){
                    diasT += meses[k];
                }
                System.out.println("Faltam " + (diaDeNatal-diasT) + " dias para o natal!");
            }
        }
    }
}