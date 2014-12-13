package in.blogspot.abjava.concept;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by dsawant on 12/13/2014.
 * for all example source code visit : https://github.com/dinsaw/abjava
 */
public class SerializableDemo {

    public static final String FILE_NAME = "stud.data";

    public static void main(String... args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("Din");
        student.setRollNum(1);
        System.out.println("student = " + student);

        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        System.out.println("Object saved.");

        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student1 = (Student) ois.readObject();
        System.out.println("Object read completed.");
        System.out.println("student1 = " + student1);
    }

}

/**
 * A POJO class which implements Serializable interface.
 */
class Student implements Serializable {
    private String name;
    private int rollNum;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }
}
