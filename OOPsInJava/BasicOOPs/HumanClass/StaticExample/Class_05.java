package StaticExample;
 class Student_Data{
static int student_Roll = 0;
    String student_name;
    int student_age;
    public Student_Data(){
        student_Roll += 1;
    }
    public Student_Data(String student_name){
        this.student_name = student_name;
        student_Roll += 1;
    }
    
    public Student_Data(String student_name, int student_age){
        this.student_name = student_name;
        this.student_age = student_age;
        student_Roll +=  1;
      }
      public void student_details(){
        System.out.println("Student roll no : " + student_Roll);
        System.out.println("Student name is : " + student_name);
        System.out.println("Student age is : " + student_age);
        }
    }
    class Student_percentage extends Student_Data{
        int student_per;
    public Student_percentage(){
        student_Roll += 1;
    }
    public Student_percentage(int student_per){
         super();
         this.student_per = student_per;
    }
    
    public Student_percentage(String student_name, int student_age ,int student_per ){
        super(student_name , student_age);
        this.student_per = student_per;
       }

       public void student_details(){
        System.out.println("The percentage of student is : " + student_per + "%");
       }
    
    }
public class Class_05 {
      public static void main(String[] args) {
       Student_percentage s1 = new Student_percentage("Ayush Raghuwanshi", 19, 90);
       s1.student_details();

      }
    }
 