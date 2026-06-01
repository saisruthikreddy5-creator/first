package src;

import java.util.function.*;

public class functionalinterface {

    Predicate<Integer>  predicate=x->x%2==0;
BiPredicate<Integer,Integer> binaryOperator=(a, b)->   a>b;
Consumer<Integer> consumer=(i -> System.out.println(i));
Function<Integer,Integer> functionalinterface2=x->x+9;
BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a+b;
}
