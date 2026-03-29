Day 9:
“IS-A” Relationship (Inheritance)

Definition:
An “IS-A” relationship represents inheritance. One class is a specialized version of another class.

Meaning:
If class B is a type of class A, then B “is an” A.

Examples:

Dog is an Animal

Car is a Vehicle

Manager is an Employee

Purpose:
Inheritance is used to represent specialization and hierarchical relationships. The child class inherits properties and behaviors of the parent class.

Characteristics:

Establishes a parent-child relationship.

Supports method overriding (runtime polymorphism).

Promotes code reuse.

Creates tighter coupling between classes.

When to Use:

When there is a strong and natural relationship.

When the child truly behaves like the parent.

When you need polymorphism.

When Not to Use:

Only for code reuse without logical relationship.

When the relationship does not make sense conceptually.

Important Note:
Inheritance creates tight coupling. Changes in the parent can affect all child classes.

“HAS-A” Relationship (Composition)

Definition:
A “HAS-A” relationship represents composition. One class contains another class as a part of it.

Meaning:
If class A contains an object of class B, then A “has a” B.

Examples:

Car has an Engine

Computer has a Processor

House has a Room

Person has an Address

Purpose:
Composition models real-world part-of relationships.

Characteristics:

One class holds a reference to another class.

Provides flexibility.

Encourages loose coupling.

Components can be replaced easily.

Advantages:

More flexible than inheritance.

Easier to maintain.

Better design in most real-world systems.

Important Design Principle:
Prefer composition over inheritance when possible.

Difference Between IS-A and HAS-A

IS-A:

Represents inheritance.

Used for specialization.

Creates tight coupling.

Suitable for hierarchical relationships.

HAS-A:

Represents composition.

Used for ownership or part-of relationships.

Creates loose coupling.

More flexible and maintainable.

Dependency Injection (DI) Basics

Definition:
Dependency Injection is a design principle where a class receives its dependencies from outside rather than creating them internally.

What Is a Dependency?
If one class needs another class to function, that required class is called a dependency.

Problem Without DI:
If a class creates its own dependencies internally:

It becomes tightly coupled.

Hard to test.

Difficult to replace components.

With Dependency Injection:
Dependencies are provided from outside.
This makes the system:

Flexible

Loosely coupled

Easy to test

Easy to maintain

Types of Dependency Injection:

Constructor Injection
Dependencies are provided through the constructor.
Best for mandatory dependencies.
Ensures the object cannot exist without required components.

Setter (Method) Injection
Dependencies are provided using setter methods.
Useful for optional or changeable dependencies.

Field Injection
Dependencies are directly injected into fields.
Common in frameworks like Spring.

Why Dependency Injection Is Important

Reduces tight coupling.

Improves testability (mocking dependencies).

Increases flexibility.

Encourages clean architecture.

Widely used in enterprise applications and frameworks.
