// Encapsulation
class Bank{
    private double balance;

    public void setbalance(double balance){
        this.balance=balance;
    }
    public double getbalance(){
        return balance;
    }
}
class TestBank{
    public static void main(String args[]){
        Bank b = new Bank();
        b.setbalance(1000.6);
        System.out.println("Balnaace is " + b.getbalance());
    }
}