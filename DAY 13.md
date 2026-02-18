Try-with-resources:
Introduced in Java 7, it is used to automatically close resources such as FileReader, BufferedReader, Scanner, Connection, etc. 
It works with classes that implement the AutoCloseable interface. The resources are declared inside the parentheses of the try statement. 
When the try block finishes (whether normally or due to an exception), the resources are closed automatically. 
It helps prevent memory leaks and reduces the need for finally blocks.

Multi-catch:
Also introduced in Java 7, multi-catch allows handling multiple exception types in a single catch block. 
This reduces duplicate code when different exceptions require the same handling logic.
The exception types are separated using the | operator.
The exception variable in multi-catch is implicitly final.

Stack Traces:
A stack trace is a detailed report of the method calls that were active when an exception occurred.
It shows the exception type, message, and the sequence of method calls (call stack) from where the exception started to where it was handled.
The printStackTrace() method is used to display it.
Stack traces are mainly used for debugging.

Checked vs Unchecked Exceptions:
Checked exceptions are checked at compile time.
The compiler forces you to either handle them using try-catch or declare them using the throws keyword.
Examples include IOException and SQLException. 
These usually represent recoverable conditions.

Unchecked exceptions occur at runtime and are subclasses of RuntimeException. 
The compiler does not require them to be handled.
Examples include NullPointerException and ArithmeticException.
These usually represent programming errors.
