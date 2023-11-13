package JavaInicial;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float mat[][] = new float[10][4];
		float media[] = new float[10];
		int x, y;
		float somaNota = 0;
		
		for (x = 0; x <10; x++) {
			somaNota = 0;
			for (y = 0; y < 4; y++) {
				
				System.out.println("\nDigite a "+(y+1)+"° nota do participante: ");
				mat[x][y] = leia.nextFloat();
				somaNota += mat[x][y];
			}
			
			media[x] = somaNota/4;
		}
		
		for (x = 0; x <10; x++) {
			System.out.println("\nMedia do participante "+(x+1)+" foi de: "+media[x]);
		}

	}

}
