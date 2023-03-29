import org.example.Bone;
import org.example.DescontoFixo;
import org.example.DescontoVariado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BoneTeste {
    @Test
    void deveRetornarBoneComDescontoFixo() {
        DescontoFixo desconto = new DescontoFixo();
        Bone bone = new Bone("Boné adidas",200.00);
        bone.setDesconto(desconto);
        assertEquals(190.00, bone.calcularDesconto());
    }

    @Test
    void deveRetornarBoneComDescontoVariado() {
        DescontoVariado desconto = new DescontoVariado();
        desconto.setDesconto(55.00);
        Bone bone = new Bone("Boné adidas",200.00);
        bone.setDesconto(desconto);
        assertEquals(145.00, bone.calcularDesconto());
    }

}
