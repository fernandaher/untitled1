package classes.constants;

public enum DoubleCurrency {

    ONE_THOUSAND_FIVE_HUNDRED(1500),
    THREE_THOUSAND(3000),
    THREE_THOUSAND_FIVE_HUNDRED(3500);

    private int val;

    DoubleCurrency(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
