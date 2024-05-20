import SobreEscrita.Animal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import SobreEscrita.Cachorro;


public class AnimalTest {

    @Test
    public void testEmitirSomAnimal() {
        Animal animal = new Animal();
        assertEquals("Som genérico de animal", animal.emitirSom());
    }

    @Test
    public void testEmitirSomCachorro() {
        Cachorro cachorro = new Cachorro();
        assertEquals("Au Au", cachorro.emitirSom());
    }
}