package com.company;

public class Circulo extends Figuras{
    private double r;

    public Circulo(double r){
        this.r =r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "r= " + r + ", area=" + this.area() +
                '}';
    }
}
