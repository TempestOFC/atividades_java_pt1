/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_1;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        int[] num = new int[15];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.println("Digite 15 números:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        // Impressão da lista
        System.out.println("Relação dos números:");
        for (int i = 0; i < 15; i++) {
            System.out.print(i + 1 + " - " + num[i]);
            if (num[i] % 2 == 0) {
                System.out.println(" é PAR");
            } else {
                System.out.println(" é ÍMPAR");
            }
        }
    }
}
