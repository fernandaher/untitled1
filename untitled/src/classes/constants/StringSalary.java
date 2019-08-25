package classes.constants;

public enum StringSalary {

    TITLE_SALARY("Option Salary"),
    MESSAGE_NAME("The employee is: "),
    MESSAGE_HOURS_WORKED("The time worked was: "),
    MESSAGE_SHIFT_DAYL("Shift daylight"),
    MESSAGE_SHIFT_ATNI("Shift at night"),
    MESSAGE_PAY_TOTAL("Full Payment:"),
    MESSAGE_WORKEDDAY("Worked day"),
    MESSAGE_PUBLICHOLI("PublicHoliday");


    private String text;

    StringSalary(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

}
