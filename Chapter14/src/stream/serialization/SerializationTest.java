package stream.serialization;

import java.io.*;
import java.util.Objects;

class Person implements Serializable {
    String name;
    transient String jab;

    public Person(String name, String jab) {
        this.name = name;
        this.jab = jab;
    }

    public String toString() {
        return name + ',' + jab;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person person) {
            return (Objects.equals(this.name, person.name));
        }
        else {
            return false;
        }
    }
}

public class SerializationTest {
    public static void main (String[] args) {

        Person personLee = new Person("이순신", "개발자");
        Person personKim = new Person("김유신", "선생님");

        try (FileOutputStream fos = new FileOutputStream("Chapter14/src/stream/serialization/serial.dat");
             ObjectOutputStream ojs = new ObjectOutputStream(fos)) {

            ojs.writeObject(personLee);
            ojs.writeObject(personKim);

        } catch (IOException iE) {
            System.out.println(iE);
        }

        try (FileInputStream fis = new FileInputStream("Chapter14/src/stream/serialization/serial.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
