package curso_java.operadores;

import java.util.Scanner;

public class Exemplo2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lanches JAVA");
		
		System.out.println("Você ganha desconto da Proway? S/N");
		String descontoProway = sc.nextLine();
		
		System.out.println("Vai querer o prato do Dia");
		String pratoDoDia = sc.nextLine();
		
		if(pratoDoDia.equalsIgnoreCase("S")) {
			System.out.println("Desconto do  Prato do Dia");
		} else if (descontoProway.equalsIgnoreCase("S")) {
			System.out.println("Desconto da proway");
		} else {
			System.out.println("Sem desconto");
		}
		
		sc.close();
	}

}
