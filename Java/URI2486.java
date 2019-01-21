import java.util.Scanner;

public class URI2486{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t, n;
        String vit;
        String[] vitas = {"suco de laranja", "morango fresco", "mamao", "goiaba vermelha", "manga", "laranja", "brocolis"};
        int[] qvitas = {120, 85, 85, 70, 56, 50, 34};
        while((t = Integer.parseInt(input.nextLine())) != 0){
            int totVita = 0;
            for(int k = 0; k < t; k++){
                String entrada = input.nextLine();
                String num = "";
                for(int j = 0; j < entrada.length(); j++){
                    if(Character.isSpaceChar(entrada.charAt(j))){
                        break;
                    }else{
                        num += entrada.charAt(j);
                    }
                }
                
                n = Integer.parseInt(num);
                vit = entrada.replace(num+" ", "");

                int i = 0;
                for(; i < vitas.length; i++){
                    if(vitas[i].equals(vit)){
                        break;
                    }
                }
                totVita += n * qvitas[i];
            }
            if(totVita > 130){
                System.out.println("Menos " + (totVita-130) + " mg");
            }else if(totVita < 110){
                System.out.println("Mais " + (110-totVita) + " mg");
            }else{
                System.out.println( totVita + " mg");
            }
        }
    }
}