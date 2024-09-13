package Creational_Patterns.Factory;

public class Web implements Employee{

    @Override
    public int salary() {

        System.out.println("Web developer salary");
        return 20000;
    }
     
}
