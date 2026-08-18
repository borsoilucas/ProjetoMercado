package br.com.lucas.projetomercado.models;

public class ProdutoPerecivel extends Produto{

    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidadeEstoque, String dataDeValidade){
        super(nome, preco, quantidadeEstoque);
        this.dataDeValidade = dataDeValidade;
    }


}
