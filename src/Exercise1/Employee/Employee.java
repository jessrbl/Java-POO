package Exercise1.Employee;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;

    }

    public double NetSalary() {
        return grossSalary - tax ;
    }

    public void IncreaseSalary(double percentage) {
        this.grossSalary += this.grossSalary * (percentage / 100);
    }


}
