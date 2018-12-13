package assignment.one;

public class Account {
    private int accountNumber;
    private double balance = 0.0;

    public Account(int num, double bal)
    {
        accountNumber = num;
        balance = bal;
    }

    public Account(int num)
    {
        accountNumber = num;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void credit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public void debit(double amount)
    {
        if (this.balance >= amount)
        {
            this.balance = this.balance - amount;
        }
        else
        {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }

    public String toString()
    {
        return "A/C no: "+ Integer.toString(this.accountNumber) + ", Balance= $" + Double.toString(this.balance);
    }
}
