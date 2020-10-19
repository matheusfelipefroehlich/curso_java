package aula_java.selecao.exercicio;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println(" Cardápio ");
		System.out.println("__________MENU_________");
		System.out.println("Qual bebida você deseja tomar?");
		System.out.println("P - Café Preto");
		System.out.println("B - Café Branco");
		System.out.println("C - Chocolate quente");
		String menu = sc.nextLine();

		String descricao = "Tome aqui seu ";
		String P = "Café preto.";
		String B = "Café branco.";
		String C = "Chocolate quente.";
		String na = "Nenhuma opção válida.";
		switch (menu.toUpperCase()) {
		case "P":
			System.out.println(descricao + P);

			break;
		case "B":
			System.out.println(descricao + B);

			break;
		case "C":
			System.out.println(descricao + C);

			break;
		default:
			System.out.println(na);
			break;

		}

	}
}