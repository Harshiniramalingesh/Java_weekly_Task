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
