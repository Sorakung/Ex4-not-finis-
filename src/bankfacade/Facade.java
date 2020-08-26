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

/**
 *
 * @author black
 */
public class Facade {
    ArrayList<AccountIf> cust1Accounts = new ArrayList();
    AccountIf acc = null;
    CustomerIf cust1 = null;
    public Facade(String name, int acc1,int acc2){
        AccountIf acc = new BankAccount(acc1);
        cust1Accounts.add(acc);
        acc = new BankAccount(acc2);
        cust1Accounts.add(acc);
        CustomerIf cust1 = new BankCustomer(name, cust1Accounts);
        
    }
    public void doDeposit(double amt, CustomerIf cust, int accNo){
        
        acc = cust1.getAccount(accNo);
        acc.deposit(amt);
    }
    public void getBankAccount(CustomerIf cust, int accNo){
        acc = cust1.getAccount(accNo);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        
    }
    public void getBanCustomer(String custName){
        
    }
}
