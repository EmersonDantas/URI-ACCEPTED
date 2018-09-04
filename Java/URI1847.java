import java.util.Scanner;
public class URI1847{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
        String carinha = "";
        int d1 = t2 - t1;
        int d2 = t3 - t2;

        if ((t1 > t2 && (t2 < t3 || t3 == t2)) || 
            (t1 < t2 && t2 < t3 && d2 >= d1) 
            || (t1 > t2 && t2 > t3 && d1 < d2) || 
            (t1 == t2 && t2 < t3)){
                carinha = ":)";
        }else{
                carinha = ":(";
        }
        System.out.println(carinha);
        input.close();
    }
}