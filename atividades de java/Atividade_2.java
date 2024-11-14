/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_2;

/**
 *
 * @author user
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando conjuntos para armazenar os elementos
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        Set<Integer> elementosComuns = new HashSet<>();

        // Lendo os elementos do primeiro conjunto
        System.out.println("Digite os 10 elementos do primeiro conjunto:");
        for (int i = 0; i < 10; i++) {
            conjunto1.add(scanner.nextInt());
        }

        // Lendo os elementos do segundo conjunto
        System.out.println("Digite os 20 elementos do segundo conjunto:");
        for (int i = 0; i < 20; i++) {
            conjunto2.add(scanner.nextInt());
        }

        // Encontrando os elementos em comum e adicionando ao conjunto de resultados
        for (int elemento : conjunto1) {
            if (conjunto2.contains(elemento)) {
                elementosComuns.add(elemento);
            }
        }

        // Imprimindo os elementos comuns
        System.out.println("Elementos comuns aos dois conjuntos:");
        for (int elemento : elementosComuns) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
