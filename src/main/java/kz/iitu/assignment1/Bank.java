package kz.iitu.assignment1;

import java.util.ArrayList;

public class Bank implements BankService{
    private ArrayList<Account> accounts;



public Bank(){
accounts= new ArrayList<>();
}

public void addBank(Account acc){
    accounts.add(acc);
}
public void showAccounts(){
    for (Account acc : accounts) {
        System.out.println(acc.toString());
    }

}

    @Override
    public boolean authorize(int card) {
        boolean isTrue = false;
        boolean isIt = false;
        for(Account acc : accounts){
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
        for(Account acc : accounts){
            if (passCode == acc.getPass()) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    @Override
    public void checkBalance() {
        for (Account acc: accounts){
                System.out.println("Your balance: " + acc.getBalance());
            }

    }

    @Override
    public double withdraw(double amount) {
        double amount2 = 0;
        for (Account acc: accounts){
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
        for (Account acc: accounts){
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
}
