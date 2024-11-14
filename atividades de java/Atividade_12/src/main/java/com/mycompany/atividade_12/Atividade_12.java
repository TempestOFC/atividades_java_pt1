/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_12;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class Atividade_12 {

    public static void main(String[] args) {
        final int MAX_PRODUTOS = 50;
        
        // Arrays para armazenar o código, quantidade e preço de venda dos produtos
        int[] codigos = new int[MAX_PRODUTOS];
        int[] quantidades = new int[MAX_PRODUTOS];
        double[] precos = new double[MAX_PRODUTOS];
        int numProdutos = 0; // Quantidade de produtos cadastrados
        
        // Primeira fase: Cadastro de produtos
        while (true) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto (ou -1 para terminar):"));
            if (codigo == -1) {
                break; // Finaliza o cadastro
            }
            if (numProdutos < MAX_PRODUTOS) {
                codigos[numProdutos] = codigo;
                quantidades[numProdutos] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade disponível no estoque:"));
                precos[numProdutos] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda do produto:"));
                numProdutos++;
            } else {
                JOptionPane.showMessageDialog(null, "Número máximo de produtos cadastrados atingido.");
                break;
            }
        }
        
        // Segunda fase: Vendas
        double totalVendido = 0.0;
        
        while (true) {
            int codigoVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a ser vendido (ou 0 para finalizar as vendas):"));
            if (codigoVenda == 0) {
                break; // Finaliza as vendas
            }
            
            boolean produtoEncontrado = false;
            boolean vendaRealizada = false;
            
            for (int i = 0; i < numProdutos; i++) {
                if (codigos[i] == codigoVenda) {
                    produtoEncontrado = true;
                    
                    int quantidadeVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser vendida:"));
                    
                    if (quantidadeVenda <= quantidades[i]) {
                        quantidades[i] -= quantidadeVenda; // Subtrai a quantidade do estoque
                        totalVendido += quantidadeVenda * precos[i]; // Soma o valor da venda ao total vendido
                        JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
                        vendaRealizada = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Estoque Insuficiente para a venda.");
                    }
                    break;
                }
            }
            
            if (!produtoEncontrado) {
                JOptionPane.showMessageDialog(null, "Produto Não-Cadastrado.");
            }
        }
        
        // Exibição do total vendido no dia
        JOptionPane.showMessageDialog(null, "Total vendido no dia: R$ " + String.format("%.2f", totalVendido));
        
        // Listagem final dos produtos em estoque (ordem decrescente de quantidade)
        // Ordenando os produtos de acordo com a quantidade disponível
        for (int i = 0; i < numProdutos - 1; i++) {
            for (int j = i + 1; j < numProdutos; j++) {
                if (quantidades[i] < quantidades[j]) {
                    // Troca as quantidades
                    int tempQuant = quantidades[i];
                    quantidades[i] = quantidades[j];
                    quantidades[j] = tempQuant;
                    // Troca os códigos
                    int tempCodigo = codigos[i];
                    codigos[i] = codigos[j];
                    codigos[j] = tempCodigo;
                    // Troca os preços
                    double tempPreco = precos[i];
                    precos[i] = precos[j];
                    precos[j] = tempPreco;
                }
            }
        }
        
        // Exibindo a listagem dos produtos restantes no estoque
        StringBuilder listaProdutos = new StringBuilder("Listagem dos Produtos em Estoque:\n");
        listaProdutos.append(String.format("%-10s %-20s %-15s %-10s\n", "Código", "Produto", "Quantidade", "Preço"));
        listaProdutos.append("-------------------------------------------------------------\n");
        
        for (int i = 0; i < numProdutos; i++) {
            listaProdutos.append(String.format("%-10d %-20s %-15d %-10.2f\n", codigos[i], "Produto " + codigos[i], quantidades[i], precos[i]));
        }
        
        // Exibe a listagem final
        JOptionPane.showMessageDialog(null, listaProdutos.toString());
    }
}
