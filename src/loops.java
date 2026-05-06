import javax.print.DocFlavor;

public class loops {
    public void print1to10(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public void printodd(int number){
        for(int i=0;i<=number;i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }
    public void printeven(int number){
        for(int i=0;i<=number;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
    public void printnumberusingwhileloop(int number){
        int i=1;
        while (i<=number){
            System.out.println(i);
            i++;
        }
    }
    public void printevennumberusingwhileloop(int number){
        int i=1;
        while (i<=number){
            if(i%2==0)
            System.out.println(i);
            i++;
        }
    }
    public void printoddnumberusingwhileloop(int number){
        int i=1;
        while (i<=number){
            if(i%2!=0)
                System.out.println(i);
            i++;
        }
    }
    public void printnumberusingdowhileloop(int number){
        int i=1;
      do {
                System.out.println(i);
            i++;
        } while (i<=number);
    }
    public void printevennumberusingdowhileloop(int number){
        int i=0;
        do {
            if(i%2==0)
                System.out.println(i);
            i++;
        } while (i<=number);
    }
    public void printoddnumberusingdowhileloop(int number){
        int i=0;
        do {
            if(i%2!=0)
                System.out.println(i);
            i++;

        } while (i<=number);
    }
    public void checkarmstrong(int number){
        String num=""+number;
        int result=0;
        for(int i=0;i<num.length();i++){
            int s=Integer.parseInt(String.valueOf(num.charAt(i)));
            result+= Math.pow(s,num.length());
        }
        if(number==result)
            System.out.println(result+" is armstrong");
        else
            System.out.println(result+" is not armstrong");
    }
    public void multiplicationtable(int number){
        for(int i=1;i<=10;i++){
         System.out.println(number +" x "+i+" ="+number*i);
        }
    }
    public void sumofdigits(int number){
        String num=""+number;
        int result=0;
        for(int i=0;i<num.length();i++){
            result+=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(result);
    }
public void findlcm(int a,int b){
        
}
public void perfectnumber(int number){
        int result=0;
        for (int i=1;i<number;i++){
           if(number%i==0)
               result+=i;
        }
        if (number==result)
            System.out.println(result+ " IS PERFECT NUMBER");
}
    

}
