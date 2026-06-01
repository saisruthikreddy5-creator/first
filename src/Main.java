package src;

import collectios.employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        employee emp1 = new employee(112,"surya",200);
        employee emp2 = new employee(111,"ravi",300);

        List<employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        Collections.sort(list, Comparator.comparingInt(employee -> employee.getEid()));
        list.forEach(s->System.out.println(s.getEid()));

        functionalinterface functionalinterface1=new functionalinterface();
      System.out.println(  functionalinterface1.binaryOperator.test(4,3));
        System.out.println( new  functionalinterface().predicate.test(3));

    }

}