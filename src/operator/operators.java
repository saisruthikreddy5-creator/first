package operator;

public class operators {
    public void arthamaticoperator(int a,int b){
        System.out.println("Addition :"+(a+b));
        System.out.println("subraction :"+(a-b));
        System.out.println("multipication :"+a*b);
        System.out.println("division :"+a/b);
        System.out.println("modulus :"+a%b);


    }

    public void relationaloperator(int a,int b){
        System.out.println("a>b :"+(a>b));
        System.out.println("a<b :"+(a<b));
        System.out.println("a>=b :"+(a>=b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a==b :"+(a==b));
        System.out.println("a!=b"+(a!=b));
    }
    public void logicaloperator(boolean a,boolean b){
        System.out.println("a&&b :"+(a && b));
        System.out.println("a<b :"+(a || b));
        System.out.println("!a :"+(!a));
        System.out.println("!b:"+(!b));
    }
    public void bitwiseoperator(int a,int b){
        System.out.println("a & b :"+(a&b));
        System.out.println("a<b :"+(a|b));
        System.out.println("a^b :"+(a^b));
        System.out.println("~a:"+(~a));
    }
    public void ternaryoperator(int a,int b){
      String result=  (a>b)? "a greather than b": "b greather than a";
      System.out.println(result);
    }

}
