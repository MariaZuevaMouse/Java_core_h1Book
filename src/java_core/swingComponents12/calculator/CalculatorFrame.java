package java_core.swingComponents12.calculator;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame(){
        add(new CalculatorPanel());
        pack();
    }
}
