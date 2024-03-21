package org.study.interfacesegregation;

public interface IFeline {

    /*
    * TODO dado que el principio de Interface Segregation nos menciona que
        nunca se debe obligar a un cliente a implementar una interfaz que no utiliza
        o no se debe obligar a los clientes a depender de métodos que no utilizan.
        tenemos que abstraer a un más nuestra idea de un felino ya que no todos los felinos pueden maullar
        no todos los felinos pueden rugir, siendo esta un fat interface, dado que me obligaría a las clases que
        la imprentan a cumplir con ese contracto anqué no dependiendo de métodos que no emplean no utilizan, donde por ejemplo
        el jaguar no puede maullar, no tenemos porque obligarlo, en ese sentido no estaríamos cumpliendo con el principio de
        interface segregación, mismo caso para un gato, un gato un gato no podría rugir porque tendríamos que obligarlo
    *
    *   TODO para ello se abstrae a un más la idea de un felino; en donde podemos notar dos diferentes clases de felinos por el momento,
            para lo cual podemos crear dos interfaces más, que obliguen a utilizar a las clases que la implemente los mentodos
            que en verdad si deberían de tener, por ejemplo podríamos tener una interface para felino salvaje, que tenga definido
            el método de rugir y una para felino casero que tenga definido el método de maullar, ambas heredan de la interfaces felino
            ya que todos los felinos cazan, cumpliendo así con el contrato de cada una sin obligar a las clases que las implmentar
            a depender de estos métodos que no utilizan, así un jaguar implementaría la interface felino salvaje, en donde tendría que implementar los
            metodos de cazar y rugir, y un gato implementaría la interface de felino casero, imprentando los método s de maullar y cazar, sin formzar
            a ninguna a de estas clases a depender de métodos que no utilizan.
    *
        TODO al cumplir con este principio indirectamente cumpliríamos también con el principio de Sustitucion de Liskov dado que
            podremos intercambiar cualquier tipo de la clase base por la subclase y nuestro sistema seguirá funcionado, puesto que no
            se realizó una implementación vacía o que lance una excepción forzada en la implantación de un método que no tenía nada que ver con
            la clase base, podemos fácilmente declarar un objeto que sea de tipo felino salvaje y que sea un instancia de jaguar,
            pues esta clase no está siendo forzada a depender de un método que no utilice.
    * */

    void hunt();

}
