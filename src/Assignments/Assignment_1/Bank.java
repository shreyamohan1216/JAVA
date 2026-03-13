package Assignment_1;
/*a class BankAccount with attributes accountNumber and balance, and methods
deposit and withdraw. Use encapsulation*/
class Bank {
    private int accountNumber;
    private double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }void withdraw(double amount) {
        balance = balance - amount;
    }void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.accountNumber = 779055;
        obj.deposit(806);
        obj.withdraw(776);

        obj.display();
    }
}
