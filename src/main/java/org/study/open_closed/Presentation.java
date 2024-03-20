package org.study.open_closed;

public class Presentation {

    /*
    * TODO en este sentido estamos cumpliendo con el principio de Single Responsibility,
     * dado que cada clase tiene una alta cohesión, las clases POJO se encarga de lo que deben mostrar, mientras que la
     * clase de presentación de como lo debe mostrar.


     *
    * TODO pero no estamos cumpliendo con el principio Open/Closed; dado que, que pasa si el día de mañana agregamos una nueva clase que
     * deba de mostrar el área, tendríamos que venir a esta misma clase de presentación y agregar otro método más para
     * para poder mostrar el área, tal como se está haciendo ahora con la ayuda de la sobrecarga de métodos, lo cual estaria
     * haciendo que vengamos a modificar la clase, primeramente con código innecesario y segundo que el principio Open/Closed
     * dice que nuestro sistema debe de estar abierto a la extensión pero cerrado a la modificación.
     * Para esto la solución seria analizar que tienen en común las clases si comparten atributos o métodos en común y en base a eso
     * decidir si podemos aplicar una herencia donde la super clase tenga los atributos que tienen en común las sub clases,
     * o si podemos aplicar la implementación de una interface si nuestras clases comparten métodos en común, como es nuestro caso
     * con el método área, siendo cada clase la que realiza le implementación del método, o si se aplicaría una herencia de una clase abstracta
     * si por el contrario las clases comparte no solo métodos sino atributos en común.
     * */

    /* TODO esto estaria mal

    public void printArea(Rectangle rectangle){
        System.out.println("Area: " + rectangle.area());
    }

    public void printArea(Triangle triangle){
        System.out.println("Area: " + triangle.area());
    }
    */


    /*TODO lo correcto sería llamar al método de la super clase o atributo, en este caso al método área,
        de en este caso nuestra interface, siendo hacía que no tendremos que preocuparnos por modificar el codigo
        ya existente y cumpliendo con el principio de Open/Closed así si el día de mañana necesitamos agregar una nueva funcionalidad
        en esta clase de presentación ya no de presentar el área de las figuras sino otra cosa, estriamos dejando el sistema
        abierto a extenderse pero cerrado a la modificación pues no estaríamos modificando lo ya existente de la presentación del área,
        puesto que mandamos a llamar el método área de la interface o super clase, y cada pojo que la implementa se encarga de cómo realizar la
        implementación de ese método cumpliendo con el contacto
     */

    public void printArea(IFigure figure) {
        System.out.println(figure.area());
    }
}
