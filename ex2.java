
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int age, int id,
              double salary, String language) {
        super(name, age, id, salary);
        this.programmingLanguage = language;
    }

    void writeCode() {
        displayEmployee();
        System.out.println("Language: " + programmingLanguage);
        System.out.println("Developer is writing code.");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Developer d = new Developer(
            "Chandu", 22, 101, 50000, "Java"
        );

        d.writeCode();
    }
}
