package aula_java.selecao.exercicio;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("_______________________");
		System.out.println(" Auto Escola JAVA");
		System.out.println("__________MENU_________");
		System.out.println("1 - APTO A DIRIGIR");
		System.out.println("2 - TURMAS DISPONÍVEIS");
		int menu = Integer.parseInt(sc.nextLine());

		switch (menu) {
		case 1:
			System.out.println(" Informe seu nome! ");
			String nome = sc.nextLine();

			System.out.println(" Informe sua idade! ");
			int idade = Integer.parseInt(sc.nextLine());

			System.out.println(" Você sabe dirigir? S/N");
			String sabeDirigir = sc.nextLine();

			System.out.println(" Você é parente do dono da autoescola? S/N");
			String parente = sc.nextLine();

			if (idade >= 18 && sabeDirigir.equalsIgnoreCase("S") || parente.equalsIgnoreCase("S")) {
				System.out.println(nome + " você está apto para dirigir!");
			} else {
				System.out.println(nome + " Você não está apto para dirigir!");
			}
			break;

		case 2:
			System.out.println("Quantas pessoas querem tirar a cnh?");
			int numeroPessoas = Integer.parseInt(sc.nextLine());
			if (numeroPessoas <= 2) {
				System.out.println("Há vagas");
			} else {
				System.out.println("Não há vagas");
			}
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		//>
	}
}
