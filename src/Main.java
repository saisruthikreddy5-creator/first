package src;

import collectios.employee;
import collectios.mycomparator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
List<employee> empList = new ArrayList<>(Arrays.asList(new employee(111,"ravi",300),
        new employee(112,"rajesh",200),
        new employee(113,"surya",900),
        new employee(114,"veer",300)));
        Consumer<employee > addEmp =
                employee ->  System.out.println(employee);
        Function<employee , employee> CHANGESALARY=employee -> {
            employee.setSalary(employee.getSalary()+2000);
            return employee;};
        Predicate<employee > checkEmp = employee -> employee.getSalary()>=300;
empList.stream().
        filter(checkEmp).
        map(CHANGESALARY).
        forEach(addEmp);

        System.out.println("\n\n");
        System.out.println("sorting using Arraylist");
        ArrayList<employee> arrayList=new ArrayList();
        arrayList.add(new employee(5, "ravi", 300));
        arrayList.add(new employee(9, "rajesh", 200));
        arrayList.add(new employee(2, "veer", 300));
        arrayList.add(new employee(1, "surya", 900));
        Collections.sort(arrayList, new mycomparator());
        arrayList.stream().forEach(System.out::println);

        System.out.println("\n\n");
        System.out.println("sorting using LinkedHashSet");
        Set<employee> empHash = new LinkedHashSet<>();
        empHash.add(new employee(111, "ravi", 300));
        empHash.add(new employee(112, "rajesh", 200));
        empHash.add(new employee(111, "veer", 300));
        empHash.add(new employee(113, "surya", 900));

        empHash.stream().forEach((emp) -> {
          System.out.println(emp);
         });

        System.out.println("\n\n");
        System.out.println("sorting using treeset ");
        TreeSet<employee> empSet = new TreeSet<>(new mycomparator());
        empSet.addAll(Set.of(new employee(111, "ravi", 300),
                new employee(113, "surya", 900),
                new employee(112, "rajesh", 200),
                new employee(114, "veer", 300)));

      empSet.stream().forEach(s->System.out.println(s));



    }

}