package org.study.subtitutionliskov;

public class Main {

    public static void main(String[] args) {

        /*TODO No estamos cumpliendo con el principio de Susitutcion de Liskov, dado que el objeto de
            la subclase felino no pues ser intercambiable por el de la clase base, no cumple con el contracto de la interface
            en su totalidad dado que se definió que lance una excepción para el método un objeto de la subclase debería poder ser
             sustituido por la clase base sin afectar el comportamiento del programa. */
        IFeline jaguar = new Jaguar();
        jaguar.meow();
    }
}
