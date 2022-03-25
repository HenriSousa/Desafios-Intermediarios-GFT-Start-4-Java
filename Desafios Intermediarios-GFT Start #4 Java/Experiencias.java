/*  --------------- DESAFIO DIO JAVA ----------------------
Maria acabou de iniciar seu curso de graduação na faculdade de medicina
e precisa de sua ajuda para organizar os experimentos de um laboratório
o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias
foram utilizadas no laboratório e o percentual de cada tipo de cobaia
utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos,
ratos e coelhos. Para obter estas informações, ela sabe exatamente
o número de experimentos que foram realizados, o tipo de cobaia utilizada
e a quantidade de cobaias utilizadas em cada experimento.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Experiencias {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.valueOf(input.readLine());
        int d = 0, e = 0, f = 0;
        for (int i = 0; i < a; i++) {
        String dado = input.readLine();
        String[] dados = dado.split(" ");
        int b = Integer.valueOf(dados[0]);
        char c = dados[1].toUpperCase().charAt(0);
// d = Coelhos, e = Ratos, f = Sapos.
//Escreva o seu código aqui
            switch (c) {
                case 'C': d += b; break;
                case 'R': e += b; break;
                case 'S': f += b; break;
            }
        }
        int t = d + e + f;
        double mC = (d * 100) / (double) t;
        double mR = (e * 100) / (double) t;
        double mS = (f * 100) / (double) t;
        System.out.println("Total: " + t + " cobaias");
        System.out.println("Total de coelhos: " + d);
        System.out.println("Total de ratos: " + e);
        System.out.println("Total de sapos: " + f);
        System.out.printf("Percentual de coelhos: %.2f %%%n", mC);
        System.out.printf("Percentual de ratos: %.2f %%%n", mR);
        System.out.printf("Percentual de sapos: %.2f %%%n", mS);
}
}
/*
        int N = Integer.valueOf(input.readLine());
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        for (int i = 0; i < N; i++) {
            String info = input.readLine();
            String[] infos = info.split(" ");
            int Quantia = Integer.valueOf(infos[0]);
            char Tipo = infos[1].toUpperCase().charAt(0);
            switch (Tipo) {
                case 'C': totalCoelhos += Quantia; break;
                case 'R': totalRatos += Quantia; break;
                case 'S': totalSapos += Quantia; break;
            }
        }

        int totalCobaias = totalCoelhos + totalRatos + totalSapos;
        double mediaCoelhos = (totalCoelhos * 100) / (double) totalCobaias;
        double mediaRatos = (totalRatos * 100) / (double) totalCobaias;
        double mediaSapos = (totalSapos * 100) / (double) totalCobaias;
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");
    }

}

*/