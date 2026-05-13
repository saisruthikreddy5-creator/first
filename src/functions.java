import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public List<product>  listofproducts(){
        ArrayList<product> list=new ArrayList();
        list.add(new product("fan",2000));
        list.add(new product("oven",5000));
        return list;
    }
public int reversenumber(int number){
        String num=""+number;
    String Num = "";
        for(int i=num.length()-1;i>=0;i--){
            Num+=num.charAt(i);

        }
        number=Integer.parseInt(Num);
        return  number;
}

}
