package curso_java.coletar;

import java.util.Scanner;

public class ExercícioBeckup {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o seu nome!");
		String nome = sc.nextLine();

		System.out.println(
				"Uma casa a qual tem um losango como formato em sua planta será construída ocupando 100% de um determinado terreno, então para que a construtora possa realizar a obra é preciso que o engenheiro passe o perímetro da mesma.");
		System.out.println(
				"Sabendo que a metade da diagonal maior do losango é 25m e que a metade da diagonal menor é 15m, então, calcule o perímetro:");
		System.out.println("Indique qual é o valor aproximado do perímetro em metros sabendo que você é o engenheiro:");
		int perimetro = Integer.parseInt(sc.nextLine());

		if (perimetro == 116) {
			System.out.println("Parabéns por realizar da melhor forma sua profissão");			
		} else {
			System.out.println(
					"O perímetro indicado para a construtora está incorreto de acordo com as medidas da casa.");
			System.out.println("");
			do {
				System.out.println("Erro");
			}while (!(perimetro == 116));
			
			System.out.println(
					"Agora indique os seguintes valores para que o programa possa responder o valor da área desta casa ");
			System.out.println("");
			System.out.println("DiagonalMaior");
			int DiagonalMaior = Integer.parseInt(sc.nextLine());
			if (DiagonalMaior != 25) {
				System.out.println("Erro");
			} else {
				System.out.println("");
				System.out.println("DiagonalMenor");
				int DiagonalMenor = Integer.parseInt(sc.nextLine());
				if (DiagonalMenor != 15) {
					System.out.println("Erro");
				} else {
					System.out
							.println("Sabendo que a área de um losando é : (Área = (DiagonalMaior x DiagonalMenor)/2");
					System.out.println("Área =" + (DiagonalMaior * DiagonalMenor) / 2 + "m²");
					// int Area = sc.nextInt();
				}

			}

		}

	}
}
