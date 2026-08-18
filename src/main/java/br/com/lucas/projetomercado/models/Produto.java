package br.com.lucas.projetomercado.models;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adiconarAoEstoque(int quantidadeParaAdicionar){
        quantidadeEstoque = quantidadeEstoque + quantidadeParaAdicionar;
        System.out.println("Quantidade adicionada ao estoque, valor atualizado para " + quantidadeEstoque + " " + nome);
    }

    public void debitarDoEstoque(int quantidadeParaDebitar){
        if (quantidadeParaDebitar>quantidadeEstoque || quantidadeEstoque<1){
            System.out.println("Valor invalido para debitar");
        } else {
            quantidadeEstoque = quantidadeEstoque - quantidadeParaDebitar;
            System.out.println("Quantidade debitada do estoque, valor atualizado para " + quantidadeEstoque + " " + nome);
        }
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem >= 5 && porcentagem <= 50){
            this.preco -= this.preco * (porcentagem/100);
            System.out.println("Desconto de " + porcentagem + "% foi aplicado");
        } else {
            System.out.println("Desconto invalido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome do produto: " + nome + " | Preco do produto: R$" + String.format("%.2f", preco) + " | Quantidade em estoque: " + quantidadeEstoque;
    }
}
