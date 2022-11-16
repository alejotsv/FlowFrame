package com.java21days;

import javax.swing.*;
import java.awt.*;

public class FlowFrame extends JFrame {
    Dimension dim = new Dimension(400, 150);

    FlowFrame(String title, String[] buttons){
        super(title);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(dim);
        setLocationRelativeTo(null);



        setVisible(true);
    }

    JButton[] createButtons(String[] buttons){
        JButton[] jButtons = new JButton[buttons.length];

        return jButtons;
    }
}
