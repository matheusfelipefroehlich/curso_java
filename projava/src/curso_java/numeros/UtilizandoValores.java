package curso_java.numeros;

public class UtilizandoValores {

	public static void main(String[] args) {
		//exemplos de tipo inteiro
		//antes
//		System.out.println(1 + 1);//soma
//		System.out.println(2 - 1);//subtração
//		System.out.println(2 * 1);//Multiplicação
//		System.out.println(4 / 2);//Divisão
//		System.out.println(4 % 2);//mod (resto da divisão)
//		System.out.println(4 ^ 2);//Exponencial 
		
		//depois
		int valorUm = 1;
		int valorDois = 2;
		int valorQuatro = 4;
		int primeiroResultado = valorUm + valorUm;
		System.out.println(primeiroResultado);
		
		int segundoResultado = valorDois - valorUm;
		System.out.println(segundoResultado);
		
		int terceiroResultado = valorDois * valorUm;
		System.out.println(terceiroResultado);
		
		int quartoResultado = valorQuatro / valorDois;
		System.out.println(quartoResultado);
		
		int quintoResultado = valorQuatro % valorDois;
		System.out.println(quintoResultado);
		//Math.pow é a operação para cálculo exponencial 
		int sextoResultado = (int) Math.pow(valorQuatro, valorDois);
		System.out.println(sextoResultado);
		
		
		
				
		
		//long - numeros inteiros só que maiores
		//double - numeros decimais
		//Double - numeros com funções de auxilio (o que gera menor desempenho)
		//float - numeros decimais só que maiores
		//Float - numeros decimais só que maiores (funções que auxiliam ao montar o sistema, porém da menor desempenho)
		
		long id = 100000000000000L;
		Long id2 = 100000000000000L;
		double nota = 9.5;
		Double nota2 = 9.5;
		float peso = 80.7f;
		Float peso2 = 80.7f;
		
		//System.out.println(nota2.to);  

	}

}
