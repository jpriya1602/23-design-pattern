OO PRINCIPLES:
* Encapsulate what varies
* open for extension closed for modification
* program to interface not implementation 
* favor composition over inheritance
* Principle of the Least Knowledge: talk only to your immediate friends. (same as Law of demeter)
* Talk only to your friends
* strive for loose coupled design between the objects that interact

Design Patterns:

Creational patterns:
-how to create objects
-aim to encapsulate the object instantiation process
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
2. Composite pattern - 8:
    * Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat
      collections of objects and individual objects uniformly
    * A Component is any object in a Composite structure. Components may be other composites or leaves.
    * There are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your needs.
3. Adapter Pattern - 7
   * pattern act as a bridge between two incompatible interface
   * Allows incompatible interfaces to work together
4. Facade Pattern - 9
   * Make an interface simpler for use/ complex interfaces of one/more classes, they are easier to use
   * provide a unified interface to a set interfaces of subsystem. defines the higher level interfaces, that makes the subsystem to easier to use 
   * can implement more than one facade for subsystem
   
5. Proxy Design Pattern:
   * Subject interface(defines operation needs to be implemented),
   * real subject(actual object referred by proxy),
   * proxy (delegates the request to real subject, performs additional operation like logging, caching,access control)
* **Types**:
   * virtual proxy - supports lazy initialization
   * protection proxy - Controls access to the real subject based on permissions and can prevent unauthorized access.
   * remote proxy - provide a local representative for the objects in the remote space
   * smart proxy - additional functionality like monitoring, logging before delegating the request to the real proxy
   *  ODM (Object Data Mapper)
   
6. Bridge Design Pattern - 12
   * Decouple an abstraction from its implementation 
   * Abstraction - high level control/interface that client interacts with (what operations needs to interacted with client)
   * Implementor - defines underlying operation that supports Abstraction / focuses on how operations are performed. 
   * The operations in the Abstraction will delegate work to the Implementor, which carries out the actual work.
7. Flyweight Design Pattern - 11 (memory limited keyword)
    * used to manage the object that shares the similar or identical states
      separate intrinsic state (shared among multiple objects) from the extrinsic state(unique to each object)
      intrinsic -> constant data stored within in object, not changeable by the external entities, consistent across 
      different entities  
      extrinsic -> variable data of an object, influenced or altered by the external factors, static is dynamic and 
      vary between multiple objects
   * when to use: 
        large number of objects (with shared of intrinsic state)
        memory optimization (reduce the memory, by sharing common state among multiple objects)
        objects can be made immutable
        performance - reducing the number of object creation, reducing the redundant data storage
   * Flyweight class can be immutable
   * 
   * Game, Design word processor
   * 
        
      

Behavioural Patterns:

1. Strategy Design pattern - 13
   Take what varies and encapsulate it, so it won't affect rest of the code, so that later you can
   alter or extend the parts that vary without affecting those that don’t.
   Identify the aspects of your application that vary and separate them from what stays the same.
   The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from
   clients that use it.
         has-a
   client --> IBehaviour 
                  | is-a
                concrete Behaviour
2. Observer - 17
    publishers + subscriber = observer pattern
    publishers -> subject
    subscriber -> observers
    defines one-to-many relationship between set of the objects, when state of one object changes, all of its dependents
    are notified and updated automatically.
    observers are dependent on the subject
3. State design pattern -14
    problem involves State, actions and transition between the states because of actions
    - allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.
    State interface:
      - handle (mostly the actions in the problem)
      will have concrete states
    - Context - is a class can have number of internal states.
      - have request() -> will delegate the call to state.handle()
      - State Pattern allows an object to have many different behaviors that are based on its internal state.
      - Each state as a full-blown object
      - context get its behaviour by delegating to the current state object is composed with
      - state and strategy have same class diagram, but differ in its intent
      - greater number of classes
      - state classes can be shared among context instances 
4. Chain of responsibility - 20
    - want to give more than one object a chance to handle a request.
    - Decouples the sender of the receiver and its receiver
    - Each object in the chain acts as a handler and has a successor object. If it can handle the request,
      it does; otherwise, it forwards the request to its successor.
    - Handler ( abstract class, handle request method )
        |
    concrete handler()
5. Command design pattern - 15
            1.*
    Invoker (setCommand) --> ICommand(execute, unexecute)
                    |
    receiver(action)  <-- Concrete Command(execute, unexecute)
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
