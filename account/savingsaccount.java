package account;

public class savingsaccount extends account{

    public savingsaccount(int accountnumber, String accountholdername, long balance) {
        super(accountnumber, accountholdername, balance);
    }
    @Override
    public void genaratreinrest(){
        System.out.println("intrest amount is"+balance*0.02);
        balance+= (long)(balance*0.02);
    }
}
