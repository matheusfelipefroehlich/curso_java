package aula_java.vetores.exemplo;

import java.util.Arrays;
import java.util.Scanner;

public class UtilizandoVetores {
	
	public static void main(String[] args) {
		//vetor
		//uma vari�vel que armazena v�rios valores em at� N posi��es
		//neste exemplo armazena valores em at� 4 posi��es
		//pode ser com int, String ... etc
		int[] vetor = new int[4];
		vetor[0] = 1;//a posi��o zero � a primeira posi��o
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		
		System.out.println("Impress�o das linhas:");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println("----\n");
		
		//vetor bidimensional ou matriz
		int tamanhoEixoX = 2;//linha, horizontal
		int tamanhoEixoY = 2;//coluna, vertical
		String[][] matriz = new String[tamanhoEixoX][tamanhoEixoY];
		
		matriz[0][0] = "Linha 0, Coluna 0";//linha zero, coluna zero - primeira linha, primeira coluna
		matriz[0][1] = "Linha 0, Coluna 1";//...
		
		matriz[1][0] = "Linha 1, Coluna 0";
		matriz[1][1] = "Linha 1, Coluna 1";
		
		System.out.println("Impress�o dos itens da matriz:");
		System.out.println(matriz[0][0]);
		System.out.println(matriz[0][1]);
		System.out.println(matriz[1][0]);
		System.out.println(matriz[1][1]);
		System.out.println("----\n");
		
		System.out.println("Tamanho do vetor vetor[]:");
		System.out.println(vetor.length);//tamanho em linhas
		System.out.println("Tamanho da matriz matriz[][]:");
		System.out.println(matriz.length);//tamanho em linhas
		System.out.println("----\n");
		
		System.out.println("Ordenando numeros:");
		//outra maneira de se declara o vetor, se j� tenho os dados dele
		int[] vetorNumeros = {2, 1, 0, 3};
		Arrays.sort(vetorNumeros);//ordena o vetor
		//ABAIXO APENAS PARA VER O RESULTADO DA ORDENACAO
		for(int numero : vetorNumeros)
			System.out.println(numero);
		System.out.println("----\n");
		
		System.out.println("Ordenando nomes");
		String[] vetorNomes = {"Cleiton", "Zorro", "Alvaro"};
		Arrays.sort(vetorNomes);
		for(String nome : vetorNomes)
			System.out.println(nome);
		System.out.println("----");
		
		
				
	}

}
