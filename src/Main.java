package src;

import Statements.statements;
import account.Invalidbalanceexception;
import account.account;
import classsharing.classA;
import operator.operators;
import payement.payment;
import payement.upipayment;
import  account.savingsaccount;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        try {
                    account account=new savingsaccount(111, "sai", 20000);

            payment p = new upipayment();
            p.account = account;

            p.dopayement(21000);

            System.out.println(account.balance);

        } catch (Invalidbalanceexception e) {
            System.out.println(e.getMessage());
        }

    }

}