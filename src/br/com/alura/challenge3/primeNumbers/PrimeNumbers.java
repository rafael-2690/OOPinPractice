package br.com.alura.challenge3.primeNumbers;

public class PrimeNumbers {
    private boolean prime = true;

    public void checkPrimeNumbers(int num){
        for(int i = 2; i < num; i++ ){
            if(num%i==0){
                prime = false;
                break;
            }
        }
        if(prime == true){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
    }
    public void listPrimeNumbers(int num){
        for(int i = 2; i < num; i++ ){

            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(i);
            }
        }
    }


}
