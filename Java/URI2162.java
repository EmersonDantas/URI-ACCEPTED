import java.util.Scanner;
public class URI2162{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] entrada = input.nextLine().split(" ");
        int j = 2;
        if(n < 2){
            System.out.println(0);
        }else{
            if(Integer.parseInt(entrada[0]) < Integer.parseInt(entrada[1])){
                for(; j <(n); j+=2){
                    if(n-j==1){
                        if(Integer.parseInt(entrada[j]) < Integer.parseInt(entrada[j-1])){
                            System.out.println(1);
                        }else{
                            System.out.println(0);
                        }
                    }else{
                        if(!(Integer.parseInt(entrada[j]) < Integer.parseInt(entrada[j+1]))){
                            System.out.println(0);
                            break;
                        }
                    }
                }
                if((j == (n-1) && n%2!=0) || (j == n && n%2==0)){
                    System.out.println(1);
                }
            }else if(Integer.parseInt(entrada[0]) > Integer.parseInt(entrada[1])){
                for(; j <(n); j+=2){
                    if(n-j==1){
                        if(Integer.parseInt(entrada[j]) > Integer.parseInt(entrada[j-1])){
                            System.out.println(1);
                        }else{
                            System.out.println(0);
                        }
                    }else{
                        if(!(Integer.parseInt(entrada[j]) > Integer.parseInt(entrada[j+1]))){
                            System.out.println(0);
                            break;
                        }
                    }
                    
                }
                if((j == (n-1) && n%2!=0) || (j == n && n%2==0)){
                    System.out.println(1);
                }
            }else{
                System.out.println(0);
            }
        } 
    }
}