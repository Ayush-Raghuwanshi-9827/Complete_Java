package Introduction;
public class FirstOOps {
    public static class Student{
        String name;
        int RollNo;
        double percentage;

        // Create a constuctor
        public Student(String naaam, int roll,double per){
            name = naaam;
            RollNo = roll;
            percentage = per;
        }
    }

    public static void print(Student x){
        System.out.println("The name of Student is: " + x.name);
        System.out.println("The Roll Number of Student is: " + x.RollNo);
        System.out.println("The percentage of Student is: " + x.percentage);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ayush", 78, 99.0);
        print(s1);
    }
}
