package lessons_24.HomeWork;

import java.util.Scanner;

public class ElectronicWallet implements PaymentSystem {


    private String title;

    private double checkBalance;



    public ElectronicWallet(String title, double checkBalance) {
        this.checkBalance = checkBalance;
        this.title = title;

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

    public double getCheckBalance() {
        return checkBalance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                ", checkBalance=" + checkBalance +
                ", title='" + title + '\'' +
                '}';
    }
}


