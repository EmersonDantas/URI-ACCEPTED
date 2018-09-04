public class URI2749{
    public static void main(String[]args){
        for(int k = 0; k < 39;k++){
            System.out.print("-");
        }
        System.out.println();
        for(int k = 0;k < 195;k++){
            if((k == 0 || k == 38 || k == 77 || k == 116 || k == 155 || k == 194 || k == 39 || k == 78 || k == 117 || k == 156 || k == 194)){
                if (k == 0 || k == 39 || k == 78 || k == 117 || k == 156){ // Linha Esquerda
                    System.out.print("|");
                }else{
                    System.out.print("|\n");
                }
            }else{
                if (k == 1){
                    System.out.print("x = 35");
                    k+=5;
                }else if (k == 94){
                    System.out.print("x = 35");
                    k+=5;
                }else if (k == 188){
                    System.out.print("x = 35");
                    k+=5;
                }else{
                    System.out.print(" ");
                }
            }
        }
        for(int k = 0; k < 39;k++){
            System.out.print("-");
        }
        System.out.println();

    }
}