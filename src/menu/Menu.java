package menu;

import options.currencyconversion.CurrencyConversion;
import options.mathsoperations.MathsOperations;
import options.salary.Salary;

import static classes.constants.IntegerMaths.*;
import static classes.constants.StringMenu.*;

import javax.swing.*;
import java.awt.*;


//hereda a clase JFrame
    public class Menu extends Frame {

    protected JButton btnPrincipalMenu;
    protected JButton btnmathsOperations;
    protected JPanel principalMenu;
    protected JButton btnExit;
    protected JButton btnCurrencyConversion;
    protected JButton btnSalary;

    //constructor
    public Menu(){
        add(principalMenu);
        //dar nombre al formulario parte superior
        setTitle(TITLE_MENU.getText());
        //tamaño ventana menu
        setSize(FIFTY_HUNDRED.getVal(), SIXTY_HUNDRED.getVal());


        btnmathsOperations.addActionListener(e-> {

                MathsOperations mathsOperations = new MathsOperations();
                //Me abre la ventana
                mathsOperations.setVisible(true);
                hideWindow();
        });

        btnCurrencyConversion.addActionListener(e-> {

            CurrencyConversion currencyConversion = new CurrencyConversion();
            //Me abre la ventana
            currencyConversion.setVisible(true);
            hideWindow();
        });

        btnSalary.addActionListener(e-> {

            Salary salary1 = new Salary();
            //Me abre la ventana
            salary1.setVisible(true);
            hideWindow();
        });
        btnExit.addActionListener(e-> {

            Menu menu = new Menu();
            //Me abre la ventana
            menu.setVisible(false);
            dispose();
        });
    }



    //método para esconder ventana
    private void hideWindow(){
        this.dispose();
    }
}
