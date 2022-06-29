package algoritmosquarta;

import java.util.Scanner;

/**
 *
 * 1- Desenvolva uma algoritmo, que guarde as informações de 15 alunos: Nome:
 * Nota 1: Nota 2: Nota3: Média:
 */
public class Exec1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nAlunos, nNotas;

        System.out.println("Informe número de Alunos: ");
        nAlunos = ler.nextInt();
        System.out.println("Informe número de Notas: ");
        nNotas = ler.nextInt();

        //Cria matriz de notas 
        float[][] notas = new float[nAlunos][(nNotas + 1)];
        //Cria vetor para nome de alunos
        String[] alunos = new String[nAlunos];

        System.out.println(" . : Notas de Alunos : . ");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Nome Aluno " + (i + 1) + ": ");
            alunos[i] = ler.next(); // aqui <<<<<<<<<
            System.out.println("Notas:");
            for (int j = 0; j < nNotas; j++) {
                System.out.println("Nota " + (j + 1) + ": ");
                notas[i][j] = ler.nextFloat();
                // faz a soma de todas as notas 
                notas[i][(nNotas)] += notas[i][j]; // aqui <<<<<< 
            }
            //Média
            notas[i][(nNotas)] = notas[i][(nNotas)] / nNotas; // aqui <<<<<<
        }
        System.out.println("\n.: Impressão :.\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i]);
            for (int j = 0; j < (nNotas); j++) { 
                System.out.println("- Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.println("- Média: " + notas[i][nNotas]);
            System.out.println("---");
        }

    }

}
