OO PRINCIPLES:
* Encapsulate what varies
* open for extension closed for modification
* program to interface not implementation 
* favor composition over inheritance
* Principle of the Least Knowledge: talk only to your immediate friends. (same as Law of demeter)
* Talk only to your friends

Design Patterns:

Creational patterns:
-how to create objects
- aim to encapsulate the object instantiation process
1. Singleton
2. Factory
3. Abstract Factory
4. Prototype
5. Builder pattern

Structural Patterns:
organizing and composing classes and objects to form larger structures
- way to combine/arrange different classes and objects to form a complex or bigger structure to solve a particular problem

1. Decorator Pattern - 6
    * decorators have same supertype as object they decorate
    * The decorator adds its own behavior before and/or after delegating to the object it
      decorates to do the rest of the job.
2. Composite pattern - 8
3. Adapter Pattern - 7
   * pattern act as a bridge between two incompatible interface
   * Allows incompatible interfaces to work together
4. Facade Pattern - 9
   * Make an interface simpler for use/ complex interfaces of one/more classes, they are easier to use
   * provide a unified interface to a set interfaces of subsystem. defines the higher level interfaces, that makes the subsystem to easier to use 
   * can implement more than one facade for subsystem
   * 
5. Proxy Design Pattern
6. Bridge Design Pattern - 12
7. Flyweight Design Pattern - 11

Behavioural Patterns:

1. Strategy Design pattern - 13
2. Observer - 17
3. State design pattern -14
4. Chain of responsibility - 20
5. Command design pattern - 15
6. Template -16
7. Memonto  - 23
8. Interpreter - 21
9. Mediator with online auction - 22
10. Iterator -18
11. Null object

— VISITOR pattern -> 19

note:
An adapter wraps an object
to change its interface, a
decorator wraps an object
to add new behaviors and
responsibilities, and a facade
“wraps” a set of objects to
simplify.
