package aula_java.loop.exemplo;

import java.util.Arrays;
import java.util.Scanner;


public class loopForeach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos Alunos tem na sala?");
		int quantidadeAlunos = Integer.parseInt(sc.nextLine());
		
		String[] nomeAlunos= new String[quantidadeAlunos];
		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.println("Qual o nome do Aluno?");
			nomeAlunos[i] = sc.nextLine();
		}
		Arrays.sort(nomeAlunos);
		System.out.println("Exemplo 1:");
		for (int i = 0; i < quantidadeAlunos; i++) {
			System.out.println(nomeAlunos[i]);			
		}
		System.out.println("Exemplo 2:");
		for (int i = 0; i < quantidadeAlunos; i++) {
			String nome = nomeAlunos[i];
			System.out.println(nome);			
		}
		System.out.println("Exemplo 3:");
		for (String nome : nomeAlunos) {
			System.out.println(nome);			
		}
		
		
	}

}
