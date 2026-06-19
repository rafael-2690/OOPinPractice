package br.com.alura.challenge3.bankAccount;

public class CurrentAccount extends BankAccount{
    private double fare;

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double chargeFee(){
        balance -= fare;
        return balance;
    }
}
