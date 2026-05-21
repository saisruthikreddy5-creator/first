package payement;

import account.Invalidbalanceexception;

public class cardpayment extends payment{
    @Override
    public void dopayement( long transferamount) throws Invalidbalanceexception {
        if(transferamount<=account.balance) {

            System.out.println("payment done using debitcard upi balance after  " + (account.balance - transferamount));
        account.balance-=transferamount;
        }
        else {
            throw new Invalidbalanceexception("invalid balance");
        }
        }

}
