package br.com.lucaspestana.calc.visao;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Display extends JPanel {

    private final JLabel label;

    public Display() {
        setBackground(new Color(46, 49, 50));
        label = new JLabel("122334,44");
        label.setForeground(Color.white);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }
}
