package baitap_05;

public class OfficeEmployee extends Employee {
    public OfficeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBaseSalary() * 0.2;
    }
}