package aula_java.selecao.exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("_______________________");
		System.out.println(" Auto Escola JAVA");
		System.out.println("__________MENU_________");
		System.out.println("1 - APTO A DIRIGIR");
		System.out.println("2 - TURMAS DISPON�VEIS");
		int menu = Integer.parseInt(sc.nextLine());

		
		
		if (menu == 1) {
			System.out.println(" Informe seu nome! ");
			String nome = sc.nextLine();
			
			System.out.println(" Informe sua idade! ");
			int idade = Integer.parseInt(sc.nextLine());

			System.out.println(" Voc� sabe dirigir? S/N");
			String sabeDirigir = sc.nextLine();

			System.out.println(" Voc� � parente do dono da autoescola? S/N");
			String parente = sc.nextLine();
			
			if (idade >= 18 && sabeDirigir.equalsIgnoreCase("S") || parente.equalsIgnoreCase("S")) {				
				System.out.println(nome  + " voc� est� apto para dirigir!");
			}else {
				System.out.println(nome  + " Voc� n�o est� apto para dirigir!");
			}
			
			
		
		} else if (menu == 2) {						
			System.out.println("Quantas pessoas querem tirar a cnh?");
			int numeroPessoas = Integer.parseInt(sc.nextLine());
			if (numeroPessoas <= 2) {
				System.out.println("H� vagas");
			} else {
				System.out.println("N�o h� vagas");
			}
		} else {
			System.out.println("Op��o inv�lida");
		}

	}

}
