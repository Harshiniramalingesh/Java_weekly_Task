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

Instance Variable
Like a personal notebook
Each person has their own copy.
