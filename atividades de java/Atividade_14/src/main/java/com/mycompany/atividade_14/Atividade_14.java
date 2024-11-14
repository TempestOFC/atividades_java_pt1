/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_14;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_14 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];
        int[][] matrizDiferenca = new int[5][5];
        
        // Preenchendo a primeira matriz
        JOptionPane.showMessageDialog(null, "Digite os valores para a primeira matriz (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz 1 - Elemento [" + (i+1) + "][" + (j+1) + "]:"));
            }
        }
        
        // Preenchendo a segunda matriz
        JOptionPane.showMessageDialog(null, "Digite os valores para a segunda matriz (5x5):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz 2 - Elemento [" + (i+1) + "][" + (j+1) + "]:"));
            }
        }
        
        // Calculando a diferença entre as duas matrizes
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizDiferenca[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        // Exibindo a matriz diferença
        StringBuilder resultado = new StringBuilder("Matriz Diferença (Matriz1 - Matriz2):\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                resultado.append(matrizDiferenca[i][j]).append("\t");
            }
            resultado.append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

