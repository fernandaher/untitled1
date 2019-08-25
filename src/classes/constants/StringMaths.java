package classes.constants;

public enum StringMaths {

    TITLE_OPTION_MATHS("Option Maths Operations");


    private String text;

    StringMaths(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
