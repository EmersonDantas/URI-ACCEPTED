import java.util.Scanner;

public class URI1049 {
	public static void main(String[] args) {
		String result = "";
		Scanner entrada = new Scanner(System.in);
		String dica1 = entrada.nextLine();
		String dica2 = entrada.nextLine();
		String dica3 = entrada.nextLine();

		if (dica1.equalsIgnoreCase("vertebrado")) {
			if (dica2.equalsIgnoreCase("ave")) {
				if (dica3.equalsIgnoreCase("carnivoro")){
						result = "aguia";
				}else {
					result = "pomba";
				}
			}else {
				if (dica3.equalsIgnoreCase("onivoro")) {
					result = "homem";
				}else {
					result = "vaca";
				}
			}
		}else {
			if (dica2.equalsIgnoreCase("inseto")) {
				if (dica3.equalsIgnoreCase("hematofago")) {
					result = "pulga";
				}else {
					result = "lagarta";
				}
			}else {
				if (dica3.equalsIgnoreCase("hematofago")) {
					result = "sanguessuga";
				}else {
					result = "minhoca";
				}
			}
		}
		System.out.println(result);
	}
}
