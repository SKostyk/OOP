import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Bank banks [] = new Bank[3];
        banks [0] = new PrivatBank();
        banks [1] = new AlfaBank();
        banks [2] = new KredoBank();
        System.out.println("Enter deposit: ");
        int deposit = scanner.nextInt();
        for(int i = 0;i < banks.length; i++){
            banks[i].deposit(deposit);
            banks[i].withDraw(deposit);
            banks[i].deposit(deposit);
            System.out.println(banks[i].account());
        }
    }
}
