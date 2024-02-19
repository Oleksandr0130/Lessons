package lessons_24.HomeWork;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите начальный баланс: ");
            double checkBalance = scanner.nextDouble();

            System.out.print("Введите сумма перевода: ");
            double transferMoney = scanner.nextDouble();

            System.out.print("Введите сумму вывода: ");
            double withdrawMoney = scanner.nextDouble();


            ElectronicWallet wallet = new ElectronicWallet(scanner, transferMoney, withdrawMoney, checkBalance);
            wallet.transferMoney();
            wallet.withdrawMoney();
            wallet.checkBalance();

            if (!wallet.askForRepeat()) {
                break;

            }
            wallet.resetInputValue(0, 0, 0);

            ElectronicWallet wallet1 = new ElectronicWallet(scanner, transferMoney, withdrawMoney, checkBalance);
            wallet1.transferMoney();
            wallet1.withdrawMoney();
            wallet1.checkBalance();


        }




    }
}

