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
     Key Concepts of Adapter Pattern
     Target Interface: The interface that the client expects. The adapter will implement this interface.
     Adaptee: The existing class or component that needs to be adapted to the new interface.
     Adapter: The class that implements the target interface and internally uses an instance of the adaptee class to fulfill the requests.
     Client: The class that interacts with the target interface. 
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
6. Template - 16
    template method defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps.
    Template method defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine
   certain steps of an algorithm without changing the algorithm’s structure.
    Abstract class - defines the template method, abstract versions of the operations used in the template method
    There may be many ConcreteClasses, each implementing the full set of operations required by the template method.
    hook - method that is declared in the abstract class, but only given an empty or default implementation. subclass 
    can override the hook ifs it wants to/ or not
    use hooks when part of the algorithm is optional
    - here inheritance is favored here. we are sure, we do not have invariant algorithm 
7. Momento  - 23
   Memento is a behavioral design pattern that lets you save and restore the previous state of an object without 
   revealing the details of its implementation.
    
    1. originator - create a snapshot of its own state and restore the state from the snapshot
    2. memento - value object that act as snapshot of the originator state
    3. caretaker - knows not only “when” and “why” to capture the originator’s state, but also when the state should be restored.
                   can keep track of the originator’s history by storing a stack of mementos.
                   When originator has to travel back in history, the caretaker fetches the topmost memento from the stack
                   and passes it to the originator’s restoration method.
   4. you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
8. Interpreter - 21
   provides a mechanism to interpret and evaluate language expressions by defining a grammar and an interpreter.
    - define a grammar for a simple language
    - represents language as classes and use recursive algorithm to evaluate expression.
    - _Context_ 
      - contains the global information that is passed to the interpreter
    - _AbstractExpression_ 
      - defines an abstract interface for langauge expressions
      - declares an interpret() method that defines the interpretation logic for the expressions
    - _TerminalExpression_ 
      - classes represent the elementary building blocks of the language
      - implement the abstract expression interface and provide the interpretation logic for the terminal expressions.
    - _NonTerminalExpression_
      - classes represent the complex expressions that may contain subexpressions
      - implement the abstract expression interface and provide the interpretation logic for the composite expressions
    - ![Screenshot 2024-09-21 at 9.44.16 PM.png](..%2F..%2F..%2FDesktop%2FScreenshot%202024-09-21%20at%209.44.16%E2%80%AFPM.png)
    - Advantages:
      - Easy to change and extend the grammar
      - Implementing the grammar is easy
      - Adding new ways to interpret expressions is easy
      - Disadvantages:
      - Complex grammars are hard to maintain
      - Performance may be a critical issue
      - The grammar might be too complex to implement using the interpreter pattern
9. Mediator with online auction - 22
    - to centralize the complex communications and control between the objects
    - pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
    - defines an object that encapsulates how a set of other objects interact with one another
    - mediator(notify sender)
          |
    - concrete mediator(keep references to all component it manages) --> Components(expects mediator and do some operation)
          
10. Iterator -18
    extracts the traversal behavior of a collection into a separate object called an iterator.
    - provides a way to traverse the elements of collection sequentially without exposing its underlying representation.
    - encapsulates all the traversal details
      -   Iterable                 Iterator
 getInterator() |                     |   bool hasNext(), void next(), current()
-   ConcreteIterable             Concrete Iterator
11. Null object --> command pattern, we have used NO-COMMAND

— VISITOR pattern -> 19

note:
An adapter wraps an object
to change its interface, a
decorator wraps an object
to add new behaviors and
responsibilities, and a facade
“wraps” a set of objects to
simplify.

References:
https://medium.com/@rajeshvelmani/understanding-language-interpretation-with-the-interpreter-design-pattern-in-java-b2a3969eaf9
https://refactoring.guru/design-patterns
https://medium.com/@vino7tech/design-pattern-in-java-14289cc56f5b
Head First design patterns book

