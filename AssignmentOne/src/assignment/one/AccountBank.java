package assignment.one;

public class AccountBank {

    public static void main(String[] args)
    {
        Account a1 = new Account(234222, 100.00);
        System.out.println(a1.toString());

        Account a2 = new Account(234221);
        a2.setBalance(120.00);
        System.out.println(a2.toString());

        a1.credit(50.00);
        a2.debit(1000.00);

        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }
}
