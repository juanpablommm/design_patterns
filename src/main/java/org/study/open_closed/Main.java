package org.study.open_closed;

public class Main {

    public static void main(String[] args) {

        /*
        * TODO desde nuestra clase main, todo quedaría igual tenemos nuestras instancias de los pojos,
         *  sea un triángulo, un rectángulo o cualquier otra figura nueva que creemos el día de mañana
         *  y dado que están implementan la interface Figura puedo hacer uso del método de imprimir area
         *  que tenemos definido en nuestra clase de presentación, dado que cumplen con el contracto definido en la interface.
         * */

        Rectangle rectangle = new Rectangle(4.5, 6.0);
        Triangle triangle = new Triangle(3.6, 3.6);
        Presentation presentation = new Presentation();
        presentation.printArea(rectangle);
        presentation.printArea(triangle);
    }
}
