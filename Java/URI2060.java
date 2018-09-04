import java.util.Scanner;
public class URI2060{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int m2,m3,m4,m5;
        m2 = 0;m3 = 0;m4 = 0;m5 = 0;
        int n = Integer.parseInt(input.nextLine());
        String [] nums = input.nextLine().split(" ");

        for(int k = 0; k < nums.length;k++){
            int numero = Integer.parseInt(nums[k]);
            if (numero % 2 == 0){
                m2++;
            }if (numero % 3 == 0){
                m3++;
            }if (numero % 4 == 0){
                m4++;
            }if (numero % 5 == 0){
                m5++;
            }
        }
        System.out.printf("%d Multiplo(s) de 2\n%d Multiplo(s) de 3\n%d Multiplo(s) de 4\n%d Multiplo(s) de 5\n",m2,m3,m4,m5);
    }
}