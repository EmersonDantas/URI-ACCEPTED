import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URI2674{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String ns;
        int n;
        while((ns = input.readLine()) != null){
            n = Integer.parseInt(ns);
            if(n < 10){
                if(n == 0 || n == 1){
                    System.out.println("Nada");
                }else if(ehPrimo(n)){
                    System.out.println("Super");
                }else{
                    System.out.println("Nada");
                }
            }else{
                int cont = 0;
                boolean ehP = ehPrimo(n);

                if(ehP){
                    for (int i = 0; i < ns.length(); i++){
                        if(ehPrimo(ns.charAt(i) - '0')){
                            cont++;
                        }else{
                            break;
                        }
                    }
                }
                
                if(cont == ns.length() && ehP){
                    System.out.println("Super");
                }else if(ehP){
                    System.out.println("Primo");
                }else{
                    System.out.println("Nada");
                }  
            }
        }
    }

    public static boolean ehPrimo(int n){
        if(n == 0 || n == 1){
            return false;
        }
    
        int cont = 0;
        for(int k = 1; k <= n; k++){
            if(n%k==0){
                cont++;
            }
    
            if(cont > 2){
                return false;
            }
        }
    
        return true;
    }
}

