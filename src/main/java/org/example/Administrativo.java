package org.example;

public class Administrativo extends Cargo {

    public Administrativo(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
