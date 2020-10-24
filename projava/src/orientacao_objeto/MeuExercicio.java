package orientacao_objeto;

import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class MeuExercicio {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String complemento = "Seu nome é ";
		String nome = new MeuExercicio().PerguntaNome();
		String complemento2 = " e sua idade é ";
		
		

		while (true) {
			try {
			int idade = new MeuExercicio().InformaIdade();
			complemento = complemento + nome + complemento2 + idade;
			break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println(complemento);

	}

	{

	}

	private static String PerguntaNome() {
		System.out.println("Informe seu nome");
		String nome = sc.nextLine();
		return nome;

	}

	private static int InformaIdade() {
		System.out.println("Informe sua Idade!");
		int idade = Integer.parseInt(sc.nextLine());
		return idade;

	}
}
