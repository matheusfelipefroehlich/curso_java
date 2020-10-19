package aula_java.parse;

public class ParseValores {
	
	public static void main(String[] args) {
		//convertendo valores
		System.out.println(Double.parseDouble("10.1") == 10.1);//converti uma string para double
		
		//System.out.println(Double.parseDouble("oi") == 1);//isso tamb�m ir� gerar um erro em tempo de execu��o,
		//tentando converter texto para double
		
		System.out.println(Integer.parseInt("1") == 1);//converti uma string para int
		
		//System.out.println(Integer.parseInt("1.1") == 1.1);//gera erro pois estou tentando converter double para inteiro, o java n�o aceita
		
		System.out.println(String.valueOf(10));//converti um inteiro para string.. posso converter qualquer coisa para string
		
	}

}
