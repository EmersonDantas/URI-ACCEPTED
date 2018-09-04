import java.util.Scanner;
public class URI1963{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a,b,aumento;
        a = input.nextDouble();b = input.nextDouble();
        aumento = ((b - a)/a)*100;
        System.out.printf("%.2f%%\n",aumento);
    }
}