package exercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import com.example.exercicio3.CalculadoraSalario;
import com.example.exercicio3.Cargo;
import com.example.exercicio3.Funcionario;

public class CalculadoraSalarioTest {
     @Test
    public void testSalarioDesenvolvedorMaiorQue3000() {
        Funcionario desenvolvedor = new Funcionario("Ana", "ana@empresa.com", 4000.0, Cargo.DESENVOLVEDOR);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(desenvolvedor);
        assertEquals(3200.0, salarioLiquido, 0.01);  // 20% de desconto
    }

    @Test
    public void testSalarioDesenvolvedorMenorQue3000() {
        Funcionario desenvolvedor = new Funcionario("Carlos", "carlos@empresa.com", 2500.0, Cargo.DESENVOLVEDOR);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(desenvolvedor);
        assertEquals(2250.0, salarioLiquido, 0.01);  // 10% de desconto
    }

    @Test
    public void testSalarioDBAMaiorQue2000() {
        Funcionario dba = new Funcionario("Maria", "maria@empresa.com", 3000.0, Cargo.DBA);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(dba);
        assertEquals(2250.0, salarioLiquido, 0.01);  // 25% de desconto
    }

    @Test
    public void testSalarioDBAMenorQue2000() {
        Funcionario dba = new Funcionario("Paulo", "paulo@empresa.com", 1800.0, Cargo.DBA);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(dba);
        assertEquals(1530.0, salarioLiquido, 0.01);  // 15% de desconto
    }

    @Test
    public void testSalarioGerenteMaiorQue5000() {
        Funcionario gerente = new Funcionario("Julio", "julio@empresa.com", 6000.0, Cargo.GERENTE);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(gerente);
        assertEquals(4200.0, salarioLiquido, 0.01);  // 30% de descontoFuncionario gerente = new Funcionario("Julio", "julio@empresa.com", 6000.0, Cargo.GERENTE);
    }

    @Test
    public void testSalarioGerenteMenorQue5000() {
        Funcionario gerente = new Funcionario("Marina", "marina@empresa.com", 4500.0, Cargo.GERENTE);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(gerente);
        assertEquals(3600.0, salarioLiquido, 0.01);  // 20% de desconto
    }

    @Test
    public void testSalarioTestadorMaiorQue2000(){
        Funcionario testador = new Funcionario("Matheus", "matheus@empresa.com", 3000.0, Cargo.TESTADOR);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(testador);
        assertEquals(2250.0, salarioLiquido, 0.01);  // 25% de desconto
    }

    @Test
    public void testSalarioTestadorMenorQue2000() {
        Funcionario testador = new Funcionario("Paulo", "paulo@empresa.com", 1800.0, Cargo.TESTADOR);
        double salarioLiquido = CalculadoraSalario.calcularSalarioLiquido(testador);
        assertEquals(1530.0, salarioLiquido, 0.01);  // 15% de desconto
    }

    @Test
    public void testCargoInexistente() {
        Funcionario semCargo = new Funcionario("Bruno", "bruno@empresa.com", 1800.0, Cargo.NA);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraSalario.calcularSalarioLiquido(semCargo);
        });

        assertEquals("Cargo inválido", exception.getMessage());
    }
}
