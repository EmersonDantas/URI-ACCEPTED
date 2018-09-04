import java.io.*;
import java.util.*;

public class URI1789{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int nivel;
        String c;
        while ((c = input.readLine()) != null){
            int n = Integer.parseInt(c);
            nivel = 0;
            int maior = 0;
            String lesmas = input.readLine();
            String [] l = lesmas.split(" ");
            for (int j = 0; j < n;j++){
                int lesma = Integer.parseInt(l[j]);

                if (lesma > maior){
                    maior = lesma;
                }
            }

            if(maior < 10){
                nivel = 1;
            }else if(maior >= 10 && maior < 20){
                nivel = 2;
            }else{
                nivel = 3;
            }

            System.out.println(nivel);
        }
    }
}