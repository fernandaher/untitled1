package classes.constants;

public enum StringCurrency {

    TITLE_OPTION_CURRENCY("Option Currency Conversion");


    private String text;

    StringCurrency(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
