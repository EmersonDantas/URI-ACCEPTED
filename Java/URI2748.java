public class URI2748{
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
                if (k == 9){
                    System.out.print("Roberto");
                    k += 6;
                }else if (k == 87){
                    System.out.print("5786");
                    k+=3;
                }else if (k == 165){
                    System.out.print("UNIFEI");
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


/* else{
                if (k == 2){
                    System.out.println(" Roberto |");
                    k += 27;
                }else if (k == 41){
                    System.out.println(" |");
                    k += 35;
                }else if (k == 80){
                    System.out.println(" 5786 |");
                    k+=30;
                }else if (k == 119){
                    System.out.println(" |");
                    k+=35;
                }else if (k == 158){
                    System.out.println(" UNIFEI |");
                    k+=28;
                }else{
                    System.out.println(" ");
                }
            } */