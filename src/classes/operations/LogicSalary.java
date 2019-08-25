package classes.operations;


import static classes.constants.DoubleSalary.*;
import static classes.constants.IntegerSalary.CERO;
import static classes.constants.IntegerSalary.ONE;


public class LogicSalary extends Salary {

    public double wage(int td, int shift){

        // td=0 holiday , td=1 workday
        // shift=0 night , shift=1 day

        if(td==CERO.getVal()){
            if(shift==ONE.getVal())
                return (this.getHours() * THIRTY_FIVE_THOUSAND.getVal()) * 1.1;
            else{
                return (this.getHours() * FIFTY_THOUSAND.getVal()) * 1.15;
            }
        } else{
            if (shift==ONE.getVal()){
                return (this.getHours() * THIRTY_FIVE_THOUSAND.getVal()) * 1.0;
            }else{
                return (this.getHours() * FIFTY_THOUSAND.getVal()) * 1.0;
            }
        }
    }
}
