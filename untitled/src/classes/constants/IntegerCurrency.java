package classes.constants;

public enum IntegerCurrency {

    CERO(0),
    FIFTY_HUNDRED(500),
    SIXTY_HUNDRED(600);


    private int val;

    IntegerCurrency(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
