package cn.test.demo;

import java.io.Serializable;

public class Person implements Serializable {

    public Person(String jacky, int i) {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private static final long serialVersionUID = 7834999313860634744L;
}
