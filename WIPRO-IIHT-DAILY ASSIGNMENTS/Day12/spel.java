package Day12;
import java.io.*;

class Person implements Serializable {
 static final long serialVersionUID = 1L;
 String name;
 int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

public class spel {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
     Person p1 = new Person("alpha", 30);

     FileOutputStream fos = new FileOutputStream("person.ser");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(p1);
     oos.close();

     FileInputStream fis = new FileInputStream("person.ser");
     ObjectInputStream ois = new ObjectInputStream(fis);
     Person p2 = (Person) ois.readObject();
     ois.close();

     System.out.println(p2.name + " is " + p2.age);
 }
}
