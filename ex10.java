
class Employee {
    String employeeName;
    int employeeId;

    Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    double calculateSalary() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int workingHours;
    double hourlyRate;

    PartTimeEmployee(String name, int id,
                     int hours, double rate) {
        super(name, id);
        this.workingHours = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }
}

class ContractEmployee extends Employee {
    double contractAmount;

    ContractEmployee(String name, int id, double amount) {
        super(name, id);
        this.contractAmount = amount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }
}

public class ex10 {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee("Arun", 101, 50000);
        e.displayDetails();

        System.out.println();

        e = new PartTimeEmployee("Ravi", 102, 80, 200);
        e.displayDetails();

        System.out.println();

        e = new ContractEmployee("Kiran", 103, 40000);
        e.displayDetails();
    }
}
