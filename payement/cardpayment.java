package payement;

public class cardpayment extends payment{
    @Override
    public void dopayement( long transferamount){
        if(transferamount<=account.balance) {

            System.out.println("payment done using debitcard upi balance after  " + (account.balance - transferamount));
        account.balance-=transferamount;
        }
        }

}
