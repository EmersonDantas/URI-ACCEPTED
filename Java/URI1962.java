import java.util.Scanner;
public class URI1962{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n,ano,diferenca;
        String c;
        n = input.nextInt();
        for (int k = 0; k < n; k++){
            ano = input.nextInt();
            diferenca = ano - 2014;
            if (diferenca <= 0){
                ano = Math.abs(diferenca)+1;
                c = "D.C.";
            }else{
                c = "A.C.";
                ano = diferenca;
            }
            System.out.println(ano+" "+c);
        }
    }
}