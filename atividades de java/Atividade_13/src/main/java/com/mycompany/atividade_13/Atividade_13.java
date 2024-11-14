/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_13;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
import java.util.Date;

public class Atividade_13 {

    static final int MAX_QUARTOS = 50;

    // Estruturas de dados para armazenar as informações dos quartos
    static int[] numeroLeitos = new int[MAX_QUARTOS];
    static double[] preco = new double[MAX_QUARTOS];
    static String[] situacao = new String[MAX_QUARTOS];  // "livre", "reservado", "alugado"
    static Date[] dataEntrada = new Date[MAX_QUARTOS];
    static Date[] dataSaida = new Date[MAX_QUARTOS];
    static int[] diarias = new int[MAX_QUARTOS];
    static double[] despesasExtras = new double[MAX_QUARTOS];
    static double[] valorPago = new double[MAX_QUARTOS];

    static int numeroQuartos = 0; // Contador de quartos cadastrados

    public static void main(String[] args) {
        int opcao;
        
        do {
            // Menu do hotel
            String menu = "Hotel-Fazenda Sucesso\n"
                    + "1. Cadastra quartos\n"
                    + "2. Lista todos os quartos\n"
                    + "3. Lista quartos ocupados\n"
                    + "4. Aluguel/reserva quarto\n"
                    + "5. Entra despesas extras\n"
                    + "6. Calcula despesa do quarto\n"
                    + "7. Sai";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    cadastraQuartos();
                    break;
                case 2:
                    listaTodosQuartos();
                    break;
                case 3:
                    listaQuartosOcupados();
                    break;
                case 4:
                    aluguelOuReservaQuarto();
                    break;
                case 5:
                    entraDespesasExtras();
                    break;
                case 6:
                    calculaDespesaQuarto();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 7);
    }

    // Função para cadastrar quartos
    static void cadastraQuartos() {
        if (numeroQuartos < MAX_QUARTOS) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:"));
            int leitos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de leitos do quarto:"));
            double precoQuarto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do quarto:"));

            numeroLeitos[numeroQuartos] = leitos;
            preco[numeroQuartos] = precoQuarto;
            situacao[numeroQuartos] = "livre";  // Inicialmente o quarto está livre
            numeroQuartos++;

            JOptionPane.showMessageDialog(null, "Quarto cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Número máximo de quartos atingido.");
        }
    }

    // Função para listar todos os quartos
    static void listaTodosQuartos() {
        StringBuilder lista = new StringBuilder("Lista de Todos os Quartos:\n");
        for (int i = 0; i < numeroQuartos; i++) {
            lista.append("Quarto ").append(i).append(": ")
                 .append("Leitos: ").append(numeroLeitos[i]).append(", ")
                 .append("Preço: R$ ").append(preco[i]).append(", ")
                 .append("Situação: ").append(situacao[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    // Função para listar os quartos ocupados
    static void listaQuartosOcupados() {
        StringBuilder lista = new StringBuilder("Lista de Quartos Ocupados:\n");
        for (int i = 0; i < numeroQuartos; i++) {
            if ("alugado".equals(situacao[i])) {
                lista.append("Quarto ").append(i).append(": ")
                     .append("Leitos: ").append(numeroLeitos[i]).append(", ")
                     .append("Preço: R$ ").append(preco[i]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, lista.length() > 0 ? lista.toString() : "Nenhum quarto ocupado.");
    }

    // Função para aluguel ou reserva de quarto
    static void aluguelOuReservaQuarto() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:"));
        if (numero >= 0 && numero < numeroQuartos) {
            if ("livre".equals(situacao[numero])) {
                String opcao = JOptionPane.showInputDialog("Deseja reservar ou alugar? (reservar/alugar)");
                if ("reservar".equals(opcao)) {
                    situacao[numero] = "reservado";
                    JOptionPane.showMessageDialog(null, "Quarto reservado com sucesso!");
                } else if ("alugar".equals(opcao)) {
                    situacao[numero] = "alugado";
                    String entrada = JOptionPane.showInputDialog("Digite a data de entrada (DD/MM/AAAA):");
                    String saida = JOptionPane.showInputDialog("Digite a data de saída (DD/MM/AAAA):");
                    dataEntrada[numero] = new Date();  // Simulação de conversão de data
                    dataSaida[numero] = new Date();    // Simulação de conversão de data
                    diarias[numero] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de diárias:"));
                    JOptionPane.showMessageDialog(null, "Quarto alugado com sucesso!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Quarto não disponível.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de quarto inválido.");
        }
    }

    // Função para inserir despesas extras
    static void entraDespesasExtras() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:"));
        if (numero >= 0 && numero < numeroQuartos && "alugado".equals(situacao[numero])) {
            double despesas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das despesas extras:"));
            despesasExtras[numero] += despesas;
            JOptionPane.showMessageDialog(null, "Despesas extras registradas.");
        } else {
            JOptionPane.showMessageDialog(null, "Quarto não encontrado ou não alugado.");
        }
    }

    // Função para calcular a despesa total de um quarto
    static void calculaDespesaQuarto() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:"));
        if (numero >= 0 && numero < numeroQuartos && "alugado".equals(situacao[numero])) {
            double total = diarias[numero] * preco[numero] + despesasExtras[numero];
            JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + total);
        } else {
            JOptionPane.showMessageDialog(null, "Quarto não encontrado ou não alugado.");
        }
    }
}

