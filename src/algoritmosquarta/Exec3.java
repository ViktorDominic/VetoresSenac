
package algoritmosquarta;

import java.util.Scanner;

/**
Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que exiba a lista desses nomes na tela.
Após exibir essa lista, o programa deve mostrar também os nomes na ordem inversa em que o usuário os digitou, um por linha.
 */
public class Exec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String nomes[] = new String [5];
       int count = 0; 
       
        System.out.println("Infome 5 nomes: ");
        do {
            System.out.println("Entre com o " + (count + 1) + "° nome: ");
            nomes[count] = ler.next();
            count++; 
            
         } while (count < 5);
        System.out.println("\n Lista de nomes: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "° nome: ");
        }
        System.out.println("\n Lista de nomes em ordem inversa: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println((i + 1) + "° nome: " + nomes[i]);
        }
    }
    
}
