package com.example;

public class Triangulo {
     public static String tipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return "Valor inválido";
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return "Não é um triângulo";
        }

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
    

