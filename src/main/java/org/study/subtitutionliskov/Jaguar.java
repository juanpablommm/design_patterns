package org.study.subtitutionliskov;

public class Jaguar implements IFeline {

    @Override
    public void hunt() {
        System.out.println("The jaguar hunts");
    }

    @Override
    public void roar() {
        System.out.println("The jaguar roars");

    }


    /*TODO este ejemplo es un clara violación del principio de Sustitución de Liskov
        dado que si por ejemplo tenemos un método que espera objecto de la super clase o clase base,
        en este caso de la interface felino, estaríamos esperado que pueda cumplir con los contractos establecidos
        en dicha interface, o si fuese la clase base por herencia ya sea que se comparten atributos y métodos en común,
        no tendría porque las subclases  hacer implementaciones vacías, nulas o lanzar excepciones al no compartir dichas caracteriscas
        o comportamientos con la clase base.
        En este caso en particular vemos que la interface felino tiene los métodos de cazar, rugir, y maullar, pero el jaguar
        no maúlla, por ende se implementó que ese método lance una excepción, lo cual estaría rompiendo el principio de Sustitución de
        Liskov, dado que los objectos que surjan de la clase jaguar no podrán ser intercambiables con los demás objecto que surjan de la clase base en este
        caso la interface felino, sin que rompan la funcionalidad del sistema; en este caso se rompería, dado que si declaramos
        un objeto de tipo felino cuya instancia es un jaguar, no podríamos llamar al método maullar porque lanzaría una excepción, un
        error en tiempo de ejecución, estaríamos violando el principio de Liskov donde esperamos poder utilizar felino, sin importar que tipo de felino sea.
        Para tneer en cuenta:
        Sustituibilidad: Las subclases deben poder ser sustituidas por sus clases base sin afectar el comportamiento del programa.
        Diseño por contrato: Las subclases deben cumplir con el contrato definido por la clase base, tanto en términos de comportamiento

        TODO
            Ahora bien, para solucionar esto y cumplir con el principio de Sustitución de Lisko, podríamos rediseñar las clases para asergurarnos
            de que las subclases puedan ser usadas en lugar de las clases base sin generar problemas. En este caso podría aplicar de
            la mano del principio de Segregación de interfaces, crear otras interface para los felinos que maúllan la implementen,
            y de esta forma solo los felinos que maúllan la implementarían en jaguar implementaría la interface felino tal cual, la cual no
            tendria definido el método maullar, dado que este le pertenecería la interface de los felinos que maúllan, la cual extendería de la
            interface felino para quien la implemente deba implementar los métodos de la interface felino como de la interface de lo felins que
            maullan. pudiéndose de esta manera sustituir cualquier objecto de las subclases con la clase base en este caos las interfaces creadas sin
            afectar el comportamiento del sistema.
    * */
    @Override
    public void meow() {
        throw new RuntimeException("The jaguar does not meow");
    }
}
