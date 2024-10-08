public class Emp {
    
    private String name;
    private int id;
    private String designation;

    
    public Emp(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Emp [name=" + name + ", id=" + id + ", designation=" + designation + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
