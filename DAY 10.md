1. What is Enum?
Enum (Enumeration) is a special data type in Java used to define a fixed set of named constants. It improves readability, maintainability, and type safety. It is mainly used when a variable can have only limited possible values like days, directions, or status.

2. Why Use Enum?
Provides meaningful names instead of numbers. Prevents invalid values from being assigned. Makes code more structured and clean. Improves compile-time safety.

3. Declaration of Enum
Enum can be declared outside a class. Enum can also be declared inside a class. Enum cannot be declared inside a method.

4. Internal Working of Enum
Enum is internally treated as a class. Each enum constant is an object of that enum type. Enum constants are implicitly public, static, and final.

5. Enum Properties
Enums cannot extend other classes because they already extend java.lang.Enum. Enums can implement interfaces. Enums support switch statements. Each constant is created only once.

6. Enum in Switch Statement
Enums can be directly used inside switch cases. Switch compares the enum constant value. It improves readability compared to integer-based switches.

7. Enum with Constructor
Enums can have constructors. Constructor is called once for each constant. Enum constructors are always private (implicitly or explicitly). Used to initialize constant-specific data.

8. Enum with Methods
Enums can contain methods like normal classes. Methods can be common for all constants. Constants can override methods individually.

9. Enum with Abstract Methods
Enum can declare abstract methods. Each constant must provide its own implementation. Used when each constant has different behavior.

10. Iterating Enums
values() method returns all enum constants in array form. Used to loop through all constants.

11. EnumSet
EnumSet is a specialized Set implementation for enums. It is efficient and faster than HashSet for enum types. Supports range-based selection of constants.

12. Enum as Class Member
Enum can be used as a variable inside a regular class. A regular class object can receive an enum value through constructor or method and perform actions based on it.
