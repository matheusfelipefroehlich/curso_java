package curso_java.coletar;

import java.util.Scanner;

public class Exerc�cioBeckup {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o seu nome!");
		String nome = sc.nextLine();

		System.out.println(
				"Uma casa a qual tem um losango como formato em sua planta ser� constru�da ocupando 100% de um determinado terreno, ent�o para que a construtora possa realizar a obra � preciso que o engenheiro passe o per�metro da mesma.");
		System.out.println(
				"Sabendo que a metade da diagonal maior do losango � 25m e que a metade da diagonal menor � 15m, ent�o, calcule o per�metro:");
		System.out.println("Indique qual � o valor aproximado do per�metro em metros sabendo que voc� � o engenheiro:");
		int perimetro = Integer.parseInt(sc.nextLine());

		if (perimetro == 116) {
			System.out.println("Parab�ns por realizar da melhor forma sua profiss�o");			
		} else {
			System.out.println(
					"O per�metro indicado para a construtora est� incorreto de acordo com as medidas da casa.");
			System.out.println("");
			do {
				System.out.println("Erro");
			}while (!(perimetro == 116));
			
			System.out.println(
					"Agora indique os seguintes valores para que o programa possa responder o valor da �rea desta casa ");
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
							.println("Sabendo que a �rea de um losando � : (�rea = (DiagonalMaior x DiagonalMenor)/2");
					System.out.println("�rea =" + (DiagonalMaior * DiagonalMenor) / 2 + "m�");
					// int Area = sc.nextInt();
				}

			}

		}

	}
}
