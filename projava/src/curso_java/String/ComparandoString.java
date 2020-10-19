package curso_java.String;

//import java.util.Scanner;
import java.util.*;

public class ComparandoString {
	public static void main(String[] args) {
		// inicio o scanner
		Scanner sc = new Scanner(System.in);
		// crio uma variável texto(String)... texto aceita tudo!
		String nomeCadastrado = "Matheus";
        //escrevo um texto
		System.out.println("Escreva seu nome");
		//espero a linha ser escrita e atribuo o valor a variável 'nome'
		String nome = sc.nextLine();
		// escrevo dados
		System.out.println("O nome existe? comparando com equals():" + (nomeCadastrado.equals(nome)));
		System.out
				.println("O nome existe? comparando com equalsIgnoreCase():" + (nomeCadastrado.equalsIgnoreCase(nome)));
		//fechar o scanner
		sc.close();

	}
}
