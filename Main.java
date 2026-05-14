import account.account;
import account.savingsaccount;
import payement.payment;
import payement.upipayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
account a=new savingsaccount(111,"sai",20000);
payment p=new upipayment();
p.account=a;
p.dopayement(330);
System.out.println(a.balance);
        }
    }
