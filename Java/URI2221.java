import java.util.Scanner;

public class URI2221{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int t, b, ai1, di1, li1, ai2, di2, li2, p1, p2;

        t = input.nextInt();

        for(int k = 0; k < t; k++){
            p1 = 0;
            p2 = 0;
            b = input.nextInt();
            ai1 = input.nextInt();
            di1 = input.nextInt();
            li1 = input.nextInt();

            ai2 = input.nextInt();
            di2 = input.nextInt();
            li2 = input.nextInt();

            if(li1%2==0){
                p1 += b;
            }

            if(li2%2==0){
                p2 += b;
            }

            p1 += (ai1 + di1)/2;
            p2 += (ai2 + di2)/2;

            if(p1 > p2){
                System.out.println("Dabriel");
            }else if(p1 == p2){
                System.out.println("Empate");
            }else{
                System.out.println("Guarte");
            }
        }
    }
}