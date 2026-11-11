
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    int doctorId;
    String specialization;

    Doctor(String name, int age, int doctorId,
           String specialization) {
        super(name, age);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayDetails();
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Specialization: " + specialization);
    }
}

class Surgeon extends Doctor {
    String operationType;

    Surgeon(String name, int age, int id,
            String specialization, String operationType) {
        super(name, age, id, specialization);
        this.operationType = operationType;
    }

    void performSurgery() {
        displayDoctor();
        System.out.println("Operation: " + operationType);
        System.out.println("Surgeon is performing surgery.");
    }
}

public class ex7 {
    public static void main(String[] args) {
        Surgeon s = new Surgeon(
            "Rahul", 40, 101, "Cardiology", "Heart Surgery"
        );

        s.performSurgery();
    }
}
