package exercise_1;

public class Bank {
    double balance;
    double rate;

    public Bank() {
        System.out.println("Calculating interest !!!!!");
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(){
        return getBalance()*(getRate()/1200);
    }
}
