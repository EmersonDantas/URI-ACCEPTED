import java.util.Scanner;
public class URI1983{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int casos;
        double maior,nota, matricula, mm;
        maior = 0;
        mm = 0;
        casos = input.nextInt();
        for(int k = 0; k < casos;k++){
            matricula = input.nextDouble();
            nota = input.nextDouble();
            if (nota > maior && nota >= 8){
                maior = nota;
                mm = matricula;
            }
        }

        if(maior > 0){
            System.out.printf("%.0f\n",mm);
        }else{
            System.out.println("Minimum note not reached");
        }
    }
}