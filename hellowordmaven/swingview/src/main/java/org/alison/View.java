package org.alison;

import javax.swing.*;

public class View implements IView {

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public int askForInt(String message) {
        this.showMessage(message);
        return new java.util.Scanner(System.in).nextInt();
    }
}
