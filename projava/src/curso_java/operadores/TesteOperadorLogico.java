package curso_java.operadores;

import java.util.Scanner;

public class TesteOperadorLogico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorSorteado = 5;
		int idadeMinima = 18;

		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();

		System.out.println("Escolha um numero:");
		int numeroEscolhido = Integer.parseInt(sc.nextLine());

		System.out.println("Digite sua idade:");
		int idade = Integer.parseInt(sc.nextLine());

//		if (valorSorteado == numeroEscolhido && idade >= idadeMinima) {
//			System.out.println("Parabens, ganhou um joinha!");
//		} else {
//			System.out.println("N�o ganhou, tente outra vez.");

		if (valorSorteado == numeroEscolhido || nome.equalsIgnoreCase("Marheus")) {
			System.out.println("Parabens, ganhou um joinha!");
		} else {
			System.out.println("N�o ganhou, tente outra vez.");
		}

	}

}
