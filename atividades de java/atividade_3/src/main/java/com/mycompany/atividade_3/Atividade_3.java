/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_3;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de voos e criação do array de voos
        System.out.print("Digite o número de voos: ");
        int numVoos = scanner.nextInt();
        int[] lugaresDisponiveis = new int[numVoos];

        // Leitura da capacidade de cada voo
        for (int i = 0; i < numVoos; i++) {
            System.out.print("Digite a capacidade do voo " + (i + 1) + ": ");
            lugaresDisponiveis[i] = scanner.nextInt();
        }

        // Leitura dos pedidos de reserva
        System.out.print("Digite o número de pedidos: ");
        int numPedidos = scanner.nextInt();

        for (int i = 0; i < numPedidos; i++) {
            System.out.print("Digite a identidade do cliente: ");
            int identidade = scanner.nextInt();
            System.out.print("Digite o número do voo desejado: ");
            int vooDesejado = scanner.nextInt() - 1; // Ajustando o índice para o array

            if (vooDesejado >= 0 && vooDesejado < numVoos) {
                if (lugaresDisponiveis[vooDesejado] > 0) {
                    System.out.println("Reserva confirmada para o cliente " + identidade + " no voo " + (vooDesejado + 1));
                    lugaresDisponiveis[vooDesejado]--;
                } else {
                    System.out.println("Não há lugares disponíveis para o voo " + (vooDesejado + 1));
                }
            } else {
                System.out.println("Voo inválido");
            }
        }
    }
}