import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class URI1959{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String [] entrada = input.readLine().split(" ");
        long n = Integer.parseInt(entrada[0]);
        long l = Integer.parseInt(entrada[1]);
        System.out.println(n*l);
    }
}