package curso_java.operadores;

import java.util.Scanner;

public class operadoreselseif {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma op��o");
		System.out.println("1 - Cadastro de pessoas");
		System.out.println("2 - Cadastro de produto");
		int opcao = Integer.parseInt(sc.nextLine());
		
		if(opcao == 1) {
			System.out.println("Entrou no cadastro de pessoas.");
		}else if (opcao == 2) {
			System.out.println("Entrou no cadastro de produto.");
		}else {
			System.out.println("Nenhuma op��o valida.");
		}
		
	}

}
