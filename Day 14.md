Day 14:
LAMBDA EXPRESSIONS (Java 8)

Definition
A lambda expression is a concise way to provide the implementation of a functional interface (an interface with exactly one abstract method).

Purpose
Lambdas enable functional programming in Java and reduce boilerplate code, especially when working with collections and streams.

Key Points
Works only with functional interfaces.
Replaces anonymous class implementations.
Has three parts: parameter list, arrow operator, and body.
Type inference is supported (no need to declare parameter types explicitly in most cases).
Improves readability and reduces verbosity.

Advantages
Less code compared to anonymous classes.
Cleaner and more expressive syntax.
Encourages functional-style programming.
Works seamlessly with Stream API.

Limitations
Can reduce readability if overused or made too complex.
Cannot access non-final local variables (must be effectively final).

Common Use Cases
Iterating collections
Sorting
Filtering
Event handling
Passing behavior as a parameter

STREAM API (Java 8)

Definition
A Stream is a sequence of elements that supports functional-style operations to process data declaratively.

Purpose
Streams simplify operations on collections such as filtering, mapping, sorting, grouping, and aggregation.

Key Characteristics
Does not store data; processes data from a source.
Does not modify the original collection.
Supports lazy evaluation (intermediate operations run only when a terminal operation is invoked).
Can be processed sequentially or in parallel.
Can be used only once (cannot reuse the same stream).

Types of Operations
Intermediate Operations
Return a Stream.
Lazy in nature.
Examples include filtering, mapping, sorting, distinct.

Terminal Operations
Produce a final result.
Trigger execution of the stream pipeline.
Examples include collect, count, reduce, forEach.

Advantages
Reduces boilerplate loops.
Improves readability.
Supports functional programming.
Easy parallel processing using parallel streams.
More expressive data transformation.

Internal Working 
Streams create a pipeline of operations.
The data flows through this pipeline, and operations are applied element by element.
Execution starts only when a terminal operation is called.
