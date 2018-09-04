import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class URI2727{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String a,caso;
        int n;
        String [] pontos = {".","..","...",". .",".. ..","... ...",". . .",".. .. ..","... ... ...",". . . .",".. .. .. ..","... ... ... ...",". . . . .",".. .. .. .. ..",
                            "... ... ... ... ...",". . . . . .", ".. .. .. .. .. ..","... ... ... ... ... ...",". . . . . . .",".. .. .. .. .. .. ..","... ... ... ... ... ... ...",". . . . . . . .",
                            ".. .. .. .. .. .. .. ..","... ... ... ... ... ... ... ...",". . . . . . . . .",".. .. .. .. .. .. .. .. ..", "... ... ... ... ... ... ... ... ..."};
        String [] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        while((a = input.readLine()) != null){
            n = Integer.parseInt(a);
            for (int k = 0; k < n;k++){
                caso = input.readLine();
                for(int i = 0; i < pontos.length;i++){
                    if(pontos[i].equals(caso)){
                        System.out.println(alfabeto[i]);
                        break;
                    }
                }
            }
        }
        
    }
}