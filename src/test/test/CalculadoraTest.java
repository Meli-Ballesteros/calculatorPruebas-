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
    }@Test
    public void testMultiplicacion(){
        //Arrange
        int a = 5;
        int b = 5;
        project calculadora = new project();

        //Act
        int resultado = calculadora.multiplication(a,b);

        //Assert
        assertEquals(25, resultado);
    }
    @Test
    public void testDivision(){
        int a = 50;
        int b = 2;
        project calculadora = new project();

        //act
        int resultado = calculadora.division(a,b);

        //assert
        assertEquals(25, resultado);
    }
    @Test
    public void testResta(){
        int a = 100;
        int b = 50;
        project calculadora = new project();

        //act
        int resultado = calculadora.subtraction(a,b);

        //assert
        assertEquals(50, resultado);

    }
}