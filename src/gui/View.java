package gui;

import java.awt.event.ActionListener;

public interface View {

void setWuerfelnButtonListener(ActionListener w);
void setUmdrehenButtonListener(ActionListener u);
void setWuerfelntext(String text);
void setUmdrehenText (String text);
}
