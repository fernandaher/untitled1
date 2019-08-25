package options.salary;

import static classes.constants.StringSalary.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import classes.operations.LogicSalary;
import menu.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class Salary extends Frame {

    private static LogicSalary logicSalary = new LogicSalary();
    private static Salary salary = new Salary();

    DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
    DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

    protected ButtonGroup groupTypeDay = new ButtonGroup();
    protected ButtonGroup groupWorkedDay = new ButtonGroup();
    protected ButtonGroup groupShift = new ButtonGroup();
    protected JButton optionSalaryButton;
    protected JTextField txtWriteName;
    protected JTextField txtWriteHours;
    protected JRadioButton rbtnTue;
    protected JRadioButton rbtnMon;
    protected JRadioButton rbtnFri;
    protected JRadioButton rbtnThu;
    protected JRadioButton rbtnSun;
    protected JRadioButton rbtnPublicHoliday;
    protected JRadioButton rbtnDaylightPeriod;
    protected JButton btnBack;
    protected JButton btnExit;
    protected JButton btnShowYourSalary;
    protected JRadioButton rbtnSat;
    protected JRadioButton rbtnWorkday;
    protected JRadioButton rbtnAtNightPeriod;
    protected JLabel lblHoursW;
    protected JLabel lblWorkersName;
    protected JLabel lblDayWorked;
    protected JLabel lblTypeDay;
    protected JLabel lblWorkedSift;
    protected JLabel lblTotal;
    protected JRadioButton rbtnWed;
    private JPanel salaryForm;


    public Salary(){
        add(salaryForm);
        //dar nombre al formulario parte superior
        setTitle(TITLE_SALARY.getText());
        //tamaño ventana menu
        setSize(500, 600);

        this.groupShift.add(this.rbtnAtNightPeriod);
        this.groupShift.add(this.rbtnDaylightPeriod);
        this.groupTypeDay.add(this.rbtnPublicHoliday);
        this.groupTypeDay.add(this.rbtnWorkday);
        this.groupWorkedDay.add(this.rbtnMon);
        this.groupWorkedDay.add(this.rbtnTue);
        this.groupWorkedDay.add(this.rbtnWed);
        this.groupWorkedDay.add(this.rbtnThu);
        this.groupWorkedDay.add(this.rbtnFri);
        this.groupWorkedDay.add(this.rbtnSat);
        this.groupWorkedDay.add(this.rbtnSun);



        btnBack.addActionListener(e-> {

            Menu menu = new Menu();
            //Me abre la ventana
            menu.setVisible(true);
            hideWindow();

        });
        btnExit.addActionListener(e-> {

            Menu menu = new Menu();
            //Me cierra la ventana
            menu.setVisible(false);
            dispose();
        });

        //validar selección de radio b.

        btnShowYourSalary.addActionListener(e -> {
           double value;

           // td=0 holyday , td=1 workday
            // shift=0 night , shift=1 day


           if(rbtnPublicHoliday.isSelected()){
               if(rbtnAtNightPeriod.isSelected()){
                   salary.setName(txtWriteName.getText());
                   logicSalary.setHours(Integer.parseInt(txtWriteHours.getText()));
                    value = logicSalary.wage(0, 0);
                    JOptionPane.showMessageDialog(null, MESSAGE_NAME.getText()+" " + txtWriteName.getText());
                    lblTotal.setVisible(true);
                    lblTotal.setText(""+formateador.format(value));
               }else{
                   salary.setName(txtWriteName.getText());
                   logicSalary.setHours(Integer.parseInt(txtWriteHours.getText()));
                   value = logicSalary.wage(0,1);
                   JOptionPane.showMessageDialog(null, MESSAGE_NAME.getText()+" " + txtWriteName.getText());
                   lblTotal.setVisible(true);
                   lblTotal.setText(""+formateador.format(value));
               }
               }else{
                       if (rbtnDaylightPeriod.isSelected()){
                           salary.setName(txtWriteName.getText());
                           logicSalary.setHours(Integer.parseInt(txtWriteHours.getText()));
                           value = logicSalary.wage(1,1);
                           JOptionPane.showMessageDialog(null, MESSAGE_NAME.getText()+" " + txtWriteName.getText());
                           lblTotal.setVisible(true);
                           lblTotal.setText(""+formateador.format(value));
                       }else{
                           salary.setName(txtWriteName.getText());
                           logicSalary.setHours(Integer.parseInt(txtWriteHours.getText()));
                           value = logicSalary.wage(1,0);
                           JOptionPane.showMessageDialog(null, MESSAGE_NAME.getText()+" " + txtWriteName.getText());
                           lblTotal.setVisible(true);
                           lblTotal.setText(""+formateador.format(value));
                   }
               }
        });

        txtWriteName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char validar= e.getKeyChar();
                if(Character.isDigit(validar)){
                    getToolkit().beep();
                    e.consume();
                }
            }
        });

        txtWriteHours.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char validar= e.getKeyChar();
                if(Character.isLetter(validar)){
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    private void hideWindow(){
        this.dispose();
    }
}

