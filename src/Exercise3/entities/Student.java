package Exercise3.entities;

public class Student {

    private String name;
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    private double finalGrade;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public String getName() {
        return name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public double finalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }


}
