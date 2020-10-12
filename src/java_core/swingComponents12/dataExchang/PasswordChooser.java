package java_core.swingComponents12.dataExchang;

import javax.swing.*;
import java.awt.*;

public class PasswordChooser extends JPanel {
    private JTextField userName;
    private JPasswordField password;
    private JButton okButton;
    private boolean ok;
    private JDialog dialog;

    public PasswordChooser() {
        setBounds(300,300,200,200);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        panel.add(new JLabel("User name: "));
        panel.add(userName = new JTextField(""));
        panel.add(new JLabel("Password: "));
        panel.add(password = new JPasswordField(""));
        add(panel, BorderLayout.CENTER);

        okButton = new JButton("Ok");
        okButton.addActionListener(e->{
            ok = true;
            dialog.setVisible(false);
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e->dialog.setVisible(false));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    public void setUser(User u){
        userName.setText(u.getName());

    }
    public User getUser(){
        return new User(userName.getText(), password.getPassword());
    }
    public  boolean showDialog(Component parent, String title){
        ok = false;

        Frame owner = null;
        if(parent instanceof Frame)
            owner = (Frame) parent;
        else
            owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);

        if(dialog == null || dialog.getOwner() != owner){
            dialog = new JDialog(owner, true);
            dialog.add(this);
            dialog.getRootPane().setDefaultButton(okButton);
            dialog.pack();
        }
        dialog.setTitle(title);
        dialog.setVisible(true);
        return ok;
    }
}
