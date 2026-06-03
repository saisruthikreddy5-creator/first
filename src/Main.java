package src;

import collectios.employee;

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

    }
}