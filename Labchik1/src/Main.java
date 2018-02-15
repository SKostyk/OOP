import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ціна за кілометр становить 3 гривні");
        System.out.println("Введіть відстань в км ");
        Variable var = new Variable();
        var.distance = scan.nextDouble();
        System.out.println("До оплати " + var.distance*var.price1()+"гривень");
    }
}
