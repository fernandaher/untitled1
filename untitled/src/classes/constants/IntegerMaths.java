package classes.constants;

public enum IntegerMaths {

    CERO(0),
    FIFTY_HUNDRED(500),
    SIXTY_HUNDRED(600);


    private int val;

    IntegerMaths(int val) {
        this.val = val;
    }

    public  int getVal() {
        return val;
    }

}
