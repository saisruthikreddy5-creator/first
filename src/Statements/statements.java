package Statements;

public class statements {
    public void simpleintrest(int principle,float rateofintrest,float time){
    float simple=principle+rateofintrest+time/100;
    System.out.println("Simple intrest:"+simple);
    }
    public void compoundintrest(int principal,int rate ,int perid){
        System.out.println(principal*(Math.pow(1+rate,perid)));

    }
    public void area(int radius){
        System.out.println(3.14*(radius*radius));

    }
    public void averagerofthreenumbers(int a,int b,int c){
      int average=a+b+c/3;
      System.out.println("Average of three Numbers :"+average);
    }
    public void maximumoftwonumber(int a,int b){
        if(a>b){
            System.out.println(a+" is maximum number");
        }
       else  {
            System.out.println(b+" is maximum number");
        }
    }
    public void smallestofthreenumbers(int a,int b , int c) {
int small=a;
if(small<b)
    small=b;
else if (small<c) {
    small=c;
    System.out.println("Smalest of three number :"+small);

}
    }

    public void swaptwonumbers(int a,int b){
        int c;
        System.out.println("num1 :"+a);
        System.out.println("num2 :"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("num1 :"+a);
        System.out.println("num2 :"+b);
    }
      public void printdigitsofnumber(int number){
        String num=""+number;
        for (int i=0;i<num.length();i++){
            System.out.println(num.charAt(i));
        }
    }
    public void checkevenorodd(int number){
      if(number%2==0)
          System.out.println("Number is Even");
     else
         System.out.println("Number is odd");
    }
     public void checkdivsibleby2and3(int number){
        if(number%2==0 && number%3==0)
            System.out.println(number+"is divsible by 2 and 3");
        else
            System.out.println(number+" is not divsible by 2 and 3");

    }
    public void checkdivsibleby3and7(int number){
        if(number%3==0 && number%7==0)
            System.out.println(number+"is divsible by 3 and 7");
        else
            System.out.println(number+" is not divsible by 3 and 7");

    }
    public void checkdivsibleby2andnot5(int number){
        if(number%2==0 && number%5!=0)
            System.out.println(number+"is divsible by 2 and not divisible 5");
        else
            System.out.println(number+" is not divsible by 2 and not divisible 5");

    }

}
