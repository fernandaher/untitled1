package classes.constants;

public enum StringMenu {

    TITLE_MENU("Principal Menu");

    private String text;

    StringMenu(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
