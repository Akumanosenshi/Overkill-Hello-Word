package org.alison;

public class View implements IView {

    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public int askForInt(String message) {
        System.out.println(message);
        return new java.util.Scanner(System.in).nextInt();
    }
}
