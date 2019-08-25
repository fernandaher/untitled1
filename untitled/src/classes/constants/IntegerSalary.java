package classes.constants;

public enum IntegerSalary {

    CERO(0),
    NUEVE(9);

    private int val;

    IntegerSalary(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }


}
