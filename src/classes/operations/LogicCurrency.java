package classes.operations;

import static classes.constants.DoubleCurrency.*;

public class LogicCurrency extends Currency {

    public double calculateEuro (){return (this.getNumber1() *THREE_THOUSAND.getVal()); }

    public double calculateDollar (){return (this.getNumber1() *THREE_THOUSAND_FIVE_HUNDRED.getVal()); }

    public double calculateYen (){return (this.getNumber1() *ONE_THOUSAND_FIVE_HUNDRED.getVal()); }
}
