package aula_java.selecao.exercicio;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println(" Card�pio ");
		System.out.println("__________MENU_________");
		System.out.println("Qual bebida voc� deseja tomar?");
		System.out.println("P - Caf� Preto");
		System.out.println("B - Caf� Branco");
		System.out.println("C - Chocolate quente");
		String menu = sc.nextLine();

		String descricao = "Tome aqui seu ";
		String P = "Caf� preto.";
		String B = "Caf� branco.";
		String C = "Chocolate quente.";
		String na = "Nenhuma op��o v�lida.";
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