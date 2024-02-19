package lessons_24.HomeWork;

import java.util.Scanner;

public class ElectronicWallet implements PaymentSystem {

    private double transferMoney;

    private double withdrawMoney;

    private double checkBalance;


    private Scanner scanner;


    public ElectronicWallet(Scanner scanner, double transferMoney, double withdrawMoney, double checkBalance) {
        this.transferMoney = transferMoney;
        this.withdrawMoney = withdrawMoney;
        this.checkBalance = checkBalance;
        this.scanner = scanner;
    }
    public void resetInputValue(double transferMoney, double withdrawMoney, double checkBalance){
        this.transferMoney = transferMoney;
        this.withdrawMoney = withdrawMoney;
        this.checkBalance = checkBalance;

    }

    @Override
    public void transferMoney() {
        checkBalance -= transferMoney;
        System.out.println("Сумма перевода: " + transferMoney);
    }

    @Override
    public void withdrawMoney() {
        do {

            if (withdrawMoney <= checkBalance) {
                checkBalance -= withdrawMoney;
                System.out.println("Сумма вывода: " + withdrawMoney);
                break;
            } else {
                System.out.println("Недостаточно средств!!!");
            }
        } while (true);
    }

    @Override
    public void checkBalance() {
        System.out.println("Ваш баланс: " + checkBalance);
    }

    boolean askForRepeat() {
        while (true) {
            System.out.println("Хотите выполнить ещё раз?");
            String answer = scanner.next();
            if ("да".equals(answer)) {
                return true;
            }else if ("нет".equals(answer)){
                return false;
            }else {
                System.out.println("Введите 'да' или 'нет'");
            }


        }
    }
}
