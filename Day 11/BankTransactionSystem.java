// Mini Assignment
class BankAccount{
    private int balance = 1000;

    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" Want to withdraw"+balance);

        if(balance<amount){
            System.out.println(" Insufficient balance ");

            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName()+" withdraw successful . your current balance = "+ balance);
    }
    synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" depositing "+amount);
        balance += amount;
        System.out.println(" Deposit Successful . your current balance = "+ balance);
        notify();
    }
}
class Customer extends Thread{
    BankAccount account;
    int amount;
    Customer(BankAccount account,int amount,String name){
        super(name);
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        account.withdraw(amount);
    }
}
class Depositer extends Thread{
    BankAccount account;
    int amount;
    Depositer(BankAccount account,int amount){
        this.account=account;
        this.amount=amount;
    }
    public void run(){
        account.deposit(amount);
    }
}
public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account,1500," Customer-1 ");
        Depositer d1 = new Depositer(account, 1000);

        c1.start();
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        d1.start();
    }
}
