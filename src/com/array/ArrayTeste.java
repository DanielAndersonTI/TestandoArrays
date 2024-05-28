package com.array;

public class ArrayTeste {

	public static void main(String[] args) {
		double [] notas = new double [4];
		notas [0] = 5.6;
		notas [1] = 7.8;
		notas [2] = 8.2;
		notas [3] = 3.5;
		
		System.out.println("Apresente a nota numero 3: " + notas [2]);
		System.out.println("Apresente a nota numero 4: " + notas [3]);
		
		
		//For usado para contar ou realizar calculos sobre um valor de um array.
		double soma = 0;
		for (int n = 0; n < notas.length; n++) {
			soma += notas[n];
			;
		}
		System.out.printf("%.1f\n", soma);
		
		double media = soma / 4;
		System.out.printf("A média é: %.2f", media);
		
		//For usado para apresentar os valores de um Array
		//or(double notasver:notas) {
			//System.out.println(notasver);
		//}
	}

}
