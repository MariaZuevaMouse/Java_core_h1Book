package java_core.swingAction11.action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionFrame extends JFrame {
    private  JPanel buttonPanel;
    private  static final  int DEFAULT_WIDTH = 500;
    private  static final int DEFAULT_HEIGHT = 350;

    public ActionFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();

        Action yellowAction = new ColorAction("Yellow",
                new ImageIcon("blue-ball.gif"), Color.YELLOW);
        Action blueAction = new ColorAction("Blue",
                new ImageIcon("yellow-ball.gif"), Color.BLUE);
        Action redAction = new ColorAction("Red",
                new ImageIcon("red-ball.gif"), Color.RED);

        buttonPanel.add(new JButton(yellowAction));
        buttonPanel.add(new JButton(blueAction));
        buttonPanel.add(new JButton(redAction));

        add(buttonPanel);

        InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel-yellow");
        imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel-blue");
        imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel-red");

        ActionMap  amap= buttonPanel.getActionMap();
        amap.put("panel.yellow", yellowAction);
        amap.put("panel.blue", blueAction);
        amap.put("panel.red", redAction);






    }
    public class ColorAction extends AbstractAction{
        public ColorAction(String name, Icon icon, Color c) {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION,
                    "Set panel color to - " +name.toLowerCase());
            putValue("color", c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color");
            buttonPanel.setBackground(c);
        }
    }
}
