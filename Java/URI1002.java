import java.util.Scanner;

public class URI1002 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        double raio = input.nextDouble();
        double area = (raio * raio) * pi;
        System.out.printf("A=%.4f\n",area);
    }
}
