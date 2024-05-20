import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import SobreCarga.Calculadora;


 class CalculadoraTest {

    @Test
    public void testSomarInteiros() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.somar(5, 3));
    }

    @Test
    public void testSomarDecimais() {
        Calculadora calc = new Calculadora();
        assertEquals(6.0, calc.somar(2.5, 3.5), 0.0001);
    }
}
