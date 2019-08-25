package classes.operations;

import static classes.constants.IntegerCurrency.CERO;

public class Currency {

    private double number1;


    public Currency() {
        this.number1 = CERO.getVal();
    }

    public Currency(double number1) {
        this.number1 = number1;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }
}
