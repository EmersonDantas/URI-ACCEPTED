import java.util.Scanner;
import java.math.BigInteger;
public class URI2334{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        BigInteger n;
        while(!((n = input.nextBigInteger()).equals(BigInteger.valueOf(-1L)))){
            System.out.println(n.compareTo(BigInteger.valueOf(0)) > 0?n.subtract(BigInteger.valueOf(1L)):BigInteger.valueOf(0));
        }
    }
}