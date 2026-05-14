package account;

public class account {
    public int accountnumber;
    public String accountholdername;
    public long balance;
public account(){

}
    public account(int accountnumber, String accountholdername, long balance) {
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
    }
    public void genaratreinrest(){
        System.out.println();
    }
}
