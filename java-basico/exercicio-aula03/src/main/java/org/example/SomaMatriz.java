package org.example;

public class SomaMatriz {

    public static void soma() {
        double[][] tabela = {
                {1.0, 2.5, 3.7},
                {1.0, 2.5, 3.7},
                {1.0, 2.5, 3.7},
        };
        double somaTotal = 0;

        for(int i = 0; i < tabela.length; i++) {
        double somaColuna = 0;
            for(int x = 0; x < tabela[i].length; x++) {
                System.out.println(tabela[i][x]);
                somaTotal += tabela[i][x];
                somaColuna += tabela[x][i];
            }
            System.out.println("Coluna " + i + ", Soma:" + String.format("%.2f", somaColuna));
        }
        System.out.println("Soma total da matriz: " + String.format("%.2f", somaTotal));
    }
}
