package curso_java.String;

public class UtilizandoString {
	
	//main ctrl + space
	public static void main(String[] args) {
		/*
		String nome = "Matheus";
		nome = nome + " Felipe";//concatenar
				
		String sobrenome = ""; 
		sobrenome = "Froehlich";
		
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(nome + " " + sobrenome);
		System.out.println(nome.concat(" ").concat(sobrenome));
		*/
		
		String nomeCompleto = "Matheus Felipe Froehlich";
		int anoAtual = 2020;
		int ano = 2000;
		
		System.out.println("Meu nome é " + nomeCompleto + " tenho " + (anoAtual - ano) + " anos de idade.");
		System.out.println((1 + (1 + 1 + (2 + 2))));
		System.out.println(("1 " + ("1 " + "1 " + ("2 " + "2 "))));
		
	}

}
