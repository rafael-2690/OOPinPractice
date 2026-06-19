package br.com.alura.challenge2.bankAccount;

public class TestAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setHolderName("Rafael");
        bankAccount.setBalance(2200.50);
        bankAccount.setAccountNumber(20);
        bankAccount.DisplayRecord();
    }
}
