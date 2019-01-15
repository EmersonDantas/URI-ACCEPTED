import java.util.Scanner;
public class URI1435{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        while((n = Integer.parseInt(input.nextLine()))!= 0){
            int metade = -1;
            int num = 1;
            int diagonal = 1;
            if(n % 2 != 0){
                metade = (int) n/2;
                System.out.println("METADE="+metade);
            }
            for(int linha = 0; linha < n; linha++){
                for(int coluna = 0; coluna < n; coluna++){
                    if(linha > 0 && linha < n-1){
                        if(coluna > 0 && coluna < n-1 && (linha != metade || coluna != metade)){
                            System.out.print(diagonal+" ");
                        }else if(coluna == metade && linha == metade){ 
                            System.out.print("B ");
                        }else{
                            System.out.print("C ");
                        }
                    }else{
                        System.out.print("D ");
                    }
                }
                System.out.println();
            }
        }
    }
}