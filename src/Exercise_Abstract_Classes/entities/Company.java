package Exercise_Abstract_Classes.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (getNumberOfEmployees() > 10000) {
            return getAnnualIncome()*0.14;
        }
        else {
            return getAnnualIncome()*0.16;
        }
    }
}
