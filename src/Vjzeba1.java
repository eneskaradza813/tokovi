
import java.io.File;



public class Vjzeba1 {

    public static void main(String[] args) {

        
        File fileAbs = new File("C:\\Javalearining\\vjezba1");
        System.out.println("Absoulete path = " + fileAbs.getAbsolutePath());
        System.out.println("Name = " + fileAbs.getParent());
        System.out.println("Parent = " + fileAbs.getParent());
        System.out.println("Path = " + fileAbs.getPath());
        System.out.println("Is absolute = 0" + fileAbs.isAbsolute());
        
      
    }

}
