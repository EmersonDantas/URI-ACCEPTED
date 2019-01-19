import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class URI2311{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        int n;
        List<Pessoa> competidores = new ArrayList<>();
        n = Integer.parseInt(input.nextLine());
        for(int k = 0; k < n; k++){
            String nome = input.nextLine();
            double g = Double.parseDouble(input.nextLine());
            String[] entrada = input.nextLine().split(" ");
            List<Double> notas = new ArrayList<>();
            for(int j = 0; j < entrada.length; j++){
                notas.add(Double.parseDouble(entrada[j]));
            }
            Pessoa p = new Pessoa(nome, notas, g);
            competidores.add(p);
        }
        for(Pessoa p: competidores){
            System.out.println(p.result());
        }
    }

    static class Pessoa{
        private String nome;
        private List<Double> notas;
        private double grau;

        public Pessoa(String nome, List<Double> notas, double grau){
            this.nome = nome;
            this.notas = notas;
            this.grau = grau;
        }

        public double nota( ){
            Collections.sort(notas);
            notas.remove(0);
            notas.remove(notas.size()-1);
            double soma = 0;
            for(Double a: notas){
                soma += a;
            }
            return soma*grau;
        }

        public String result(){
            return String.format("%s %.2f", nome, nota());
        }
    }
}