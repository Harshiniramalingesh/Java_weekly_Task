Day 8:

Interface Default Methods (Java 8) 
Definition:
Default methods are methods inside an interface that have a body. 
They were introduced in Java 8 using the default keyword.
Purpose:
To allow interfaces to evolve without breaking existing implementations. 
To provide backward compatibility when adding new methods to an interface. 
To support enhancements in collections and Stream API in Java 8.
Key Characteristics: 
Defined inside an interface with implementation.
Implementing classes may override them. Cannot override methods of the Object class (such as toString, equals, hashCode).
Can be invoked using InterfaceName.super.methodName() inside the implementing class.

Method Resolution Rules:
Class methods take highest priority. 
If multiple interfaces provide the same default method, the class must override it. 
If a class inherits a method from a superclass and a default method from an interface, the superclass method is chosen.

Functional Interfaces Definition:
A functional interface is an interface that contains exactly one abstract method.

Purpose:
To enable lambda expressions.
To support functional programming features introduced in Java 8. 
Used heavily in Stream API and event handling.

Important Points:
Can contain only one abstract method.
Can have multiple default methods.
Can have multiple static methods. 
The @FunctionalInterface annotation is optional but recommended. 
If more than one abstract method is declared, compilation fails.

Common Built-in Functional Interfaces (java.util.function package):

Predicate: Takes input and returns boolean.

Function: Takes input and returns a result.

Consumer: Takes input and returns nothing.

Supplier: Takes no input and returns a result.

Benefits: 
Cleaner and shorter code using lambda expressions.
Encourages functional programming style.
Improves readability in collection processing.
Multiple Inheritance Issues in Java

Java’s Approach: 
Java does not support multiple inheritance of classes.
Java supports multiple inheritance of type through interfaces.

Reason: To avoid ambiguity and complexity, especially the Diamond Problem.

Diamond Problem: 
Occurs when two interfaces provide a default method with the same signature and a class implements both interfaces. 
The compiler cannot decide which method to inherit.

Resolution: The implementing class must override the conflicting method.
Inside the override, it can explicitly call a specific interface’s default method.

No Conflict Situations:
If two interfaces declare the same abstract method, there is no issue. 
The implementing class provides one implementation. If a superclass and an interface both provide the same method, the superclass method is chosen automatically.

Priority Order: Methods from the class hierarchy. More specific interface methods. 
Explicit override required when ambiguity exists.
