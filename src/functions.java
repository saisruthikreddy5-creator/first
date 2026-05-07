public class functions {
    public void evenorodd(int number){
        if(number%2==0)
            System.out.println(number+" is even");
        else
            System.out.println(number+" is odd");
    }
    public String uppercase(String word){
      return word.toUpperCase()  ;
    }
    public int callbyvalue(int x){
        x=x+12;
        return x;
    }
    int x;
    public void printwithoutloop(){
        if(x<=10){
            System.out.println(x);
            x++;
            printwithoutloop();
        }
    }
    public void callbyreference(product product){
        product.productname="shirt";
        product.price=5000;

    }

}
