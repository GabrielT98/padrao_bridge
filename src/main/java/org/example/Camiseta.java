package org.example;
public class Camiseta extends Produto{


    public Camiseta(String nome, Double valor) {
        super(nome, valor);
    }

    public Double calcularDesconto() {
        return this.valor - this.desconto.valorDesconto();
    }


}