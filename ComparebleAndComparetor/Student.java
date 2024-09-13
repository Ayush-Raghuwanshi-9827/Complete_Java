public class Student {

        private int id;
        private String name;
        
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
        
        public int getId() {
            return id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            
            return false;
        }


        public static void main(String[] args) {
            Student s1 = new Student(101, "Ayushan");
            Student s2 = new Student(101, "Anshul");
            System.out.println(s1.getId()==s2.getId());
            System.out.println(s1.equals(s2));
        }
    
    
}
