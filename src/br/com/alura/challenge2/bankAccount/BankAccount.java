package br.com.alura.challenge2.bankAccount;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String holderName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void DisplayRecord(){
        System.out.printf("""
                The holder this account is: %s
                The balance is: %.2f
                """, holderName, balance);
    }
}
