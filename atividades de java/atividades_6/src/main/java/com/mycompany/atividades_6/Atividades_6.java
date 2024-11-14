/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividades_6;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class Atividades_6 {

    public static void main(String[] args) {
        // Criando os arrays para armazenar os nomes e as notas dos alunos
        String[] nomes = new String[5];
        double[][] notas = new double[5][2];
        double[] medias = new double[5];

        // Coletando as informações dos alunos
        for (int i = 0; i < 5; i++) {
            // Solicitar o nome do aluno
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");

            // Solicitar as duas notas do aluno
            notas[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de " + nomes[i] + ":"));
            notas[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de " + nomes[i] + ":"));

            // Calculando a média do aluno
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        // Preparando a mensagem para exibir
        StringBuilder resultado = new StringBuilder("Listagem de Alunos e Notas:\n\n");

        for (int i = 0; i < 5; i++) {
            resultado.append("Aluno: ").append(nomes[i])
                    .append("\nNota 1: ").append(notas[i][0])
                    .append("\nNota 2: ").append(notas[i][1])
                    .append("\nMédia: ").append(medias[i])
                    .append("\n\n");
        }

        // Exibindo a mensagem na caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
