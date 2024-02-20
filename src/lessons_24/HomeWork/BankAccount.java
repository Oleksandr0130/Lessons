package lessons_24.HomeWork;

import java.util.Scanner;

public class BankAccount implements PaymentSystem {

    private String title;
    private double checkBalance;

    public BankAccount(String title, double checkBalance) {
        this.title = title;
        this.checkBalance = checkBalance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount > checkBalance) return;
        System.out.println("Банк: " + title + "| вывод средств" + amount);
        checkBalance -= amount;
    }

    @Override
    public void withdrawMoney(double drawMoney) {
        if (drawMoney > checkBalance) return;
        System.out.println("Банк: " + title + "| вывод средств" + drawMoney);
        checkBalance -= drawMoney;
    }

    @Override
    public double checkBalance() {
        return checkBalance;
    }

    public String getTitle() {
        return title;
    }

    public double getBalance() {
        return checkBalance;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "title='" + title + '\'' +
                ", checkBalance=" + checkBalance +
                '}';
    }
}



