GENERICS IN JAVA

Definition
Generics allow classes, interfaces, and methods to work with different data types while providing type safety at compile time.

Purpose of Generics
To provide type safety
To eliminate type casting
To detect errors at compile time
To enable reusable and flexible code

Type Parameter
A type parameter is a placeholder for a type.
Commonly used names:

T – Type

E – Element

K – Key

V – Value

Advantages
Compile-time type checking
No ClassCastException at runtime (if used properly)
Code reusability
Improved readability

Important Concepts
Generic Classes
Generic Methods
Bounded Types
Type Erasure

Type Erasure
Generics work only at compile time.
At runtime, type information is removed and replaced with Object or the bounded type.

Invariance in Generics
In Java, generics are invariant.
List<Integer> is NOT a subtype of List<Number>.

WILDCARDS IN JAVA

Definition
Wildcards are used in generics to represent an unknown type.
The symbol used is ?

Why Wildcards Are Needed
Because generics are invariant, wildcards allow flexibility when working with inheritance.

Types of Wildcards

A. Unbounded Wildcard
Represents any type.
Used when the type does not matter.
You can read elements as Object but cannot add elements safely.

B. Upper Bounded Wildcard
Represents a specific type or its subclasses.
Used when you want to read values from a structure.
You can read but cannot add elements.

C. Lower Bounded Wildcard
Represents a specific type or its superclasses.
Used when you want to add values to a structure.
You can add elements but cannot safely read them as the specific type.

PECS Principle
Producer Extends Consumer Super

If a structure produces data (read), use extends.

If a structure consumes data (add), use super.

Key Differences

Generics
Used to define type-safe classes and methods.
Specify exact type.

Wildcards
Used for flexibility when passing generic types.
Represent unknown types.
