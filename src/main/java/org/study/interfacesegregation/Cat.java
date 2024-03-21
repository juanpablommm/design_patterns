package org.study.interfacesegregation;

public class Cat implements IHomemadeFeline{


    @Override
    public void hunt() {
        System.out.println("The cat hunts");
    }

    @Override
    public void meow() {
        System.out.println("The cat meows");
    }
}
