package aula_java.loop.exemplo;

import java.util.Scanner;

public class MeuExercicio {

	public static void main(String[] args) {//teste 2
		Scanner sc = new Scanner(System.in);
		float valorTotal = 0;
		loop: while (true) {
			System.out.println("________________________");
			System.out.println("  MEC�NICA DO MATHEUS");
			System.out.println("________________________");
			System.out.println("1 - Revisao Geral | 2 - troca de �leo | 3 - verificar suspens�o | 4 - Pagar | 5 - consulta valores | 6 - Sair");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Revis�o geral efetuada com sucesso");
				valorTotal += 1000.00;
				continue;
			case 2:
				System.out.println("Troca de �leo efetuada com sucesso");
				valorTotal += 250.00;
				continue;
			case 3:
				System.out.println("Suspens�o verificada com sucesso");
				valorTotal += 132.00;
				continue;
			case 4:
				System.out.println("Valor total � pagar �: R$" + valorTotal);
				continue;
				
			case 5:
				System.out.println("Revis�o Geral = R$ 1.000,00");
				System.out.println("Troca de �leo = R$ 250,00");
				System.out.println("Verificar suspens�o = R$ 132,00 ");
				continue;
			case 6:
				System.out.println("Obrigado pela prefer�ncia!");
				break loop;

			default:
				System.out.println("Op��o inv�lida.");
				break;
			}

		}

	}

}
