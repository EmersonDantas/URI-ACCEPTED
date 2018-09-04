import java.util.Scanner;
public class URI1131{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int grenais = 0;
		int vi = 0;
		int vg = 0;
		int empates = 0;
		String venceuMais;
		boolean parar = false;
		while(!parar){
			int i = input.nextInt();
			int g = input.nextInt();
			grenais++;

			if (i > g){
				vi ++;
			}else if(g > i){
				vg++;
			}else{
				empates++;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			int opcao = input.nextInt();
			if (opcao == 2){
				parar = true;
			}
		}

		if(vi > vg){
			venceuMais = "Inter";
		}else{
			venceuMais = "Gremio";
		}
		System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n%s venceu mais\n",grenais,vi,vg,empates,venceuMais);
		
	}
}