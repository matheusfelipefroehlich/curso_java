package curso_java.coletar;

import java.util.Scanner;

public class ColetandoIdade {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome");
		String nome = sc.nextLine();
		
		System.out.println("informe sua idade");
		int idade = sc.nextInt();
		
		
		if (idade >= 18) 
			System.out.println(nome + " Seja bem vindo");	
			else {
			System.out.println("Você não pode acessar");
		}

	}
	
}
