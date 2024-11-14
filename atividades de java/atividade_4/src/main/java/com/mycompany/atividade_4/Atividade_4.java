/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_4;

/**
 *
 * @author user
 */
import java.util.Scanner;

class Aluno {
    String nome;
    double nota1, nota2, media;

    public void calcularMedia() {
        media = (nota1 * 3 + nota2 * 7) / 10;
    }
}

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[50];
        int numAlunos = 0;

        int opcao;
        do {
            System.out.println("\nESCOLA VIVA");
            System.out.println("1 - Entrar nomes");
            System.out.println("2 - Entrar notas");
            System.out.println("3 - Calcular média");
            System.out.println("4 - Listar no display");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número de alunos: ");
                    numAlunos = scanner.nextInt();
                    alunos = new Aluno[numAlunos];
                    for (int i = 0; i < numAlunos; i++) {
                        alunos[i] = new Aluno();
                        System.out.print("Nome do aluno " + (i + 1) + ": ");
                        alunos[i].nome = scanner.next();
                    }
                    break;
                case 2:
                    for (int i = 0; i < numAlunos; i++) {
                        System.out.print("Nota 1 de " + alunos[i].nome + ": ");
                        alunos[i].nota1 = scanner.nextDouble();
                        System.out.print("Nota 2 de " + alunos[i].nome + ": ");
                        alunos[i].nota2 = scanner.nextDouble();
                    }
                    break;
                case 3:
                    for (Aluno aluno : alunos) {
                        aluno.calcularMedia();
                    }
                    break;
                case 4:
                    System.out.println("\nRelatório de Alunos:");
                    for (Aluno aluno : alunos) {
                        System.out.println("Nome: " + aluno.nome);
                        System.out.println("Nota 1: " + aluno.nota1);
                        System.out.println("Nota 2: " + aluno.nota2);
                        System.out.println("Média: " + aluno.media);
                        System.out.println();
                    }
                    break;
            }
        } while (opcao != 5);
    }
}