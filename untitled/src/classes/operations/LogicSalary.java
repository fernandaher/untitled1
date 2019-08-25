package classes.operations;

public class LogicSalary extends Salary {

    public double wage(int td, int shift){

        // td=0 holyday , td=1 workday
        // shift=0 night , shift=1 day

        if(td==0){
            if(shift==1)
                return (this.getHours() * 35000) * 1.1;
            else{
                return (this.getHours() * 50000) * 1.15;
            }
        } else{
            if (shift==1){
                return (this.getHours() * 35000) * 1.0;
            }else{
                return (this.getHours() * 50000) * 1.0;
            }
        }
    }
}
