package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSort {
    public static void main (String[] args) {
        ArrayList<Person> record = new ArrayList<>();
        record.add(new Person(0, 67));
        record.add(new Person(1, 74));
        record.add(new Person(2, 98));
        record.add(new Person(3, 12));
        record.add(new Person(4, 98));
        Collections.sort(record, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getScore() > o2.getScore()){
                    return o2.getScore() - o1.getScore();
                } else if (o1.getScore() < o2.getScore()) {
                    return o2.getScore() - o1.getScore();
                } else {
                    return Integer.compare(o1.getNumber(), o2.getNumber());
                }
            }
        });
        System.out.println(record);
    }
}

class Person {
    private int number;
    private int score;

    public Person(int number, int score) {
        this.number = number;
        this.score = score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", score=" + score +
                '}';
    }
}
