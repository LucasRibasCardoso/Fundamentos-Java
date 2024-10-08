package Modulo05.Polimorfismo.Exemplo01.Application;

import Modulo05.Polimorfismo.Exemplo01.Entities.Account;
import Modulo05.Polimorfismo.Exemplo01.Entities.SavingsAccount;

/**
 * UPCASTING and DOWNCASTING
 */
public class Program {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
