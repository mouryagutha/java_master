package oops.BanKmanagment;

abstract class BankAccount {
    protected String accountnumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountnumber , String accountHolder , double balance)
    {
        this.accountHolder = accountHolder;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance  += amount;
        System.out.println("deposited ammount " + amount    );

    }

    public abstract void witdraw(double ammount);

    public void displaybalance()
    {
        System.out.println("account balance"+balance);
    }


}
