package lesson06;

public class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        if (this.name == null) {
            return;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

    public double calculateBonus(double percentage) {
        return salary * percentage / 100;
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return calculateBonus(percentage) + fixedAmount;
    }


}
