package org.study.single_responsibility;

public class Rectangle {

    private Double height;
    private Double base;

    public Rectangle(Double height, Double base) {
        this.height = height;
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public Double getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }

    public Double area(){
        return this.base * this.height;
    }

    /*TODO la clase pierde su chosesion, no se cumplirira con el principio de Single responsibility,
    al agregar un metodo que no tiene nada que ver con la funcionalida de la clase, en este ejmplo este
    metodo tien por funcionalida de imprimir el obejto Rectangulo, y esta no seria una repsosabilida de mi obejto
    rectangulo, dado mi clase solo debria de cencargase de sus funcionalidades especicas, de que datos debde de mostrar,
    no de como deben de ser mostrados que en este caso es la funcionalida de este metodo al imprimir el obejto,
    esta debe ser funcionalida de una clase que se encargue de ello, en la capa de presentacion.
    El metodo toString sobreescrito de la clase Object esta retornando la informacion del obejto, por ende se ajusta al princiio,
    esta suministrando que datos en relacion con la funcionalida propia de la clase al contrario del metodo print que tenemos.
     */
    /*TODO si por ejemplo el dia de mañan encesitamos que no se imprima por consola si no en otro medio, tendriamos que venir a modificar
    *  el codigo existene, lo cual no es nada bueno, y estariamos rompiedo con el principio Open/Closed tambien.*/
    /*public void print(){
        System.out.println(this);
    }*/
}
