package org.study.interfacesegregation;

public class Main {

    public static void main(String[] args) {

        /*
        * TODO cumplimos también con el principio de sustitución de Liskov, nuestra clase base en este caso al interface
            puede ser sustituida por las subclases sin conocer diferencia, sin que afecte el funcionamiento de nuestro programa.
            si observamos ambos felinos cazan sea un jaguar o un gato sin afectar el funcionamiento del programa, no tenemos fat interface
            *   y no se obliga a un jaguar a maullar o a un gato a rugir
        * */
        IFeline jaguar = new Jaguar();
        jaguar.hunt();
        IFeline cat = new Cat();
        cat.hunt();

        IWildFeline jaguar2 = new Jaguar();
        jaguar2.roar();
        jaguar2.hunt();

        IHomemadeFeline cat2 = new Cat();
        cat2.meow();
        cat2.hunt();;

    }
}
