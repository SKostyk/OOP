public class AlfaBank extends Bank {
    void deposit(double add){
        super.depositAmoun += super.perCentAdd(add,10);
    }
    void withDraw(double add){
        super.depositAmoun -= super.perCentTake(add,5);
    }
    String account(){
        super.name = "Balance in your AlfaBank: ";
        return super.name + super.depositAmoun + "$";
    }
}
