package StringBufferDemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Person implements Serializable {

    private static final long serialVersionUID = 7613612429676623768L;

    private String name;

    private int age;

    private Integer personID;

    private Collection books = new ArrayList();


    public Person(String name, int age, Integer personID) {
        this.name = name;
        this.age = age;
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection getBooks() {
        return books;
    }

    public void setBooks(Collection books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personID=" + personID +
                ", books=" + books +
                '}';
    }
}
