package aula_java.loop.exemplo;

import java.util.Scanner;

public class MeuExercicio {

	public static void main(String[] args) {//teste 2
		Scanner sc = new Scanner(System.in);
		float valorTotal = 0;
		loop: while (true) {
			System.out.println("________________________");
			System.out.println("  MECÂNICA DO MATHEUS");
			System.out.println("________________________");
			System.out.println("1 - Revisao Geral | 2 - troca de óleo | 3 - verificar suspensão | 4 - Pagar | 5 - consulta valores | 6 - Sair");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Revisão geral efetuada com sucesso");
				valorTotal += 1000.00;
				continue;
			case 2:
				System.out.println("Troca de óleo efetuada com sucesso");
				valorTotal += 250.00;
				continue;
			case 3:
				System.out.println("Suspensão verificada com sucesso");
				valorTotal += 132.00;
				continue;
			case 4:
				System.out.println("Valor total à pagar é: R$" + valorTotal);
				continue;
				
			case 5:
				System.out.println("Revisão Geral = R$ 1.000,00");
				System.out.println("Troca de óleo = R$ 250,00");
				System.out.println("Verificar suspensão = R$ 132,00 ");
				continue;
			case 6:
				System.out.println("Obrigado pela preferência!");
				break loop;

			default:
				System.out.println("Opção inválida.");
				break;
			}

		}

	}

}
