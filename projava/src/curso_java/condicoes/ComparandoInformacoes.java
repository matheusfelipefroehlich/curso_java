package curso_java.condicoes;

import java.util.Scanner;

public class ComparandoInformacoes {

	public static void main(String[] args) {
		// inicio o scanner
		Scanner sc = new Scanner(System.in);
		// crio uma vari�vel texto(String)... texto aceita tudo!
		String nomeCadastrado = "Matheus";
		// escrevo um texto
		System.out.println("Escreva seu nome");
		// espero a linha ser escrita e atribuo o valor a vari�vel 'nome'
		String nome = sc.nextLine();
		// escrevo dados
		System.out.println("O nome existe? comparando com equals()...");
		// se essa condi��o for verdadeira
		if (nomeCadastrado.equals(nome)) {
			System.out.println("Sim");// fa�o isso
		} else {
			System.out.println("N�o");// se n�o fa�o isso
		}
		// escrevo um texto
		System.out.println("O nome existe? comparando com equalsIgnoreCase()...");
		// se essa condi��o for verdadeira
		if (nomeCadastrado.equalsIgnoreCase(nome)) {
			System.out.println("Sim");// fa�o isso
		} else {
			System.out.println("N�o");// se n�o fa�o isso
		}

		// fecho o scanner, pra n�o alocar recurso da m�quina
		sc.close();

	}
}
