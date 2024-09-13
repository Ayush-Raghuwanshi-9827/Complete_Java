package Creational_Patterns.Factory;

public class Factory_test {
    
    public static void main(String[] args) {

        // When there is superclass and multiple subclasses and we want to get object of subclass based on input and reqirement.
        // In this case the superclass is Employee Interface and subclasses are Web, Android
        // We have to create one factory class which is responsible for creating object based on input parameter.

        Employee emp = Factory.getEmployee("Web");
        System.out.println(emp);
        System.out.println(emp.salary());

        Employee emp2 = Factory.getEmployee("AndrOId");
        System.out.println(emp2);
        System.out.println(emp2.salary());

        // Advantages : 1 -> Focus on creating object for interface rather than implementation.
        // Loose coupling more robust code.

       

    }

    	
	
}
