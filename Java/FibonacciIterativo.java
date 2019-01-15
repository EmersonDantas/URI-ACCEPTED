import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FibonacciIterativo{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String ns;
        int n;
        while(!(ns = input.readLine()).equals("")){
            n = Integer.parseInt(ns);
            int penultimo = 0, ultimo = 1, proximo = 0;
            System.out.print("0 ");
            for(int k = 0; k < n; k++){
                System.out.print(ultimo+" ");
                proximo = penultimo + ultimo;
                penultimo = ultimo;
                ultimo = proximo;
            }
            System.out.println();
        }
    }
}