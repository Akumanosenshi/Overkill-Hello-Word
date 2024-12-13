package org.alison;

public class Model implements IModel {

    public String getHello() {
        return "Hello you!";
    }

    @Override
    public String getHello(int id) {
        return "Hello new hello";
    }

}
