
class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }
}

class Account extends Bank {
    long accountNumber;
    double balance;

    Account(String bankName, long accountNumber, double balance) {
        super(bankName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        displayBankDetails();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String bankName, long accountNumber,
                   double balance, double interestRate) {
        super(bankName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;

        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + interest);
    }
}

public class ex5 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(
            "SBI", 123456789, 50000, 5
        );

        s.calculateInterest();
    }
}
