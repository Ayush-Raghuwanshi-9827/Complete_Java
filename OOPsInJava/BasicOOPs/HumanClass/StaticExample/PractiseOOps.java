package StaticExample;
class Employee {
    int salary;

    public int getsalary() {
        return salary;
    }

    public Employee() {

    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    String name;

    public String getname() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void printName() {
        System.out.println("The name of the employee is : " + name);
    }

    public void printSalary() {
        System.out.println("The salary of " + name + " is about : " + salary);
    }
}
   class CellPhone{
     public void printRinging(){
        System.out.println("The cell phone is Ringing....");
     }
     public void printVibrating(){
         System.out.println("The cell Phone is Vibrating....");
     }  

 }
    class Square{
        int side;
        public int returnArea(){
            return side*side;
        }
        public int returnPerimeter(){
            return 4*side;
        }
    }
public class PractiseOOps {

    public static void main(String[] args) {
      Square square_01 = new Square();
      square_01.side = 5;
      int AreaOfSquare_01 = square_01.returnArea();
      System.out.println(AreaOfSquare_01);
      int perimeterOfSuare_01 = square_01.returnPerimeter();
      System.out.println(perimeterOfSuare_01);
    
    }

}
