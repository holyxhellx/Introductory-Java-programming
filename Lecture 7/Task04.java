package assignment.pkg6;

import java.util.Date;

public class Task04 {
    public static class Account {
        private int     id                  = 0;
        private double  balance             = 0;
        private double  annualInterestRate  = 0;
        private Date    dateCreated         = new Date(System.currentTimeMillis());
        
        //----- Constructor -----//
        public Account() {
            this.id                 = id;
            this.balance            = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated        = dateCreated;
        }
        
        public Account(int id, double balance) {
            this.id                 = id;
            this.balance            = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated        = dateCreated;
        }
        
        //----- GET / SET values -----//
        int getId() {
            return id;
        }
        
        void setId(int id) {
            this.id = id;
        }
        
        double getBalance() {
            return balance;
        }
        
        void setBalance(double balance) {
            this.balance = balance;
        }
        
        double getAnnualInterestRate() {
            return annualInterestRate;
        }
        
        void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }
        
        Date getdateCreated() {
            return dateCreated;
        }
        
        //----- Methods ------//
        double getMonthlyInterestRate() {
            return (annualInterestRate / 12); 
        }
        
        double getMonthlyInterest() {
            return ((annualInterestRate / 12) * balance);
        }
        
        void withdraw(double amount) {
            this.balance = balance - amount;
        }
        
        void deposit (double amount) {
            this.balance = balance + amount;
        }
    }
    
    public static void main (String[] args) {
        Account myAccount = new Account(1122, 20000);
        
        myAccount.setAnnualInterestRate(0.045);
        
        myAccount.withdraw(2500);
        myAccount.deposit(3000);
        
        System.out.println("Account: myAccount");
        System.out.println("The balance: " + myAccount.balance);
        System.out.println("The monthly interest: " + myAccount.getMonthlyInterest());
        System.out.println("The date of creation: " + myAccount.getdateCreated()); //.toString()
    }
}
