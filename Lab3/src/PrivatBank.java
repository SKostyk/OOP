public class PrivatBank extends Bank {

    void deposit(double add){
        super.depositAmoun += super.perCentAdd(add,12);
    }
    void withDraw(double add){
        super.depositAmoun -= super.perCentTake(add,8);
    }
    String account(){
        super.name = "Balance in your PrivatBank: ";
        return super.name + super.depositAmoun + "$";
    }


}
