class Bank {
    int balance = 2000;
    synchronized void withdraw(int amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println("Withdraw Successful");
        }else
            System.out.println("Insufficient balance");
    }    
}
public class Customer extends Thread{
    Bank b;
    Customer(Bank b){
        this.b=b;
    }
    public void run(){
        b.withdraw(700);
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        new Customer(b).start();
        new Customer(b).start();
    }
} 