/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package DadosProdutos;

/**
 *
 * @author Carlos Matos
 */
public class Produto {
    public String nome;
    public float preco;
    public int qtdEstoque;
    
    public float totalValorEstoque;
    
    public Produto(String nome, float valor, int qtdEstoque){
        this.nome = nome;
        this.preco = valor;
        this.qtdEstoque = qtdEstoque;
    }
    
    public void CalculaValorEtoque(){
        this.totalValorEstoque = this.qtdEstoque * this.preco;
        System.out.println("Valor total no estoque: " + this.totalValorEstoque);
    }
    
    public void AdicionaQuantidade(int qtdAdicionar){
        this.qtdEstoque += qtdAdicionar;
        System.out.println("Nome: "+ this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade no estoque: "+ this.qtdEstoque);
        CalculaValorEtoque();
    }
    
    public void RemoveQuantidade(int qtdRemover){
        this.qtdEstoque -= qtdRemover;
        System.out.println("Nome: "+ this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quantidade no estoque: "+ this.qtdEstoque);
        CalculaValorEtoque();
    }
    
}
