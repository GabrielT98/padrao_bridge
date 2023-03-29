package org.example;

public class Bone extends Produto {
    public Bone(String nome, Double valor) {
        super(nome,valor);
    }
    public Double calcularDesconto() {
        return this.valor - this.desconto.valorDesconto();
    }
}
