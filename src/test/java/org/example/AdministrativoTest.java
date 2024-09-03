package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdministrativoTest {

    @Test
    public void testSalarioComEnsinoMedio() {
        Cargo administrativo = new Administrativo(3000);
        double salario = administrativo.calcularSalario();
        assertEquals(3000, salario, 0.01);
    }

    @Test
    public void testSalarioComGraduacao() {
        Cargo administrativo = new Administrativo(3000);
        double salario = administrativo.calcularSalario();
        assertEquals(3000, salario, 0.01);
    }
}
