package exec1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a quantidade de alunos");
        Integer quantAlunos = sc.nextInt();

        System.out.println("Escreva a quantidade de notas de cada alunos");
        Integer quantidadeNotas = sc.nextInt();

        Double media = 0.00;

        Double alunos[][] = new Double[quantAlunos][quantidadeNotas + 1];

        for (int i = 0; i < quantAlunos; i++) {
            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.println("Escreva a nota " + j + " do aluno" + i);

                alunos[i][j] = sc.nextDouble();
                if (alunos[i][quantidadeNotas] == null) {
                    alunos[i][quantidadeNotas] = alunos[i][j];
                } else {
                    alunos[i][quantidadeNotas] += alunos[i][j];
                }

            }
        }

        for (int i = 0; i < alunos.length; i++) {
            media = alunos[i][quantidadeNotas] / quantidadeNotas;
            System.out.println("Media do aluno: "+i+"  " + media);
            if (media > 70.00) {
                System.out.println("Aluno " + i + " Aprovado");
            } else {
                System.out.println("Aluno " + i + " Reprovado");
            }
        }

    }
}
