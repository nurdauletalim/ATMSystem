package kz.iitu.assignment1;

import java.util.List;

public class Bank {
    private List<Account> accounts;
    private BankService bankService;

    public Bank(List<Account> accounts, BankService bankService) {
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public BankService getBankService() {
        return bankService;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }
}
