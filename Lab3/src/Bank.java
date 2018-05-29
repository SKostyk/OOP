public abstract class Bank {
    protected String name;
    protected float depositPerc;
    protected float withDrawPerc;
    protected double depositAmoun;

    protected double perCentAdd(double add, double perCent){
        double result;
        result = Math.pow((double)(1+(perCent/100)),3) * add;
        return result;
    }
    protected double perCentTake(double take, double perCent){
        double result;
        result = Math.pow((double)(1-(perCent/100)),3) * take;
        return result;
    }
    abstract void deposit(double add);
    abstract void withDraw(double add);
    abstract String account();
}
