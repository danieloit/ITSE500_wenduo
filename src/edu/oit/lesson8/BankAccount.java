package edu.oit.lesson8;


public class BankAccount {
    public String id;
    private double balance = 0;
    private double transactions = 0;
    
    public static void main(String[] args) {
        BankAccount savings = new BankAccount();
        
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        
        System.out.println("The balance is " + savings.getBalance() + " after four savings.");
        
        savings.transactionFee(10.00);
        
        System.out.println("The balance is " + savings.getBalance() + " after deducting transaction fee.");
        savings.transactionFee(5.00);
        
        
    }
    

    public double getBalance() {
        return balance;
    }

    public double getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        
        this.balance += amount;
        this.transactions++;
        
    }
    
    public void withdraw(double amount) {
        
        this.balance -= amount;
        this.transactions++;
        
    }
    
    public boolean transactionFee(double amount) {
        
    	double fee = 0;
        boolean notEmpty;
        for (int i = 1; i<= this.transactions; i++) {
            fee += i * amount;
        }
        double finalBalance = this.balance - fee;
        if (finalBalance >=0) {
           
            notEmpty = true;
        } else {
            finalBalance=0;
            notEmpty = false;
        }
        this.balance= finalBalance;
        return notEmpty;
    }

}