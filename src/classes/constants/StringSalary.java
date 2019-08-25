package classes.constants;

public enum StringSalary {

    TITLE_SALARY("Option Salary"),
    MESSAGE_NAME("The employee is: ");

    private String text;

    StringSalary(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

}
