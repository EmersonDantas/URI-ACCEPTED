import java.util.Scanner;
public class URI1957{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();
        int resto,indiceLetra;
        String hexa = "";
        String [] hexaList = {"A", "B", "C", "D", "E", "F"};

        while (entrada > 0){
            resto = entrada % 16;
            entrada = (int) entrada / 16;

            if (resto >= 10){
                indiceLetra = resto - 10;
                hexa += hexaList[indiceLetra];
            }else{
                hexa += Integer.toString(resto);
            }
        }
        System.out.println(new StringBuilder(hexa).reverse());//Revertendo String
    }
}