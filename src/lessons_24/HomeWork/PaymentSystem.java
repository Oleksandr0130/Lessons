package lessons_24.HomeWork;


//Платежные системы Создайте интерфейс PaymentSystem с методами transferMoney, withdrawMoney и checkBalance.
// Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
// Убедитесь, что каждый класс корректно выполняет каждую из операций.
public interface PaymentSystem {

    void transferMoney(double amount); // перевести деньги
    void withdrawMoney(double drawMoney); // снять деньги
    double checkBalance(); // проверить баланс


}
