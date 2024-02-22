package org.study.single_responsibility;

public class Presentation {

    /*TODO siendo esta clase la que se encargue de la preetnacion estariamos cumpliendo con el principio de
    *  Single Responsibility, dado que esta se encarga de como mostrar el retangulo, como presentarlo, responsabilidad
    * que no le pertence al retacngulo, el solo nos suministra los datos que esten ligados con su existencia.*/
    public void print(Rectangle rectangle){
        System.out.println(rectangle);
    }
}
