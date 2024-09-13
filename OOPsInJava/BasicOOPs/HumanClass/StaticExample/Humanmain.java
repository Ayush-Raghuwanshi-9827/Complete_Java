package StaticExample;
public class Humanmain {
    public static void main(String[] args) {
        Human first = new Human(18, "Ayush", 1000000, "India");
        System.out.println(Human.population);
        Human second = new Human(19, "Rainbow", 100000, "Bangladesh");
        System.out.println(Human.population);
    }
}
