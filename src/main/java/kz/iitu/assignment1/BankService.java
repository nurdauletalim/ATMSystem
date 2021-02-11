package kz.iitu.assignment1;

public interface BankService {
    void menu(Account acc);
    boolean checkPIN(int passCode);
    void checkBalance();
    double withdraw(double amount);
    double topUP(double amount);
    void changePIN();
}
