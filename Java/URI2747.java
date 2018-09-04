public class URI2747{
    public static void main(String[]args){
        int cont = 0;
        for(int k = 0; k < 39;k++){
            System.out.print("-");
        }
        System.out.println();
        for(int k = 0;k < 195;k++){
            cont++;
            if((cont == 1 || cont == 40 || cont == 79 || cont == 118 || cont == 157 || cont == 196 || cont == 39 || cont == 78 || cont == 117 || cont == 156 || cont == 195)){
                if (cont == 195 || cont == 1 || cont == 40 || cont == 79 || cont == 118 || cont == 157 || cont == 196){
                    System.out.print("|");
                }else{
                    System.out.print("|\n");
                }
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int k = 0; k < 39;k++){
            System.out.print("-");
        }
        System.out.println();

    }
}