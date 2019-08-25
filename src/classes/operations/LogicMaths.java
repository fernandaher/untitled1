package classes.operations;

public class LogicMaths extends Maths {

    public double calculatePlus (){
        return (this.getNumber1() + this.getNumber2());
    }

    public double calculateRest(){
        return (this.getNumber1() - this.getNumber2());
    }

    public double calculateMultiplication(){
        return (this.getNumber1() * this.getNumber2());
    }

    public double calculateDivision(){
        return (this.getNumber1() / this.getNumber2());
    }



}

