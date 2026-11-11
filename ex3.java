
class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void makePayment() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {
    UPI(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("UPI Payment Successful: " + amount);
    }
}

class CreditCard extends Payment {
    CreditCard(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Credit Card Payment Successful: " + amount);
    }
}

class DebitCard extends Payment {
    DebitCard(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Debit Card Payment Successful: " + amount);
    }
}

public class ex3 {
    public static void main(String[] args) {
        Payment p;

        p = new UPI(1000);
        p.makePayment();

        p = new CreditCard(2000);
        p.makePayment();

        p = new DebitCard(3000);
        p.makePayment();
    }
}
