package org.example;

public class DescontoFixo implements Desconto{
    public Double desconto =  10.00;

    @Override
    public Double valorDesconto() {
        return desconto;
    }
}
