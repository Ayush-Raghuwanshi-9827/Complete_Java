package Creational_Patterns.Factory;

public class Factory {
    
    public static Employee getEmployee(String str){

        if (str.trim().equalsIgnoreCase("WEB")) {
            return new Web();
        }else if (str.trim().equalsIgnoreCase("ANDROID")) {
            return new Android();
        }

        System.out.println("Ileegal argumnet Enter Valid Argument");
        return null;
    }
}
