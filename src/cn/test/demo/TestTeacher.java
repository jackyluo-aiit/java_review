package cn.test.demo;

class Teacher {
    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = "This is a teacher!";
    }

    private String name;
    private int age;
    private String gender;

    /*
    keyword "final", means that the attribute must be initated and could not be modified once intitiated.
    */
    private final String description;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getInfo() {
        return description + "\n" + "Name: " + getName() + " Age: " + getAge() + " Gender: " + getGender();
    }

    /*
    keyword "final", means the this method could not be overwritten.
    */
    public final String doing() {
        return "is teaching!";
    }

}

class JavaTeacher extends Teacher {
    public JavaTeacher(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.JavaLevel = level;
    }

    private String JavaLevel;

    public String getJavaLevel() {
        return this.JavaLevel;
    }

    public String getInfo() {
        return super.getInfo() + " JavaLevel: " + getJavaLevel();
    }

}

class PHPTeacher extends Teacher {
    public PHPTeacher(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.PHPLevel = level;
    }

    private String PHPLevel;

    public String getPHPLevel() {
        return this.PHPLevel;
    }

    public String getInfo() {
        return super.getInfo() + " PHPLevel:" + getPHPLevel();
    }


}

public class TestTeacher {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher("Tony", 50, "male", "A");
        System.out.println(jt.getInfo() + " " + jt.doing());
        long round = Math.round(1.9);

    }
}