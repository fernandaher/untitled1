package options.mathsoperations;

import static classes.constants.IntegerMaths.*;
import static classes.constants.StringMaths.*;
import classes.operations.LogicMaths;
import menu.Menu;

import javax.swing.*;
import java.awt.Frame;


public class MathsOperations extends Frame {
    //Las instancias se hacen antes de los atributos
    private static LogicMaths logicMaths = new LogicMaths();

    protected JPanel mathsOperationsForm;
    protected JButton optionMathsOperationsButton;
    protected JTextField txtNumberOne;
    protected JTextField txtNumberTwo;
    protected JButton btnPlus;
    protected JButton btnRest;
    protected JButton btnMul;
    protected JButton btnDiv;
    protected JButton btnExit;
    protected JLabel lblWrite1;
    protected JLabel lblWrite2;
    protected JLabel lblTotal;
    protected JButton btnBack;


    //constructor: cada ventana debe de tenerlo y contener los mismo parametros que contiene éste
    public MathsOperations(){
        add(mathsOperationsForm);
        //dar nombre al formulario parte superior
        setTitle(TITLE_OPTION_MATHS.getText());
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
            //Me cierra la ventana
            menu.setVisible(false);
            dispose();
        });
        btnPlus.addActionListener(e-> {

                data(txtNumberOne.getText(), txtNumberTwo.getText());
                lblTotal.setText(String.valueOf(logicMaths.calculatePlus()));


        });

        btnRest.addActionListener(e-> {

                 data(txtNumberOne.getText(), txtNumberTwo.getText());
                 lblTotal.setText(String.valueOf(logicMaths.calculateRest()));

        });

        btnMul.addActionListener(e-> {

                data(txtNumberOne.getText(), txtNumberTwo.getText());
                lblTotal.setText(String.valueOf(logicMaths.calculateMultiplication()));

        });
        btnDiv.addActionListener(e-> {

                data(txtNumberOne.getText(), txtNumberTwo.getText());
                lblTotal.setText(String.valueOf(logicMaths.calculateDivision()));

        });

    }

    //método para esconder ventana
    private void hideWindow(){
        this.dispose();
    }

    private void data (String val1, String val2) {

        logicMaths.setNumber1(Double.parseDouble(val1));
        logicMaths.setNumber2(Double.parseDouble(val2));
        lblTotal.setVisible(true);

    }
}
