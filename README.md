# Curso de Patrones de Diseño


### Principios SOLID
SOLID es un acronimo a los 5 principios fundamentales de la OOP, que al 
aplicarse en nuestro desarrolllo podemos crear aplicaciones que sean modulables,
reutiizables y mantenibles.
* [S => Single Responsibility](https://github.com/juanpablommm/design_patterns/tree/master/src/main/java/org/study/single_responsibility)
* O => Open/Closed
* L => Sustitucion Liskov
* I => Interface Segregation
* D => Dependency Inversion


### Single Responsibility (Responsabilidad Unica)
* Cohesion => La cohesión es una medida de cuanto una unidad tiene 
relacion con sigo misma. **Recordar manejar siempre alta cohesion y bajo acomplamiento**.
Una clase dedbe de tener una unica responsabilidad garantizando que tengan una alta cohesion consigo misma, y
un bajo acoplamiento.

* "A Class should have one and only reason to change, meaning tha a class shouls have only one job"
**Una clase debe tener una única razón para cambiar, lo que significa que una clase debe tener un solo trabajo.**


### Open/Closed (Abierto a Extension, Cerrado a Modificacion)
Este principio nos dice que nuestra entidad, nuestra clase, un modulo, una funcion o demas, debe de estar abierta a
la extension pero cerrada a la modificacion
* "Objects or entities should be open for extension, but closed for modification"
Si nosotros queremos extender nuestra aplicacion deberemos de poder lograrlos sin tener que modificar el codigo ya 
existente, donde por ejemplo si tenemos un modulo en nustra aplicacion de alta de usarios, y queremos agregar
un nuevo modulo de autenticacion en nuestra aplicacion no debriamos porque tener que modificar o reconstruir el modulo
de alta de usarios que ya se tiene o ningun otro modulo ay existente. **Este princpio suele resolverce mediante la herencia
o aplicando un tipado sobre los objectos mediante interfaces o mediante clases abstractas, logrando asi que cumplan con un contrado 
al tener metodos que son comunes en tre diferentes tclases o atributos que compartan**

### Substitution de Liskov
En términos simple este principio nos menciona que los subtipos deben de ser sustituibles por
sus tipos base.
* "let q(x)be a property provable about objects of x of type T. 
Then q(y) should b provable for objects y of type S where S is a subtype of T"

Si una clase S es un subtipo de una clase T, entonces lo objectos de tipo T en un programa  
pueden ser reemplazados por objectos de tipo S sin alterar ninguna de las propiedades
deseables del programa, Es decir en términos prácticos, esto significa que las subclases deben
de ser sustituibles por sus clases base sin que esto cause errores en el programa. Si el código que usa
la clase base no puede utilizar la subclase de forma intercambiable sin conocer la diferencia entre ellas,  
entonces la subclase estaría violando el principio de Sustitución de lskov 
 

 