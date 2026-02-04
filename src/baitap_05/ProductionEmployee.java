package baitap_05;

public class ProductionEmployee extends Employee {
    public ProductionEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBaseSalary() * 0.3;
    }
}