What is ArrayList
Dynamic array implementation of List
Maintains insertion order
Allows duplicates
Allows multiple null values
Not synchronized

Internal Structure
Backed by Object[] elementData
Default capacity = 10
Grows automatically when full
New capacity ≈ oldCapacity + (oldCapacity / 2)
Uses index-based access

Time Complexity
add(E e) → O(1) average, O(n) worst (resizing)
add(index, e) → O(n)
get(index) → O(1)
set(index, e) → O(1)
remove(index) → O(n)
remove(object) → O(n)
contains() → O(n)
size() → O(1)
isEmpty() → O(1)
clear() → O(n)

Why get() is O(1)
Direct array access using index
No traversal needed

When to Use
Frequent read operations
Need fast random access
Few insertions/deletions in middle

LINKEDLIST NOTES
What is LinkedList
Doubly linked list implementation of List
Each node stores data, next reference, previous reference

Structure
null ← A ⇄ B ⇄ C → null

Time Complexity
add(E e) → O(1)
addFirst() → O(1)
addLast() → O(1)
get(index) → O(n)
set(index, e) → O(n)
remove(index) → O(n)
removeFirst() → O(1)
removeLast() → O(1)
contains() → O(n)

Why get() is O(n)
Requires traversal from head or tail

When to Use
Frequent insertion/deletion at beginning
Queue or Deque implementation
Not good for heavy random access

ARRAYLIST VS LINKEDLIST
Structure
ArrayList → Dynamic array
LinkedList → Doubly linked list
Random Access
ArrayList → O(1)
LinkedList → O(n)

Insert at Beginning
ArrayList → O(n)
LinkedList → O(1)

Memory
ArrayList → Less
LinkedList → More (extra pointers)

Cache Performance
ArrayList → Better
LinkedList → Lower

HASHMAP NOTES
What is HashMap
Stores key-value pairs
No duplicate keys
Allows one null key
Not ordered
Not synchronized

Internal Structure
Array of buckets
Each bucket stores key, value, hash, next reference

How put() Works
Call hashCode() on key
Convert hash to index using (n - 1) & hash
Insert into bucket
Handle collision if needed

Collision Handling
Uses Separate Chaining
Stored as LinkedList in bucket
If bucket size > 8 (Java 8+) → converted to Red-Black Tree
Resize Rule
Default capacity = 16
Load factor = 0.75
Resize when size > capacity × loadFactor
After resize, capacity doubles

Time Complexity
put() → O(1) average, O(n) worst
get() → O(1) average, O(n) worst
remove() → O(1) average, O(n) worst

Important Rule
If using custom objects as keys, override hashCode() and equals()

Otherwise:
Retrieval may fail.
Logical duplicate keys may exist.
