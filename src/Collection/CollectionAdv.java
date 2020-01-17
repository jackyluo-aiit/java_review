package Collection;

import StringBufferDemo.Person;
import cn.test.demo.Book;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAdv {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        Person jacky = new Person("Jacky", 22, 1);
        Collection books = jacky.getBooks();
        books.add(new Book("Harry Potter", 20));
        books.add(new Book("Big Data Analysis", 40));
        books.add(new Book("Helmet", 45));
        jacky.setBooks(books);

        col.add(jacky);
        System.out.println(col);
    }
}
