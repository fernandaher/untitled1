package classes.constants;

public enum DoubleSalary {

    THIRTY_FIVE_THOUSAND(35000),
    FIFTY_THOUSAND(50000);

    private int val;

    DoubleSalary(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
