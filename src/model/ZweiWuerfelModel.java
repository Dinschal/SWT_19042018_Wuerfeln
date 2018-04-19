package model;

import java.util.Observable;
import java.util.Random;

public class ZweiWuerfelModel extends Observable implements Model {

    private int zahl1;
    private int zahl2;
    private Random random;
    private boolean erstesWuerfeln;

    public ZweiWuerfelModel() {
        random = new Random();
        erstesWuerfeln = false;
    }


    @Override
    public void setErstesWuerfeln() {
        zahl1 = random.nextInt(6) + 1;
        zahl2 = random.nextInt(6) + 1;
        setChanged();
        notifyObservers();
    }

    @Override
    public void setUmdrehen() {
        zahl1 = 7 - zahl1;
        zahl2 = 7 - zahl2;
        setChanged();
        notifyObservers();
    }


    @Override
    public String setWuerfelnText() {
        String text = "";
        text = ("<html><body><ul>"
                + "<li>Würfel 1: " + zahl1 + "</li>"
                + "<li>Würfel 2:  " + zahl2 + "</li>"
                + "<li>Augensumme: " + (zahl1 + zahl2) + "</li>"
                + "</ul></body></html>");
        return text;
    }

    @Override
    public String setUmdrehenText() {
        String text2 = "";
        text2 = ("<html><body><ul>"
                + "<li>Würfel 1: " + zahl1 + "</li>"
                + "<li>Würfel 2:  " + zahl2 + "</li>"
                + "<li>Augensumme: " + (zahl1 + zahl2) + "</li>"
                + "</ul></body></html>");
        return text2;
    }


    @Override
    public boolean erstesWuerfeln() {
        return erstesWuerfeln;
    }

    @Override
    public boolean umdrehen() {
        return !erstesWuerfeln;
    }
}
