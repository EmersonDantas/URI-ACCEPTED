import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class URI2003{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String h;
        int ho,mm;
        while((h = input.readLine()) != null){
            String [] horas = h.split(":");
            ho = Integer.parseInt(horas[0]);
            mm = Integer.parseInt(horas[1]);
            int minTot = ((ho * 60) + mm) + 60;
            if(minTot > 480){
                System.out.printf("Atraso maximo: %d\n",minTot - 480);
            }else{
                System.out.printf("Atraso maximo: 0\n");
            }
        }
    }
}