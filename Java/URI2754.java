import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
public class URI2754{
    public static void main(String[]args){
        DecimalFormat DF = new DecimalFormat("9E9");
        DecimalFormat df = new DecimalFormat("9e9");
        double a,b;
        a = 234.345;
        b = 45.698;
        System.out.printf("%.6f - %.6f\n",a,b);
        System.out.printf("%.0f - %.0f\n",a,b);
        System.out.printf("%.1f - %.1f\n",a,b);
        System.out.printf("%.2f - %.2f\n",a,b);
        System.out.printf("%.3f - %.3f\n",a,b);
        System.out.printf("%s - %s\n",df.format(a),df.format(b));
        System.out.printf("%s - %s\n",DF.format(a),DF.format(b));
        System.out.printf("%.3f - %.3f\n",a,b);
        System.out.printf("%.3f - %.3f\n",a,b);
    }
}