import java.util.Scanner;

public class Variable {
    public double price1(){
        return price;
    }
    private double price = 3;
    private double distance;

    void showInfo(){
        System.out.println("Введіть відстань в км ");
        Scanner scanner = new Scanner(System.in);
        distance = scanner.nextDouble();
        System.out.println("До оплати " + distance*price1()+"гривень");
    }
}