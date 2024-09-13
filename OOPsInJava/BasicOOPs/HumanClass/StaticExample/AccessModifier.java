package StaticExample;
  class  MyEmployee {
    private int id;
    private String name;
    
    // Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    // Seters
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
 } 

public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee Ayush = new MyEmployee();
        Ayush.setName("Ayush Raghuwanshi");
        Ayush.setId(199);
        String printName = Ayush.getName();
        int printID = Ayush.getId();
        System.out.println(printID);
        System.out.println(printName);
    }
}
