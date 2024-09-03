package org.example;

public abstract class Cargo {
    protected double salarioBase;

    public Cargo(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

