package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть діаметр кола - ");
        double diametr = scan.nextDouble();
        Circle circle = new Circle(diametr);


        System.out.println("Введіть висоту циліндра -  ");
        double height = scan.nextDouble();
        Cylindr cylindr = new Cylindr(diametr,height);
        System.out.print("Площа кола: " + circle.square() + "\n");
        System.out.print("Площа циліндра: " + cylindr.square());
    }

}