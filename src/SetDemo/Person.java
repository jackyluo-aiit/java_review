package SetDemo;

public class Person {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEq = false;
        if(obj instanceof Person){
            Person p = (Person) obj;
            if(this.age != null && this.name != null && this.name.equals(p.name) && this.age.equals(p.age)){
                isEq = true;
            }
        }
        return isEq;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
