package lab22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializeDemo {
    public static void main(String[] args) {


    try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.dat")))
    {
        Employee e = (Employee) ois.readObject();
        System.out.println(e);
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
    }
}
}
