package br.com.alura.challenge3.bankAccount;

public class TestBank {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();

        currentAccount.setBalance(2000);
        currentAccount.setHolder("Alura");

        currentAccount.deposit(500);
        currentAccount.withdraw(100);
        currentAccount.checkBalance();
        currentAccount.setFare(50);
        currentAccount.chargeFee();
        currentAccount.checkBalance();
    }
}
