/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_11;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_11 {

    public static void main(String[] args) {
        while (true) {
            // Solicita a data de nascimento no formato ddmm
            int data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento (ddmm), ou 9999 para terminar:"));

            // Verifica se o usuário deseja encerrar
            if (data == 9999) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break;  // Sai do loop, encerrando o programa
            }

            // Extrai o dia e o mês
            int dia = data / 100;   // Primeiro dois dígitos representam o dia
            int mes = data % 100;   // Últimos dois dígitos representam o mês

            // Determina o signo baseado na data
            String signo = "";
            if ((mes == 1 && dia <= 20) || (mes == 12 && dia >= 22)) {
                signo = "Capricórnio";
            } else if ((mes == 2 && dia <= 19) || (mes == 1 && dia >= 21)) {
                signo = "Aquário";
            } else if ((mes == 3 && dia <= 20) || (mes == 2 && dia >= 20)) {
                signo = "Peixes";
            } else if ((mes == 4 && dia <= 20) || (mes == 3 && dia >= 21)) {
                signo = "Áries";
            } else if ((mes == 5 && dia <= 20) || (mes == 4 && dia >= 21)) {
                signo = "Touro";
            } else if ((mes == 6 && dia <= 20) || (mes == 5 && dia >= 21)) {
                signo = "Gêmeos";
            } else if ((mes == 7 && dia <= 21) || (mes == 6 && dia >= 21)) {
                signo = "Câncer";
            } else if ((mes == 8 && dia <= 22) || (mes == 7 && dia >= 22)) {
                signo = "Leão";
            } else if ((mes == 9 && dia <= 22) || (mes == 8 && dia >= 23)) {
                signo = "Virgem";
            } else if ((mes == 10 && dia <= 22) || (mes == 9 && dia >= 23)) {
                signo = "Libra";
            } else if ((mes == 11 && dia <= 21) || (mes == 10 && dia >= 23)) {
                signo = "Escorpião";
            } else if ((mes == 12 && dia <= 21) || (mes == 11 && dia >= 22)) {
                signo = "Sagitário";
            }

            // Exibe o signo correspondente ao usuário
            JOptionPane.showMessageDialog(null, "Seu signo é: " + signo);
        }
    }
}

