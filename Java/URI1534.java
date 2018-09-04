import java.io.*;
public class URI1534{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String n;
        while ((n = input.readLine()) != null){
            int nint = Integer.parseInt(n);
            int control = nint;
            for (int linha = 0; linha < nint; linha++){
                for (int coluna = 0; coluna < nint; coluna++){
                    if ((coluna + linha == nint-1)){
                        System.out.print(2);
                        control--;
                    }else if ((coluna - linha) == 0){
                        System.out.print(1);
                    }else{
                        System.out.print(3);
                    }
                    
                }
                System.out.println();
            }
        }

    }
}