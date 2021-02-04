package kz.iitu.assignment1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private BankService bankService;

    public Bank(ArrayList<Account> accounts, BankService bankService) {
        this.accounts = accounts;
        this.bankService = bankService;
    }

    public void addBank(Account acc){
    accounts.add(acc);
}
    public void showAccounts(){
    for (Account acc : accounts) {
        System.out.println(acc.toString());
    }

}

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public BankService getBankService() {
        return bankService;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }
}
