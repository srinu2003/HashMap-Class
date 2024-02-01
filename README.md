# Open Addressing Hash Table

This Java program implements an open addressing hash table using linear probing for collision resolution. The hash table is implemented in two versions: one for storing integers and the other for storing generic data types.

## Description

The Main.java file contains the implementation for storing integer values in the open addressing hash table. It includes the opAHash class, which provides methods for inserting, deleting, and searching for integer values in the hash table. The hash function is implemented using modular arithmetic.

## Usage

To use the opAHash class, create an instance of the class and perform insertions, deletions, and searches for integer values. For example:

```java
opAHash myMap = new opAHash(10);
myMap.insert(7);
myMap.insert(2);
myMap.insert(17);
myMap.insert(5);
System.out.println(myMap.search(7));
```
#### Output:
``````
7
myMap:[0, 0, 2, 0, 0, 5, 0, 7, 0, 0]
myMap:[0, 0, 1, 0, 0, 1, 0, 1, 0, 0]
myMap:[0, 0, 1, 0, 0, 1, 0, 1, -1, 0]
```
# Helpful file context for our conversation:

#### file_context_0

filename:src/main/java/Main.java

Feel free to customize the README.md according to your project's specific requirements.
