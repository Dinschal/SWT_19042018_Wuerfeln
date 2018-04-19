package gui;

import model.ZweiWuerfelModel;
import model.Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Presenter implements Observer {

    private View view;
    private ZweiWuerfelModel model;

    public Presenter(){
        view = new ZweiWuerfelView();
        model = new ZweiWuerfelModel();
        model.addObserver(this);

        view.setWuerfelnButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErstesWuerfeln();

            }
        });

        view.setUmdrehenButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setUmdrehen();
            }
        });

    }



    @Override
    public void update(Observable o, Object arg) {

        boolean wuerfeln = model.erstesWuerfeln();
        String text = model.setWuerfelnText();
        String text2 = model.setUmdrehenText();

        view.setWuerfelntext(text);
        if (wuerfeln){
            view.setWuerfelntext(text);
        } else {
            view.setUmdrehenText(text2);
        }
    }
}
