package lessonFour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {
    public Chat() {
        setTitle("Chat");
        setBounds(500, 100, 400, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);
        JButton button = new JButton("Exit");
        button.setPreferredSize(new Dimension(60,25));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(button);
        add(menuBar, BorderLayout.NORTH);


        JPanel top = new JPanel();
        add(top, BorderLayout.CENTER);
        top.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        top.add(textArea, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        bottom.add(inputField, BorderLayout.CENTER);
        JButton submitBtn = new JButton("SEND MESSAGE");
        bottom.add(submitBtn, BorderLayout.EAST);

        ActionListener inputTextListener = new Send(textArea, inputField);
        submitBtn.addActionListener(inputTextListener);
        inputField.addActionListener(inputTextListener);

        setVisible(true);
    }
}
