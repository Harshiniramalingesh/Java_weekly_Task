package org.object_oriented_properties;
//instance initializer block.
class BankAccount {
    static int accountCounter = 1000;

    int accountNumber;
    double balance;


    {
        accountNumber = ++accountCounter;
        balance = 500.0; // minimum opening balance
        System.out.println("Account initialized");
    }

    BankAccount() {
        System.out.println("Default constructor called");
    }

    BankAccount(double initialDeposit) {
        balance += initialDeposit;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);

    }

    public static void main(String args[]) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(2000);

        b1.display();
        b2.display();
    }
}
