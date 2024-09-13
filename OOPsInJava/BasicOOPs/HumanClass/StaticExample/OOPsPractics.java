package StaticExample;
class Cylinder{
    private  int radius;
    private int height;


    // getters of height and radius

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    
    // Setters of height and radius
    public void setHeight(int height){
        this.height = height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double volume(){
        double vol = Math.PI * Math.pow(radius, 2) * height;
        return vol;
    }
    public double surfaceArea(){
        double surf = (2 * Math.PI * Math.pow(radius, 2)) +(2 * Math.PI * radius *height);
        return surf;
    }

}
public class OOPsPractics {
    public static void main(String[] args) {
        Cylinder myClinder = new Cylinder();
        myClinder.setHeight(12);
         myClinder.setRadius(9);
        // int height = myClinder.getHeight();
        // System.out.println(height);
       
        // int radius = myClinder.getRadius();
        // System.out.println(radius);
        double vol = myClinder.volume();
        System.out.println(vol);
        System.out.println(myClinder.surfaceArea());


    }
}
