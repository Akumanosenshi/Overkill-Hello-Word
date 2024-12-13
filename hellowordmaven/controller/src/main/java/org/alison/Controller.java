package org.alison;

public class Controller implements IController {

    private IModel model;
    private IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.showMessage(model.getHello(view.askForInt("Enter a number:")));
    }
}
