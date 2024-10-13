package com.example.exercicio3;

public class CalculadoraSalario {
    public static double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        double salarioLiquido;

        switch (cargo) {
            case DESENVOLVEDOR:
                if (salarioBase >= 3000) {
                    salarioLiquido = salarioBase * 0.80;  // 20% de desconto
                } else {
                    salarioLiquido = salarioBase * 0.90;  // 10% de desconto
                }
                break;

            case DBA:
            case TESTADOR:
                if (salarioBase >= 2000) {
                    salarioLiquido = salarioBase * 0.75;  // 25% de desconto
                } else {
                    salarioLiquido = salarioBase * 0.85;  // 15% de desconto
                }
                break;

            case GERENTE:
                if (salarioBase >= 5000) {
                    salarioLiquido = salarioBase * 0.70;  // 30% de desconto
                } else {
                    salarioLiquido = salarioBase * 0.80;  // 20% de desconto
                }
                break;

            default:
                throw new IllegalArgumentException("Cargo inválido");
        }

        return salarioLiquido;
    }
}
