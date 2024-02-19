package lessons_24.HomeWork;


//Платежные системы Создайте интерфейс PaymentSystem с методами transferMoney, withdrawMoney и checkBalance.
// Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
// Убедитесь, что каждый класс корректно выполняет каждую из операций.
public interface PaymentSystem {

    void transferMoney(); // перевести деньги
    void withdrawMoney(); // снять деньги
    void checkBalance(); // проверить баланс


}
