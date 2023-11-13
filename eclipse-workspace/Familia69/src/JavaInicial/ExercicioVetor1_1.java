package JavaInicial;

import java.util.Scanner;

public class ExercicioVetor1_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int vetorInt[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero, posicao = -1, x;

        System.out.println("\nDigite o número que você deseja encontrar: ");
        numero = leia.nextInt();

        for (x = 0; x < vetorInt.length; x++) {
            if (vetorInt[x] == numero) {
                posicao = x;
                break; // Se encontrado, interrompe o loop
            }
        }

        if (posicao >= 0) {
            System.out.println("\nO número " + numero + " está na posição " + posicao + " do vetor.");
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado.");
        }
    }


	}


