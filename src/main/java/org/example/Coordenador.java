package org.example;

public class Coordenador extends Cargo {
    private Escolaridade escolaridade;

    public Coordenador(double salarioBase, Escolaridade escolaridade) {
        super(salarioBase);
        this.escolaridade = escolaridade;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (1 + escolaridade.getPercentualAumento());
    }
}
