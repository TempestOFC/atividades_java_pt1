/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_10;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_10 {

    public static void main(String[] args) {
        int countLucro = 0; // Contador para mercadorias que dão lucro
        int numMercadorias = 100; // Total de mercadorias

        // Loop para ler as informações de cada mercadoria
        for (int i = 1; i <= numMercadorias; i++) {
            // Lê o preço de compra e o preço de venda
            double precoCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra da mercadoria " + i + ":"));
            double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda da mercadoria " + i + ":"));

            // Verifica se há lucro
            if (precoVenda > precoCompra) {
                countLucro++; // Incrementa o contador de mercadorias com lucro
            }
        }

        // Exibe o número de mercadorias que deram lucro
        JOptionPane.showMessageDialog(null, "Número de mercadorias que deram lucro: " + countLucro);
    }
}
