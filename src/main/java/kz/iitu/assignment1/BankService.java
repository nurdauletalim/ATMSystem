package kz.iitu.assignment1;

import ch.qos.logback.core.net.server.Client;

public interface BankService {
    void menu(Account account);
    boolean authorize(int card);
    boolean checkPIN(int passCode);
    void checkBalance();
    double withdraw(double amount);
    double topUP(double amount);
    void changePIN();
}
