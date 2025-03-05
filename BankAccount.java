package OOP;
//Банковский счет
//Создайте класс BankAccount с полями balance и accountNumber.
//Реализуйте методы для внесения и снятия денег с проверкой баланса.
public class BankAccount {
    private int balance;
    private int accountNumber;

    public BankAccount(int balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    //Геттеры
    public int getAccountNumber() {return accountNumber;}
    public int getBalance() {return balance;}
    //Сеттеры
    public void setBalance(int balance) {this.balance = balance;}
    public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

    public void addBalance(int amount){
        this.balance += amount;
    }
    public boolean takeBalance(int amount){
        if(this.balance < amount){
            return false;
        }
        else{
            this.balance -= balance;
        }
        return true;
    }
}
