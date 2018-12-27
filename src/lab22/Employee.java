package lab22;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String address;
    transient Integer SSN;
    int number;

    public Employee(String name,String address, int SSN, int number) {
        this.name=name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;



    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
