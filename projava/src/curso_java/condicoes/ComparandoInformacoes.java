package curso_java.condicoes;

import java.util.Scanner;

public class ComparandoInformacoes {

	public static void main(String[] args) {
		// inicio o scanner
		Scanner sc = new Scanner(System.in);
		// crio uma variável texto(String)... texto aceita tudo!
		String nomeCadastrado = "Matheus";
		// escrevo um texto
		System.out.println("Escreva seu nome");
		// espero a linha ser escrita e atribuo o valor a variável 'nome'
		String nome = sc.nextLine();
		// escrevo dados
		System.out.println("O nome existe? comparando com equals()...");
		// se essa condição for verdadeira
		if (nomeCadastrado.equals(nome)) {
			System.out.println("Sim");// faço isso
		} else {
			System.out.println("Não");// se não faço isso
		}
		// escrevo um texto
		System.out.println("O nome existe? comparando com equalsIgnoreCase()...");
		// se essa condição for verdadeira
		if (nomeCadastrado.equalsIgnoreCase(nome)) {
			System.out.println("Sim");// faço isso
		} else {
			System.out.println("Não");// se não faço isso
		}

		// fecho o scanner, pra não alocar recurso da máquina
		sc.close();

	}
}
