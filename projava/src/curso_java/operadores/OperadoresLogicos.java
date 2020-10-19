package curso_java.operadores;

import java.util.Scanner;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
	  //&& ... significa E
		System.out.println(1 == 1 && 2 > 1);
		System.out.println(true && true);
		//como funciona
		//true && true = true
		//true && false = false
		//false && true = false
		//false && false = true
		
		//|| ... significa OU
		System.out.println(1 == 2 || 2 == 2);
		System.out.println(false || true);
		//como funciona
		//true || true = true
		//true || false = true
		//false || true = true
		//false || false = false
	}

}
