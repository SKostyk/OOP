package com.company;

public class Circle {
    protected  double diametr;
    public Circle(double diametr){
        this.diametr = diametr;
    }
    public double square(){
        double square =(double) (3.14*diametr*diametr/4);
    return square;
    }

}
