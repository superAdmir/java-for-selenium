
## Java Collection Framework

## Agenda

Introduction to Collection Framework in Java
* Interfaces
* Classes
* Collection interface

ArrayList in Java
* List Interface
* ArrayList class in Java
* Collection interface

LinkedList in Java
* What is LinkedList
* Properties
* How to create
* Methods


## Introduction to Collection Framework in Java

What is a Java Collection?

* A Collection is a group of individual objects represented as a single unit
* Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion
* The Java Collections Framework is a collection of interfaces and classes which helps in storing and processing the data efficiently

Interfaces
* List
* Set
* Map
* Queue
* Deque
* SortedSet

Classes
* ArrayList 
* LinkedList
* Vector 
* Stack 
* PriorityQueue 
* HashSet 
* LinkedHashSet 
* TreeSet 
* HashMap 
* LinkedHashMap 
* TreeMap
* HashTable

Collection Interface:
* Root interface with basic methods like add(), remove(), contains(), isEmpty(), addAll(), clear().. etc.
* All other collection interfaces and classes (except Map) either extend or implement this interface. For example, List (indexed, ordered) and Set (sorted) interfaces implement this collection.

## ArrayList in Java

List interface
* Can contain duplicates and elements are ordered.
* List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
* Lists represents an ordered collection of elements. Using lists, we can access elements by their integer index (position in the list), and search for elements in the list. index start with 0, just like an array.

ArrayList Class in Java
* Ordered – Elements in arraylist preserve their ordering which is by default the order in which they were added to the list.
* Index based – Elements can be randomly accessed using index positions. Index start with '0'.
* Dynamic resizing
* Non synchronized
* Duplicates allowed – We can add duplicate elements in arraylist. It is not possible in sets.

How to create:

```bash
  ArrayList<String> alist = new ArrayList<String>();
```
Methods 
* add()
* set(int index, Object o) 
* remove(index or value) 
* get(int index) 
* indexOf(Object o) 
* int size() 
* boolean 
* contains(Object o) 
* clear()

## LinkedList in Java

What is LinkedList in Java?

* Java LinkedList class is doubly-linked list implementation of the List and Deque interfaces.

Properties
* Permits all elements including duplicates and NULL
* LinkedList maintains the insertion order of the elements
* It is not synchronized
* The manipulation is fast because no shifting is required

How to create:

```bash
  LinkedList<String> linkedList = new LinkedList<>();
```
Methods
* boolean add(Object item) 
* void add(int index, Object item) 
* boolean addAll(Collection c) 
* void addFirst(Object item) 
* void addLast(Object item) 
* void clear(), Object clone() 
* Object getFirst() 
* Object getLast() 
* Object poll() 
