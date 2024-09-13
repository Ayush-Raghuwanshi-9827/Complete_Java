package StaticExample;
    public class Human{
        int age;
        String name;
        int salary;
        String country;
        static long population;
        

        public Human(int age, String name, int salary, String country){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.country = country;
            Human.population++;
            
        }
    }
