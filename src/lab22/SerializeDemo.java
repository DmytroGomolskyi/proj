package lab22;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {

    try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employee.dat")))
    {
        Employee e = new Employee("Dmytro","Zaporozhye",25,20);
        oos.writeObject(e);
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
    }

}
