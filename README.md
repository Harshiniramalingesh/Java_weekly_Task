Day 6:
Object-Oriented Programming (OOP) – Basics
Object-Oriented Programming is a way of designing software by modeling real-world entities as objects that contain data and behavior together.

Class
A class is a blueprint or template that defines:
Properties (data)
Behaviors (methods)
A class itself does not occupy memory for objects.
Memory is allocated only when objects are created from the class.

Object
An object is a real instance of a class.
It represents a real entity
Each object has its own copy of instance variables
Objects interact with each other using methods

Static Context
Static members belong to the class, not to objects.

Static Variables
Only one copy exists for the entire class
Shared among all objects
Memory allocated once when the class is loaded
Accessed using the class name

Static Methods
Can be called without creating an object
Can directly access only static data
Commonly used for utility and factory methods

Static Block
Executes once when the class is loaded
Used for class-level initialization
Instance Context
Instance members belong to an object.
Each object gets its own copy
Accessed using object reference
Instance methods can access both static and instance members

Static vs Instance (Key Difference)
Static is class-level and shared
Instance is object-level and individual

Instance Control
Instance control means restricting how many objects of a class can be created.

Why it matters:
Saves memory
Maintains consistency
Controls access to shared resources
This concept is the foundation of the Singleton pattern.

Singleton Design Pattern
The Singleton pattern ensures that:
Only one object of a class exists
Global access is provided to that object
Core Rules of Singleton
Constructor is private
Instance is stored in a static variable
Object is created and accessed through a static method

Why Singleton is used
Configuration management

Logging
Database connection
Thread pools
Singleton avoids multiple instances that could cause data inconsistency.

Object Counter Concept
Object counter tracks how many objects are created for a class.
How it works conceptually
A static variable stores the count
Constructor increments the count
Since static variables are shared, the count is accurate across all objects

Why static is required
Static ensures one shared counter
Instance variables would create separate counts per object
Accessing Static Data Without Objects

Static members belong to the class, so:
They can be accessed directly using the class name
No object reference is required
This improves clarity and memory efficiency.
Real-World Analogy
Singleton
Like a government-issued ID system
Only one official identity exists per person.
Static Variable
Like a shared notice board
Everyone sees and updates the same board.


-----------------------------------------------------------------------------------------
Day 7:
 Java Inheritance
Mechanism where a child class acquires properties and methods of a parent class
Achieved using extends keyword
Supports code reusability
Java supports single, multilevel, hierarchical inheritance (not multiple via classes)

 IS-A relationship

 Inheritance in Java (why we use it)
Reuse existing code
Reduce duplication
Improve maintainability
Enable polymorphism

Example idea:
Dog extends Animal → Dog IS-A Animal

 Java Polymorphism
Ability of an object to take many forms
Same method name → different behavior

Types:
Compile-time (Method Overloading)
Runtime (Method Overriding)

 Method Overloading in Jav
Same method name
Different parameter list (number/type/order)
Happens within the same class

Compile-time polymorphism
 Cannot overload by return type only

 Method Overriding in Java
Child class provides its own implementation of parent method
Same method signature
Runtime polymorphism
Requires inheritance
Rules:
Cannot reduce access level
Final and static methods cannot be overridden

 Covariant Return Type in Java
Overridden method can return a subclass type
Introduced in Java 5
Improves type safety
Eliminates type casting
Only for non-primitive return types

 super Keyword in Java
Used to:
Access parent class variables
Call parent class methods
Invoke parent class constructor

Must be first statement in constructor when calling super()

 Instance Initializer Block (IIB) in Java
Block of code executed before constructor
Runs every time an object is created
Used for common initialization logic

Execution order:
Instance variables
Instance initializer block
Constructor

 final Keyword in Java

Used with:
final variable → value cannot change
final method → cannot be overridden
final class → cannot be inherited

Example:
String class is final
__________________________________________________________________________________
Day 8:
Understood. Below are clean, concise notes without emojis and without code.

Interface Default Methods (Java 8)
Definition:
Default methods are methods inside an interface that have a body. They were introduced in Java 8 using the default keyword.

Purpose:
To allow interfaces to evolve without breaking existing implementations.
To provide backward compatibility when adding new methods to an interface.
To support enhancements in collections and Stream API in Java 8.

Key Characteristics:
Defined inside an interface with implementation.
Implementing classes may override them.
Cannot override methods of the Object class (such as toString, equals, hashCode).
Can be invoked using InterfaceName.super.methodName() inside the implementing class.

Method Resolution Rules:
Class methods take highest priority.
If multiple interfaces provide the same default method, the class must override it.
If a class inherits a method from a superclass and a default method from an interface, the superclass method is chosen.

Functional Interfaces
Definition:
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

Reason:
To avoid ambiguity and complexity, especially the Diamond Problem.

Diamond Problem:
Occurs when two interfaces provide a default method with the same signature and a class implements both interfaces. The compiler cannot decide which method to inherit.

Resolution:
The implementing class must override the conflicting method.
Inside the override, it can explicitly call a specific interface’s default method.

No Conflict Situations:
If two interfaces declare the same abstract method, there is no issue. The implementing class provides one implementation.
If a superclass and an interface both provide the same method, the superclass method is chosen automatically.

Priority Order:
Methods from the class hierarchy.
More specific interface methods.
Explicit override required when ambiguity exists.
