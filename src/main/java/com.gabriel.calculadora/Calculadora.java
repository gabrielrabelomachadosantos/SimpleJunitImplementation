package com.gabriel.calculadora;

public class Calculadora{

    public double somar(double a, double b) {
        return a+b;
    }

    public double subtrair(double a, double b) {
        return a-b;
    }

    public double multiplicar(double a, double b) {
        return a*b;
    }

    public double dividir(double a, double b) {
        if(a==0 || b==0) {
            throw new IllegalArgumentException("A ou B não podem ser iguais a 0");
        }

        return a/b;
    }

}
