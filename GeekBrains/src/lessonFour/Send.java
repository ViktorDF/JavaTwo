package lessonFour;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Send implements ActionListener {
    private JTextArea textArea;
    private JTextField textField;

    public Send(JTextArea textArea, JTextField textField) {
        this.textArea = textArea;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder(textArea.getText());
        sb.append("\n").append(textField.getText());
        textArea.setText(sb.toString());
        textField.setText("");
    }
}
