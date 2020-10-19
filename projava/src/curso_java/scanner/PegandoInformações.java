package curso_java.scanner;

import java.util.Scanner;

public class PegandoInformações {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("oi " + nome);
		System.out.println("tudo bem?");
	//	System.out.println("Oi\t" + nome + "\ntudo bem?");
		
		System.out.println("Escreva o ano do seu nascimento" + nome + "e logo após informaremos sua idade " );
		int ano = sc.nextInt();
		int idade = 2020 - ano; 
		System.out.println("Você tem " + idade + " anos!");
	 
		sc.close();
		
		
		
		
		
		
		
		
			
	}

}
