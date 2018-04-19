package gui;

import model.ZweiWuerfelModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ZweiWuerfelView extends JFrame implements View{

    private JButton buttonWuerfeln;
    private JButton buttonUmdrehen;
    private JLabel label;

public ZweiWuerfelView(){
    initLayout();
}

    private void initLayout() {
    label = new JLabel ("Bitte würfeln");
    label.setHorizontalAlignment(JLabel.CENTER);
    buttonWuerfeln = new JButton("Würfeln");
    buttonUmdrehen = new JButton("Umdrehen");

    add(buttonWuerfeln, BorderLayout.NORTH);

        add(buttonUmdrehen, BorderLayout.SOUTH);
        add(label);

    setSize(320,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }


    @Override
    public void setWuerfelnButtonListener(ActionListener w) {
        buttonWuerfeln.addActionListener(w);

    }

    @Override
    public void setUmdrehenButtonListener(ActionListener u) {
        buttonUmdrehen.addActionListener(u);
    }

    @Override
    public void setWuerfelntext(String text) {
        label.setText(text);
    }

    @Override
    public void setUmdrehenText(String text2) {
label.setText(text2);
    }
}
