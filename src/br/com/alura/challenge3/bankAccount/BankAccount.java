package br.com.alura.challenge3.bankAccount;

public class BankAccount {
    private String holder;
    protected double balance;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }

}
