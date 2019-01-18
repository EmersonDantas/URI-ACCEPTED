import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class URI2146{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String in;
        while((in = input.readLine()) != null ){
            System.out.println(Integer.parseInt(in)-1);
        }
    }
}