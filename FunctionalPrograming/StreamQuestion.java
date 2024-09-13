import java.util.*;
import java.text.*;
import java.util.stream.Collectors;
public class StreamQuestion {
    
    public static void main(String[] args) throws ParseException {
        

        SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
        Date AyushDate = dateFormate.parse("01-01-2022");
        Date AnshDate = dateFormate.parse("01-03-1992");
        Date RainbowDate = dateFormate.parse("04-01-2012");
        Date EktaDate = dateFormate.parse("01-05-2023");

        List<Employee> emp = Arrays.asList(
         new Employee("Ayush", 12902, AyushDate, "Male"),
         new Employee("Ansh",328920 , AnshDate, "Male"),
         new Employee("Rainbow", 3322, RainbowDate, "Male"),
         new Employee("Ekta", 217691, EktaDate, "Female")
        );

        // find the employee who has maximum salary
        Employee maxSalaryEmp = emp.stream().max(Comparator.comparing(Employee::getSalary)).get();    
 
        // System.out.println(maxSalaryEmp);

        // find second highest salary
        Employee employeeList = emp.stream().sorted((a,b) -> Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst().get();
        // System.out.println(employeeList);

        //Find the Senior employee based on joining date 
        Employee SeniorEmp = emp.stream().min(Comparator.comparing(Employee::getJoiningDate)).get();
        // System.out.println(SeniorEmp);

        //count the employee based on gender

        Map<String, Long> listEmp = 
        emp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(listEmp);


    }
}

