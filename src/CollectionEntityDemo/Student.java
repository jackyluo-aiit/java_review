package CollectionEntityDemo;

import StringBufferDemo.Person;

public class Student extends Person implements Comparable<Student>{
    private Integer grade;

    public Student(String name, int age, Integer personID, Integer grade) {
        super(name, age, personID);
        this.grade = grade;
    }

    @Override
    public String toString() {

        return super.toString()+" Student{" +
                "grade=" + grade +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        int flag = this.grade-student.grade;
        if(flag == 0){
            flag = this.getAge() - student.getAge();
            if(flag == 0){
                flag = this.getName().compareTo(student.getName());
            }
        }
        return flag;
    }
}
