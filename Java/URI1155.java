public class URI1155{
    public static void main(String[]args){
        float s = (float) 0;
        for (int k = 1; k <= 100; k++){
            s += (float) 1/k;
        }
        System.out.printf("%.2f\n",s);
    }
}