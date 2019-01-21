import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URI2523{
    public static void main(String [] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String in;
        int n;
        while((in = input.readLine()) != null){
            n = Integer.parseInt(input.readLine());
            String[] lamps = input.readLine().split(" ");
            String result = "";
            for(int j = 0; j < n; j++){
                result += in.charAt(Integer.parseInt(lamps[j])-1);
            }
            System.out.println(result);
        }
    }
}