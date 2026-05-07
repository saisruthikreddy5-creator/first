import Statements.statements;
import classsharing.classA;
import operator.operators;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
functions f=new functions();
product pro=new product();
pro.price=3000;
f.callbyreference(pro);
System.out.println(pro.price);
    }
}