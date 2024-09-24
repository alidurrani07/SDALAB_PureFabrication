// Core Domain Class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Displays student info (core responsibility of the Student class)
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Pure Fabrication Class - DataPersistence
class DataPersistence {
    // Method to save student data (responsibility unrelated to core domain class)
    public void saveStudentData(Student student) {
        System.out.println("Saving student data...");
        // Simulated persistence logic
        System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge() + " - Data Saved.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("John Doe", 20);

        // Display student information
        student.displayInfo();

        // Use DataPersistence (Pure Fabrication) to save student data
        DataPersistence persistence = new DataPersistence();
        persistence.saveStudentData(student);
    }
}

