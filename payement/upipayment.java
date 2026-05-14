package payement;

public class upipayment extends payment{
    @Override
    public void dopayement( long transferamount){
        if(transferamount<=account.balance) {
            System.out.println("payment done using upi balance after" + (account.balance - transferamount));
            account.balance-=transferamount;
        }
    }
}
