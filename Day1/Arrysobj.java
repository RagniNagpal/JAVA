// File: Arrysobj.java

class Student {
    String name;
    int age;

    // No constructor, we will assign values directly
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Arrysobj {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Initialize and assign values
        students[0] = new Student();
        students[0].name = "Aman";
        students[0].age = 20;

        students[1] = new Student();
        students[1].name = "Ritika";
        students[1].age = 21;

        students[2] = new Student();
        students[2].name = "Ravi";
        students[2].age = 19;

        // Display student info
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}

// Name: Aman, Age: 20
// Name: Ritika, Age: 21
// Name: Ravi, Age: 19