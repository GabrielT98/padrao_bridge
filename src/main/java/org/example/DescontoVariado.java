package org.example;

public class DescontoVariado implements Desconto{

    public Double desconto;

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public Double valorDesconto() {
        return this.desconto;
    }
}
