package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account acc;

        System.out.println("Enter account number: ");
        int accNumber = scan.nextInt();
        System.out.println("Enter account holder: ");
        String holder = scan.next();
        System.out.println("Is there any initial deposit (y/n)? ");
        char answer = scan.next().charAt(0);

        if(answer == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            acc = new Account(initialDeposit, accNumber, holder);
        } else {
            acc = new Account(accNumber, holder);
        }


        System.out.println("Account data: " + acc);

        System.out.println("Enter deposit value: ");
        double amount = scan.nextDouble();
        acc.deposit(amount);
        System.out.println("Updated account data: " + acc);

        System.out.println("Enter a withdraw value: ");
        amount = scan.nextDouble();
        acc.withdraw(amount);
        System.out.println("Updated account data: " + acc);
    }
}
