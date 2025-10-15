// Encapsulation Example in Java
class Student {
    private String name;  // data is hidden
    private int age;

    // getter and setter methods control access
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) this.age = age; // validation example
        else System.out.println("Invalid age!");
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Suruthi");
        s1.setAge(20);
        
        System.out.println("Name: " + s1.getName() + ", Age: " + s1.getAge());
    }
}


