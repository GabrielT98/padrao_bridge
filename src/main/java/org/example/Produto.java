package org.example;

public abstract class Produto {

    public  String nome;
    public  Double valor;
    protected Desconto desconto;


    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void setDesconto(Desconto tipoDesconto) {
        this.desconto = tipoDesconto;
    }
    public abstract Double calcularDesconto();

}
