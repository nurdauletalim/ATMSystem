package kz.iitu.assignment1;

public interface BankService {
    boolean authorize(int card);
    boolean checkPIN(int passCode);
    void checkBalance();
    double withdraw(double amount);
    double topUP(double amount);
}
