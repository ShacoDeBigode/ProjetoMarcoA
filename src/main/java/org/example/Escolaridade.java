package org.example;

public enum Escolaridade {
    ENSINO_MEDIO(0.0),
    GRADUACAO(0.1),
    MESTRADO(0.2),
    DOUTORADO(0.3);

    private final double percentualAumento;

    Escolaridade(double percentualAumento) {
        this.percentualAumento = percentualAumento;
    }

    public double getPercentualAumento() {
        return percentualAumento;
    }
}
