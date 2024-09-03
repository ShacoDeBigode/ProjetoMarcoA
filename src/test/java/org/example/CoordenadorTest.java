package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordenadorTest {

    @Test
    public void testSalarioComMestrado() {
        Cargo coordenador = new Coordenador(4000, Escolaridade.MESTRADO);
        double salario = coordenador.calcularSalario();
        assertEquals(4800, salario, 0.02);
    }

    @Test
    public void testSalarioComDoutorado() {
        Cargo coordenador = new Coordenador(4000, Escolaridade.DOUTORADO);
        double salario = coordenador.calcularSalario();
        assertEquals(5200, salario, 0.03);
    }
    @Test
    public void testSalarioComGraduacao() {
        Cargo coordenador = new Coordenador(4000, Escolaridade.GRADUACAO);
        double salario = coordenador.calcularSalario();
        assertEquals(4400, salario, 0.01);
    }
    @Test
    public void testSalarioComEnsinoMedio() {
        Cargo coordenador = new Coordenador(4000, Escolaridade.GRADUACAO);
        double salario = coordenador.calcularSalario();
        assertEquals(4000, salario, 0.0);
    }
}
