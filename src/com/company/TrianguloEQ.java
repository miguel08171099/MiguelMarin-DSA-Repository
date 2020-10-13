package com.company;

public class TrianguloEQ extends Figuras{
    private double b;
    private double h;

    public TrianguloEQ(double b, double h){
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return (this.b*this.h)/2;
    }

    @Override
    public String toString() {
        return "TrianguloEQ{" +
                "b=" + b +
                ", h= " + h + ", area=" + this.area() +
                '}';
    }
}
