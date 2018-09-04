import java.util.*;

public class URI1848{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int gritos = 0;
        int resultado = 0;

        while(gritos < 3){
            String corvo = input.nextLine();

            if (corvo.equals("caw caw")){
                System.out.println(resultado);
                gritos++;
                resultado = 0;
            }else{
                String bin = corvo.replace("*","1");
                String binario = bin.replace("-","0");
                int soma = 0;
                int cont = 2;

                for (int k = 0; k < 3; k++, cont--){                    
                    char aff = binario.charAt(cont);
                    String gambi = Character.toString(aff);
                    int b = Integer.parseInt(gambi);
                    soma += b * Math.pow(2,k);

                }
                resultado += soma;

                
            }
        }
    }
}