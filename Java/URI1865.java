import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class URI1865{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int testes = Integer.parseInt(input.readLine());
        String [] nomeEForca;
        for ( int k = 0; k < testes;k++){
            nomeEForca = input.readLine().split(" ");
            if (nomeEForca[0].equals("Thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}