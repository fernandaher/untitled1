package options.currencyconversion;

import classes.operations.LogicCurrency;
import static classes.constants.IntegerCurrency.*;
import static classes.constants.StringCurrency.*;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

public class CurrencyConversion extends Frame {

    private static LogicCurrency logicCurrency = new LogicCurrency();

    protected JPanel amountToConvertForm;
    protected JButton optionCurrencyConversionButton;
    protected JLabel txtAmount;
    protected JTextField txtWriteNumber;
    protected JButton btnEuro;
    protected JButton btnDollar;
    protected JButton btnYen;
    protected JButton btnBack;
    protected JLabel lblTotal;
    protected JButton btnExit;


    public CurrencyConversion() {
            add(amountToConvertForm);
            //dar nombre al formulario parte superior
            setTitle(TITLE_OPTION_CURRENCY.getText());
            //tamaño ventana menu
            setSize(FIFTY_HUNDRED.getVal(), SIXTY_HUNDRED.getVal());

            btnBack.addActionListener(e-> {

                Menu menu = new Menu();
                //Me abre la ventana
                menu.setVisible(true);
                hideWindow();

            });

        btnExit.addActionListener(e-> {

            Menu menu = new Menu();
            //Me cierra la  (the programme)
            menu.setVisible(false);
            dispose();
        });

            btnEuro.addActionListener(e-> {

                data(txtWriteNumber.getText());
                lblTotal.setText(String.valueOf(logicCurrency.calculateEuro()));

            });

            btnDollar.addActionListener(e-> {

                data(txtWriteNumber.getText());
                lblTotal.setText(String.valueOf(logicCurrency.calculateDollar()));

            });

            btnYen.addActionListener(e-> {

                data(txtWriteNumber.getText());
                lblTotal.setText(String.valueOf(logicCurrency.calculateYen()));

            });
        }

    private void hideWindow(){
        this.dispose();
    }

    private void data (String val1) {
        logicCurrency.setNumber1(Double.parseDouble(val1));
        lblTotal.setVisible(true);

    }

}
