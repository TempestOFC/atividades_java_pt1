/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_7;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_7 {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase:");
        int opcao;

        do {
            // Exibe o menu
            String menu = "MENU\n" +
                          "1 - Imprime o comprimento da frase\n" +
                          "2 - Imprime os dois primeiros e os dois últimos caracteres da frase\n" +
                          "3 - Imprime a frase espelhada\n" +
                          "4 - Termina o progama\n" +
                          "Escolha uma opção:";
            
            // Solicita a opção do usuário
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    // Imprime o comprimento da frase
                    int comprimento = frase.length();
                    JOptionPane.showMessageDialog(null, "O comprimento da frase é: " + comprimento);
                    break;

                case 2:
                    // Imprime os dois primeiros e os dois últimos caracteres da frase
                    if (frase.length() >= 4) {
                        String primeiros = frase.substring(0, 2);
                        String ultimos = frase.substring(frase.length() - 2);
                        JOptionPane.showMessageDialog(null, "Os dois primeiros caracteres: " + primeiros +
                                "\nOs dois últimos caracteres: " + ultimos);
                    } else {
                        JOptionPane.showMessageDialog(null, "A frase deve ter pelo menos 4 caracteres.");
                    }
                    break;

                case 3:
                    // Imprime a frase espelhada
                    String fraseInvertida = new StringBuilder(frase).reverse().toString();
                    JOptionPane.showMessageDialog(null, "A frase espelhada é: " + fraseInvertida);
                    break;

                case 4:
                    // Termina o algoritmo
                    JOptionPane.showMessageDialog(null, "O progama foi encerrado.");
                    break;

                default:
                    // Caso a opção seja inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (opcao != 4); // Continua até o usuário escolher a opção 4
    }
}

