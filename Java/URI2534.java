import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class URI2534{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n, q;
        String entrada;
        while((entrada = input.readLine()) != null){
            String[] entradaS = entrada.split(" ");

            n = Integer.parseInt(entradaS[0]); // Número de habitantes
            q = Integer.parseInt(entradaS[1]); // Número de consultas

            List<Integer> notas = new ArrayList<>();
            for(int a = 0; a < n; a++){
                notas.add(Integer.parseInt(input.readLine()));
            }
            Collections.sort(notas);
            Collections.reverse(notas);
            for(int b = 0; b < q; b++){
                System.out.println(notas.get(Integer.parseInt(input.readLine())-1));
            }
        }
    }
}