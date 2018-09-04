import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class URI1914{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(input.readLine());
        String nome1, escolha1, nome2, escolha2, vencedor;
        String [] dados, numeros;
        int num1,num2;
        for (int i = 0; i < casos; i++){
            dados = input.readLine().split(" ");

            nome1 = dados[0];
            escolha1 = dados[1];
            nome2 = dados[2];
            escolha2 = dados[3];

            numeros = input.readLine().split(" ");
            num1 = Integer.parseInt(numeros[0]);
            num2 = Integer.parseInt(numeros[1]);

            if((num1+num2) % 2 == 0){
                vencedor = "PAR";
            }else{
                vencedor = "IMPAR";
            }

            if(escolha1.equals(vencedor)){
                System.out.println(nome1);
            }else{
                System.out.println(nome2);
            }
        }
    }
}