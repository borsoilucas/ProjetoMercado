package br.com.lucas.projetomercado.models;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String tipoPlano;

    public Cliente(String nome, int idade, String cpf, String tipoPlano){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.tipoPlano = tipoPlano;
    }
}
