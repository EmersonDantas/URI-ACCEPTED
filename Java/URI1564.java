import java.io.*;
public class URI1564{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String n;
        while((n = input.readLine()) != null){
            int nint = Integer.parseInt(n);
            if (nint > 0){
                System.out.println("vai ter duas!");
            }else{
                System.out.println("vai ter copa!");
            }
        }
    }
}