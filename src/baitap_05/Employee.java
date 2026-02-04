package baitap_05;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return this.getBaseSalary();
    }

    public double calculateSalary(double bonus) {
        return this.getBaseSalary() + (this.getBaseSalary() * bonus);
    }

    public String displayInfo() {
        return "Tên nhân viên: " + name + "\n" +
                "Lương thực tế: " + calculateSalary() + "\n";
    }

}