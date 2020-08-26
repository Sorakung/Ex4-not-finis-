/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    static String name = "jim";
    static int acc = 012;
    static int acc1 = 345;
    static String name1 = "jon";
    static int acc2 = 013;
    static int acc3 = 346;
    public static void main(String[] args) {
        
        Facade obj = new Facade(name,acc,acc1);
        Facade obj1 = new Facade(name1,acc2,acc3);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double amt = sc.nextDouble();
        int acc = sc.nextInt();
        obj.doDeposit(amt, name, acc);
        obj.getBankAccount(cust, acc);
        obj.getBanCustomer(name);
        
        
        
       
       //ArrayList<AccountIf> cust1Accounts = new ArrayList();
      // AccountIf acc = new BankAccount(12345);
      // acc.deposit(500);
     // cust1Accounts.add(acc);
      // acc = new BankAccount(12346);
       //acc.deposit(1000);
      // cust1Accounts.add(acc);
      // CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
      // System.out.println("Customer and account information");
      // System.out.println("Name = " + cust1.getCustomerName());
      // System.out.println("Has " + cust1.getNumAccounts() + " accounts");
      // acc = cust1.getAccount(12345);
      // System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       //acc = cust1.getAccount(12346);
     //  System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
      // acc.deposit(1000);
      // System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       //ArrayList<AccountIf> accounts = cust1.getllAccounts();
       //for(AccountIf account : accounts) {
       //    System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       //}
       
    }
    
    
}
