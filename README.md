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

