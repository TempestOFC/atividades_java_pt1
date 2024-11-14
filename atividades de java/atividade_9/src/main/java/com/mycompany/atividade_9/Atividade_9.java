/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_9;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_9 {

    public static void main(String[] args) {
        // Criando arrays para armazenar os nomes, notas, médias e situações dos alunos
        String[] nomes = new String[15];
        double[][] notas = new double[15][2]; // Notas das 2 provas (PR1 e PR2)
        double[] medias = new double[15];
        String[] situacao = new String[15];

        // Coletando os dados dos alunos
        for (int i = 0; i < 15; i++) {
            // Solicitando o nome do aluno
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");

            // Solicitando as notas das duas provas
            notas[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PR1 de " + nomes[i] + ":"));
            notas[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da PR2 de " + nomes[i] + ":"));

            // Calculando a média
            medias[i] = Math.round((notas[i][0] + notas[i][1]) / 2.0); // Média arredondada

            // Determinando a situação do aluno
            if (medias[i] >= 6) {
                situacao[i] = "AP"; // Aprovado
            } else {
                situacao[i] = "RP"; // Reprovado
            }
        }

        // Preparando a listagem dos resultados
        StringBuilder resultado = new StringBuilder("Listagem de Alunos:\n\n");
        resultado.append(String.format("%-20s %-10s %-10s %-6s\n", "Nome", "Nota PR1", "Nota PR2", "Média", "Situação"));
        resultado.append("---------------------------------------------------------\n");

        for (int i = 0; i < 15; i++) {
            resultado.append(String.format("%-20s %-10.2f %-10.2f %-6.0f %-6s\n", nomes[i], notas[i][0], notas[i][1], medias[i], situacao[i]));
        }

        // Exibindo a listagem em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

