package org.study.interfacesegregation;

public class Jaguar implements IWildFeline {

    @Override
    public void hunt() {
        System.out.println("The jaguar hunts");
    }

    @Override
    public void roar() {
        System.out.println("The jaguar roars");

    }

}
