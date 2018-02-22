package com.company;
public class Cylindr extends Circle {
    private double height;

    public Cylindr(double diameter, double height){
        super(diameter);
        this.height = height;
    }

    @Override
    public double square(){
        float square = (float) (3.14 * diametr * diametr * height);
        return square;
    }
}