package org.study.single_responsibility;

public class Main {

    public static void main(String[] args) {

        /*TODO ambas clases tiene una alta cohesion, dadoq eu cumplen con una unica responsabilidad,
        la clase Rectangulo responde a la pregunta que se debe de mostrar? y la clase presentacion responde
        a la pregunta como se debe de mostrar?, en donde cada clase trabaja de manera indepndiente sin estar acompladas*/
        Rectangle rectangle = new Rectangle(4.5, 6.0);
        Presentation presentation = new Presentation();
        presentation.print(rectangle);
    }
}
