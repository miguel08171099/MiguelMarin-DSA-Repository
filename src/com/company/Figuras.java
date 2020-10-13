package com.company;

public abstract class Figuras implements Comparable<Figuras>{
    public abstract double area();

    @Override
    public int compareTo(Figuras o) {
        return (int)(this.area()-o.area());
    }
}
