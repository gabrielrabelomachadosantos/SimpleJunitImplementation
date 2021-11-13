package com.gabriel.test.calculadora;

import com.gabriel.calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void testeSomar() {
        assertEquals(3, calculadora.somar(1,2));
    }

    @Test
    public void testeSubtrair() {
        assertEquals(2, calculadora.subtrair(4, 2));
    }

    @Test
    public void testeMultiplicar() {
        assertEquals(2, calculadora.multiplicar(1, 2));
    }

    @Test
    public void testeDividir() {
        assertEquals(2, calculadora.dividir(4, 2));
    }

    @Test()
    public void testeDividirPorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(1, 0));
        assertEquals("A ou B não podem ser iguais a 0", exception.getMessage());
    }

}
