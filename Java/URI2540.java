import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URI2540{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String ns;

        while((ns = input.readLine()) != null){
            int n = Integer.parseInt(ns);
            String[] votos = input.readLine().split(" ");
            int soma = 0;
            for(String i: votos){
                if(i.equals("1")){
                    soma++;
                }
            }

            if(soma >= (2.0/3)*n){
                System.out.println("impeachment");
            }else{
                System.out.println("acusacao arquivada");
            }
        } 
    }
}