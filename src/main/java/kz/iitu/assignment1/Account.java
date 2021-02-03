package kz.iitu.assignment1;

public class Account {
    private String name;
    private double balance;
    private int card;
    private int pass;


    public Account(String name, double balance, int card, int pass) {
        this.name = name;
        this.balance = balance;
        this.card = card;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", card=" + card +
                ", pass='" + pass + '\'' +
                '}';
    }
}


