/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_8;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_8 {

    public static void main(String[] args) {
        // Criando um vetor para armazenar 5 nomes
        String[] nomes = new String[5];

        // Coletando os 5 nomes
        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
        }

        // Solicitando o número da pessoa para mostrar o nome
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 5 para escolher uma pessoa:"));

        // Verificando se o número está no intervalo válido
        if (numero >= 1 && numero <= 5) {
            // Exibindo o nome correspondente ao número digitado
            JOptionPane.showMessageDialog(null, "O nome da pessoa escolhida é: " + nomes[numero - 1]);
        } else {
            // Caso o número seja inválido
            JOptionPane.showMessageDialog(null, "Número inválido! Digite um número de 1 a 5.");
        }
    }
}

