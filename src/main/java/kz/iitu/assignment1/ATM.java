package kz.iitu.assignment1;

import ch.qos.logback.core.net.server.Client;

import java.util.Scanner;

public class ATM implements BankService{
    private String ATMName;

    public ATM(String ATMName) {
        this.ATMName = ATMName;
    }


    private Account acc;
    private Bank bank;

    @Override
    public void menu() {
        System.out.println("Welcome to " + ATMName + ". Please enter your card:");
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        do {
        int card = sc.nextInt();
        valid = authorize(card);
        if(!valid){
            System.out.println("Error! Try again!");
        } } while (!valid);


        int password;
        boolean pValid = false;
        double amount;
        do{
            System.out.println("Enter PIN code: ");
            password = sc.nextInt();
            if (checkPIN(password) == true){
                pValid = true;
                break;
            } else {
                System.out.println("Wrong password! Try again!");
            }

        }while (!pValid);

        boolean valid2 = true;
        while (valid2){
            System.out.println("[1] Check balance\n[2] Withdraw\n[3] Top up\n[4] Change PIN\n[5] Exit");
            int ch = sc.nextInt();
            if(ch == 1){
                checkBalance();
                break;
            }
            if(ch == 2 ){
                System.out.println("Enter amount of money:");
                amount = sc.nextDouble();
                double balances =withdraw(amount);
                break;
            }
            if(ch == 3 ){
                System.out.println("Enter amount of money:");
                amount = sc.nextDouble();
                double balances = topUP(amount);
                break;
            }
            if(ch == 4 ){
                changePIN();
            }
            if(ch == 5 ){
                System.exit(0);
            }


            valid2 = false;
        }

    }
   

    @Override
    public boolean authorize(int card) {
        boolean isTrue = false;
        boolean isIt = false;
        while (!isIt){
            if (card == acc.getCard()) {
                isTrue = true;
                if (card == acc.getCard()){
                    System.out.println("card is authorized");
                    isIt = true;
                    break;
                }if(isIt == false) {
                    System.out.println("ERROR!");
                }
            }}
        if(isTrue == false){
            System.out.println("card is not supported by ATM");
        }
        System.out.println(isTrue && isIt);
        return (isTrue && isIt);
    }



    @Override
    public boolean checkPIN(int passCode) {
        boolean isTrue = false;
        while (!isTrue){
            if (passCode == acc.getPass()) {
                isTrue = true;
                System.out.println("Welcome " + acc.getName() +"!");
            }}

        return isTrue;
    }

    @Override
    public void checkBalance() {
            System.out.println("Your balance: " + acc.getBalance());
    }

    @Override
    public double withdraw(double amount) {
        double amount2 = 0;
        boolean isTrue =false;
        while (!isTrue){
            if(amount <= acc.getBalance()){
                System.out.println(acc.getBalance());
                amount2 = acc.getBalance() - amount;
                acc.setBalance(amount2);
                System.out.print("Your remaining balance is:  ");
                System.out.println(acc.getBalance());
                return amount2;
            }
        }
        return amount2;
    }

    @Override
    public double topUP(double amount) {
        double amount2 = 0;
        boolean isTrue =false;
        while (!isTrue){
            if(amount <= acc.getBalance()){
                System.out.println(acc.getBalance());
                amount2 = acc.getBalance() + amount;
                acc.setBalance(amount2);
                System.out.print("Your remaining balance is:  ");
                System.out.println(acc.getBalance());
                return amount2;
            }
        }
        return amount2;
    }

    @Override
    public void changePIN() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new PIN: ");
        int pin = scan.nextInt();
        acc.setPass(pin);
        System.out.println("PIN code successfully changed! Your new PIN: " + pin);
    }
}
