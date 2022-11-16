package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class FlowFrame extends JFrame {
    Dimension dim = new Dimension(400, 150);

    FlowFrame(String title, String[] buttons){
        super(title);
        FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 10, 2);
        setLayout(flow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(dim);
        setLocationRelativeTo(null);
        JButton[] jButtons = createButtons(buttons);
        for( JButton btn : jButtons ){
            add(btn);
        }


        setVisible(true);
    }

    JButton[] createButtons(String[] buttons){
        Arrays.sort(buttons);
        JButton[] jButtons = new JButton[buttons.length];
        int i = 0;
        for( String text : buttons ){
            JButton btn = new JButton(text);
            jButtons[i] = btn;
            i++;
        }
        return jButtons;
    }

}
