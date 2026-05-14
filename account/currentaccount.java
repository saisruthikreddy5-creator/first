package account;

public class currentaccount extends account{

    public currentaccount(int accountnumber, String accountholdername, long balance) {
        super(accountnumber, accountholdername, balance);
    }
    @Override
    public void genaratreinrest(){
        System.out.println("intrest amount is"+balance*0.07);
        balance+= (long)(balance*0.02);
    }
}
