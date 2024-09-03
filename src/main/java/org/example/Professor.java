package org.example;

public class Professor extends Cargo {
    private int quantidadeAulas;
    private Escolaridade escolaridade;

    public Professor(double salarioBase, int quantidadeAulas, Escolaridade escolaridade) {
        super(salarioBase);
        this.quantidadeAulas = quantidadeAulas;
        this.escolaridade = escolaridade;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = salarioBase * quantidadeAulas;
        return salarioTotal * (1 + escolaridade.getPercentualAumento());
    }
}
