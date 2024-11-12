package com.array;

public class ArrayTeste {

    public static void main(String[] args) {
        // Inicializando um array de notas com 4 elementos
        double[] notas = new double[4];
        
        // Atribuindo valores às notas no array
        notas[0] = 5.6;
        notas[1] = 7.8;
        notas[2] = 8.2;
        notas[3] = 3.5;
        
        // Exibindo a nota número 3 e número 4 (índices 2 e 3)
        System.out.println("Apresente a nota número 3: " + notas[2]);
        System.out.println("Apresente a nota número 4: " + notas[3]);
        
        // Calculando a soma das notas com o uso de um laço for
        double soma = 0;
        for (int n = 0; n < notas.length; n++) {
            soma += notas[n]; // Somando os valores do array
        }
        
        // Exibindo a soma das notas com uma casa decimal
        System.out.printf("Soma das notas: %.1f\n", soma);
        
        // Calculando a média das notas
        double media = soma / notas.length;
        
        // Exibindo a média com duas casas decimais
        System.out.printf("A média é: %.2f", media);
        
        // O código abaixo estava comentado, mas é uma maneira alternativa de exibir as notas
        // Usando um for-each para imprimir os valores do array
        /*
        for (double nota : notas) {
            System.out.println(nota);
        }
        */
    }
}
