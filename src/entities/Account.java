package entities;

public class Account {
    private int accNumber;
    private String holder;
    private double balance;



    public Account(int accNumber, String name) {
        this.accNumber = accNumber;
        this.holder = holder;
    }

    public Account(double initialDeposit, int accNumber, String holder) {
        deposit(initialDeposit);
        this.holder = holder;
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5;
    }
    public void deposit(double amount){
        this.balance += amount;
    }

    public String toString(){
        return  "Account " + accNumber + ", Holder: " + name + ", Balance: " + balance;
    }
}
