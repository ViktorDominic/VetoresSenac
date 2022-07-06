package algoritmosquarta;

import java.util.Scanner;

/**
 * Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que
 * exiba o somatório desses números na tela. Após exibir a soma, o programa deve
 * mostrar também os números que o usuário digitou, um por linha.
 */
public class Exec2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valores[] = new int[5];
        int count = 0, soma = 0;

        System.out.println(" Entrar com 5 numero inteiros: ");
        do {
            System.out.println("Informe valor " + (count + 1) + ": ");
            valores[count] = ler.nextInt();
            soma += valores[count];
            count += 1;

        } while (count < 5);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor: " + (i + 1 ) + ": " + valores[i]);
            
        }
    }

}
