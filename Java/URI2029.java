import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        final double pi = 3.14;
        String volumeS;
        double volume, diametro, altura, area;
        while((volumeS = input.readLine()) != null){
            volume = Double.parseDouble(volumeS);
            diametro = Double.parseDouble(input.readLine());
            double raio = diametro/2.0;
            area = pi *(raio*raio);
            altura = volume/area;
            System.out.printf("ALTURA = %.2f\nAREA = %.2f\n",altura, area);
        }
    }
}