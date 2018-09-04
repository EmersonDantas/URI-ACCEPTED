public class URI1156{
    public static void main(String[]args){
        float s = (float) 1;
        for (int i = 3, j = 2; i <= 39; i+=2, j*=2){
            s += (float) i/j;
        }System.out.printf("%.2f\n",s);
    }
}