import org.junit.Test;
import static org.junit.Assert.assertEquals;
import model.project;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        // Arrange
        int a = 2;
        int b = 3;
        project calculadora = new project();

        // Act
        int resultado = calculadora.addition(a, b);

        // Assert
        assertEquals(5, resultado);
    }
}