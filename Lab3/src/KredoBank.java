public class KredoBank extends Bank{

    void deposit(double add){
        super.depositAmoun += super.perCentAdd(add,4);
    }
    void withDraw(double add){
        super.depositAmoun -= super.perCentTake(add,2);
    }
    String account(){
        super.name = "Balance in your KredoBank: ";
        return super.name + super.depositAmoun + "$";
    }
}
