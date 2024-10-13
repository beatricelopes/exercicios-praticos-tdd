package exercicio1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import com.example.exercicio1.Triangulo;

public class TrianguloTest {
    // Teste para triângulo escaleno válido
    @Test
    public void testTrianguloEscaleno() {
        assertEquals("Escaleno", Triangulo.tipoTriangulo(3, 4, 5));
    }


    // Teste para triângulo isósceles válido (mesmos lados nos primeiros dois valores)
    @Test
    public void testTrianguloIsosceles() {
        assertEquals("Isósceles", Triangulo.tipoTriangulo(5, 5, 3));
    }

    // Teste para triângulo isósceles válido (mesmos lados nos últimos dois valores)
    @Test
    public void testTrianguloIsosceles1() {
        assertEquals("Isósceles", Triangulo.tipoTriangulo(3, 5, 5));
    }

    // Teste para triângulo isósceles válido (mesmos lados no primeiro e último valor)
    @Test
    public void testTrianguloIsosceles2() {
        assertEquals("Isósceles", Triangulo.tipoTriangulo(5, 3, 5));
    }

    // Teste para triângulo isósceles válido (mesmos lados no primeiro e último valor)
    @Test
    public void testTrianguloIsosceles3() {
        assertEquals("Isósceles", Triangulo.tipoTriangulo(7, 4, 4));
    }


    // Teste para triângulo equilátero válido
    @Test
    public void testTrianguloEquilatero() {
        assertEquals("Equilátero", Triangulo.tipoTriangulo(3, 3, 3));
    }



    // Teste para valor zero (não é um triângulo)
    @Test
    public void testValorZero() {
        assertEquals("Valor inválido", Triangulo.tipoTriangulo(0, 4, 5));
    }

    // Teste para valor negativo (não é um triângulo)
    @Test
    public void testValorNegativo() {
        assertEquals("Valor inválido", Triangulo.tipoTriangulo(-1, 4, 5));
    }

    // Teste para soma de dois lados igual ao terceiro (não é triângulo)
    @Test
    public void testSomaDoisLadosIgualTerceiro() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(2, 3, 5));
    }

    // Teste para permutação (soma dois lados igual ao terceiro)
    @Test
    public void testSomaDoisLadosIgualTerceiro1() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(5, 2, 3));
    }

    @Test
    public void testSomaDoisLadosIgualTerceiro2() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(3, 5, 2));
    }

    // Teste para soma de dois lados menor que o terceiro (não é triângulo)
    @Test
    public void testSomaDoisLadosMenorQueTerceiro() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(1, 2, 5));
    }

    // Teste para permutação (soma dois lados menor que o terceiro)
    @Test
    public void testSomaDoisLadosMenorQueTerceiro1() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(5, 1, 2));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiro2() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(2, 5, 1));
    }

    @Test
    public void testSomaDoisLadosMenorQueTerceiro3() {
        assertEquals("Não é um triângulo", Triangulo.tipoTriangulo(1, 2, 5));
    }

    // Teste para todos os valores iguais a zero
    @Test
    public void testTodosValoresZero() {
        assertEquals("Valor inválido", Triangulo.tipoTriangulo(0, 0, 0));
    }
    
}
