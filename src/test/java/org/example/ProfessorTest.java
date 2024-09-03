package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorTest {

    @Test
    public void testSalarioComEnsinoMedio() {
        Cargo professor = new Professor(200, 20, Escolaridade.ENSINO_MEDIO);
        double salario = professor.calcularSalario();
        assertEquals(4000, salario, 0.0);
    }

    @Test
    public void testSalarioComGraduacao() {
        Cargo professor = new Professor(200, 20, Escolaridade.GRADUACAO);
        double salario = professor.calcularSalario();
        assertEquals(4400, salario, 0.01);
    }

    @Test
    public void testSalarioComMestrado() {
        Cargo professor = new Professor(200, 20, Escolaridade.MESTRADO);
        double salario = professor.calcularSalario();
        assertEquals(4800, salario, 0.01);
    }

    @Test
    public void testSalarioComDoutorado() {
        Cargo professor = new Professor(200, 20, Escolaridade.DOUTORADO);
        double salario = professor.calcularSalario();
        assertEquals(5200, salario, 0.01);
    }
}
