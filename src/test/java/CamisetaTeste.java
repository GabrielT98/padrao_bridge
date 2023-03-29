import org.example.Camiseta;
import org.example.DescontoFixo;
import org.example.DescontoVariado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CamisetaTeste {
    @Test
    void deveRetornarCamisetaComDescontoFixo() {
        DescontoFixo desconto = new DescontoFixo();
        Camiseta camiseta = new Camiseta("Camisa Reserva",100.00);
        camiseta.setDesconto(desconto);
        assertEquals(90.00, camiseta.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarCamisetaComDescontoVariado() {
        DescontoVariado desconto = new DescontoVariado();
        desconto.setDesconto(30.00);
        Camiseta camiseta = new Camiseta("Camisa Reserva",100.00);
        camiseta.setDesconto(desconto);
        assertEquals(70.00, camiseta.calcularDesconto());
    }

}
