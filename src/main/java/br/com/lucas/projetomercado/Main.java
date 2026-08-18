package br.com.lucas.projetomercado;

import br.com.lucas.projetomercado.models.Produto;
import br.com.lucas.projetomercado.models.ProdutoPerecivel;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("maças", 2.00, 10);
        ProdutoPerecivel produto2 = new ProdutoPerecivel("bananas", 4, 30,"18/09/2026");

        produto2.aplicarDesconto(5);
        produto2.adiconarAoEstoque(100);
        produto2.debitarDoEstoque(50);
        produto2.alterarPreco(2);
        produto2.alterarPreco(0.25);


    }
}
