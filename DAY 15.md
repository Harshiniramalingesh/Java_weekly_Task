NIO.2 (New I/O – Java 7)

NIO.2 was introduced in Java SE 7. 
It provides an improved and modern API for file and filesystem operations through the java.nio.file package.

Main Purpose:
To provide better file handling, improved scalability, and more flexible file system operations compared to the old java.io.File API.

Core Components:

Path
Represents the location of a file or directory in the file system. 
It replaces many uses of the old File class for path handling.

Paths
Utility class used to create Path objects.

Files
Utility class that contains static methods to perform operations on files and directories such as:
Creating files and directories
Deleting files
Checking existence
Reading and writing files
Getting file size
Listing directory contents
Walking a directory tree recursively

Important Features:
Better exception handling
Stream integration
Recursive directory traversal
Support for symbolic links
More scalable for large file systems

Serializable (Object Serialization)
Serialization is the process of converting an object into a byte stream so that it can be stored in a file or transmitted over a network. Deserialization is the reverse process, where the byte stream is converted back into an object.

Purpose:
Save object state to a file
Resume applications (like game state)
Send objects across networks

Serializable Interface:
It is a marker interface in java.io.
It does not contain methods. By implementing it, a class tells the JVM that its objects can be serialized.

Important Concepts:

serialVersionUID
A unique version identifier for a serializable class. It ensures compatibility during deserialization. If the class structure changes and the UID does not match, deserialization fails.

transient
Fields marked as transient are not serialized. 
They are skipped during the serialization process. 
This is useful for sensitive data or fields that can be recreated later.

Common Exceptions:
NotSerializableException
InvalidClassException
ClassNotFoundException

IO Streams (java.io)
A stream represents a flow of data between a source and a destination.

There are two main types of streams:

Byte Streams
Used for handling binary data such as images, audio files, or serialized objects.
Base classes are InputStream and OutputStream.

Character Streams
Used for handling text data.
Base classes are Reader and Writer.

Buffered Streams:
Buffered streams improve performance by reducing the number of physical read and write operations.

Object Streams:
Used specifically for serialization and deserialization of objects.

Difference Between IO and NIO.2

IO:
Older API
Uses File class for file handling
More traditional stream-based approach
Limited filesystem features

NIO.2:
Introduced in Java 7
Uses Path and Files
Supports directory walking and advanced file operations
Better integration with streams
More scalable and flexible
