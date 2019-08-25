package classes.operations;

import static classes.constants.IntegerSalary.CERO;

public class Salary {

    private String name;
    private double hours;

    public Salary() {
        this.hours = CERO.getVal();
    }
    public Salary( double hours) {
        this.hours = hours;
    }

    public String getVal() {
        return name;
    }

    public void setVal(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
