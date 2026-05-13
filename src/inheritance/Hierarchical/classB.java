package inheritance.Hierarchical;

public class classB extends classA {
    public classB(){
        super(2,4);
        System.out.println("Child class construtor");
    }
    public classB(String a){
        System.out.println("Child class parameterized construtor");
    }
}
