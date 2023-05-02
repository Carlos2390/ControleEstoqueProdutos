/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DadosProdutos;

import java.util.Scanner;

/**
 *
 * @author Carlos Matos
 */
public class TestaDadosProdutos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o nome do produto?");
        String nome = entrada.nextLine();
        
        System.out.println("Qual o preco do produto?");
        float preco = entrada.nextFloat();
        
        System.out.println("Qual a quantidade do produto no estoque?");
        int qtdEstoque = entrada.nextInt();
        
        Produto p1 = new Produto(nome, preco, qtdEstoque);
        
        System.out.println("Deseja Adicionar ou Remover o produto do estoque?");
        System.out.println("[1] Adicionar");
        System.out.println("[2] Remover");
        int escolha = entrada.nextInt();
        
        switch(escolha){
            case 1:
                System.out.println("Qual a quantidade a adicionar?");
                int qtd = entrada.nextInt();
                p1.AdicionaQuantidade(qtd);
                break;
            case 2:
                System.out.println("Qual a quantidade a remover?");
                qtd = entrada.nextInt();
                p1.RemoveQuantidade(qtd);
        }
    }
}
