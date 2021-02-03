package kz.iitu.assignment1;

import java.util.Scanner;

public class ATM {
    public ATM(){super();}

    public void main(){
    Bank bank = new Bank();
    Account acc1 = new Account("Nurdaulet",25000,123456789,1234);
    Account acc2 = new Account("Erasyl",10000, 1122334455,0000);
    bank.addBank(acc1);
    bank.addBank(acc2);
    bank.showAccounts();

        System.out.println("Welcome to ATM. Please enter your card:");
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        do {
        int card = sc.nextInt();
        valid = bank.authorize(card);
        if(!valid){
            System.out.println("Error! Try again!");
        } } while (!valid);


        int password;
        boolean pValid = false;
        double amount;
        do{
            System.out.println("Enter PIN code: ");
            password = sc.nextInt();
            if (bank.checkPIN(password) == true){
                pValid = true;
                break;
            } else {
                System.out.println("Wrong password! Try again!");
            }

        }while (!pValid);

        boolean valid2 = true;
        while (valid2){
            System.out.println("[1] Check balance\n[2] Withdraw\n[3] Top up\n[4] Exit");
            int ch = sc.nextInt();
            if(ch == 1){
                bank.checkBalance();
                break;
            }
            if(ch == 2 ){
                System.out.println("Enter amount of money:");
                amount = sc.nextDouble();
                double balances = bank.withdraw(amount);
                break;
            }
            if(ch == 3 ){
                System.out.println("Enter amount of money:");
                amount = sc.nextDouble();
                double balances = bank.withdraw(amount);
                break;
            }
            if(ch == 4 ){
                System.exit(0);
            }


            valid2 = false;
        }



    }
}
