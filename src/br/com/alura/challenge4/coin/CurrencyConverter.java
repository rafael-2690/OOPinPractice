package br.com.alura.challenge4.coin;

public class CurrencyConverter implements FinancialConversion {
    @Override
    public void converDollarReal(double USDollar) {
        System.out.println("The value is: " + USDollar*5);
    }
}
