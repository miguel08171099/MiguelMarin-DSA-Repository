package com.company;

public class Cuadrado extends Rectangulo{

    public Cuadrado(double l){

        super(l, l);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "l= " + super.getL1() + ", area=" + this.area() +
                '}';
    }
}
