public class URI2753{
    public static void main(String[]args){
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        for(int k = 97; k <= 122; k++){
            System.out.printf("%d e %s\n",k,alfabeto.charAt(k-97));
        }
    }
}