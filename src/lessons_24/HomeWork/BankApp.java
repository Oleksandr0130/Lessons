package lessons_24.HomeWork;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Bank1", 10000);
        ElectronicWallet wallet = new ElectronicWallet("Bank2", 100_000);
        System.out.println(bank);
        bank.withdrawMoney(500);
        System.out.println(bank);

        wallet.transferMoney(1500);
        System.out.println(wallet);
    }
}
