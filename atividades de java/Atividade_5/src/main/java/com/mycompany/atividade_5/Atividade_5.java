/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_5;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.lang.Math;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma dos quadrados dos números ímpares abaixo da DS
        double somaQuadradosImpares = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaQuadradosImpares += Math.pow(matriz[i][j], 2);
                }
            }
        }

        // Calculando a raiz quadrada
        double raizQuadrada = Math.sqrt(somaQuadradosImpares);

        // Imprimindo o resultado
        System.out.println("Raiz quadrada da soma dos quadrados dos números ímpares abaixo da DS: " + raizQuadrada);
    }
}
