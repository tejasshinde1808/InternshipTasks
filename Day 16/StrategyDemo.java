interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Credit Card Payment");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("UPI Payment");
    }
}

class PaymentContext {
    Payment payment;

    PaymentContext(Payment payment) {
        this.payment = payment;
    }

    void execute() {
        payment.pay();
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext p =
                new PaymentContext(new UPI());
        p.execute();
    }
}
