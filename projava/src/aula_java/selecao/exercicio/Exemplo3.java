package aula_java.selecao.exercicio;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("__________MENU_________");
		System.out.println("1 - Produto");
		System.out.println("2 - Pessoa");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("Cadastro de produto");
		    break;
		case 2:
			System.out.println("Cadastro de pessoa");
			break;
		default:
			System.out.println("Nenhuma opção válida");
			break;
		}
	}
}