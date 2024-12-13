package org.alison;

public class Main {
    public static void main(String[] args) {

        IModel model = new Model();
        IView view = new View();
        IController controller = new Controller(model, view);

        controller.run();

    }
}