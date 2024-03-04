// Consider a scenario where you are tasked with developing a simple banking application using Java, employing the concept of polymorphism. Your application should consist of three classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the base class with private attributes for account number and balance, along with abstract methods for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include an additional attribute for interest rate and override the deposit method to calculate interest, as well as override the withdrawal method to ensure a sufficient balance. Similarly, the CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit attribute and override the withdrawal method to check the overdraft limit. Implement the classes as described, ensuring proper encapsulation and abstraction. Finally, create a BankingApplication class (Main) to demonstrate the polymorphic behavior by creating instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal operations, and displaying account details ?

abstract class Account
{
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

class SavingsAccount extends Account 
{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount)
    {
        double interest = amount * interestRate / 100;
        setBalance(getBalance() + amount + interest);
    }

    public void withdraw(double amount)
    {
        if (getBalance() >= amount)
            setBalance(getBalance() - amount);
        else
            System.out.println("Insufficient funds for withdrawal");
    }
}

class CurrentAccount extends Account
{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit)
    {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount)
    {
        if (getBalance() - amount >= -overdraftLimit)
            setBalance(getBalance() - amount);
        else
            System.out.println("Exceeds overdraft limit");
    }
}

class BankingBANKER
{
    public static void main(String[] args)
    {
        SavingsAccount SA = new SavingsAccount("AB123", 1000.0, 5.0);
        CurrentAccount CA = new CurrentAccount("CD456", 2000.0, 500.0);

        SA.deposit(500.0);
        SA.withdraw(200.0);

        CA.deposit(1000.0);
        CA.withdraw(2500.0);

        displayAccountDetails(SA);
        displayAccountDetails(CA);
    }

    private static void displayAccountDetails(Account account)
    {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println();
    }
}

/*
Account Number: AB123
Balance: $1325.0

Account Number: CD456
Balance: $500.0
 */
