
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
* What is LinkedList?
* Properties
* How to create
* Methods

Vector and Stack Class in Java
* Properties
* How to create
* Methods

Queue and Set Interface
* What is Queue interface?
* What is PriorityQueue Class?
* What is Deque Interface?
* What is ArrayDeque Class?
* What is Set Interface?
* What is HashSet Class?
* What is LinkedHashSet Class?
* What is TreeSet Class?


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

## ArrayList in Java

Properties

* Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized. it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.

How to create:

```bash
	Vector<String> v = new Vector<String>();
```
Methods
* addElement(Object element)
* int capacity()
* int size()
* firstElement()
* lastElement()
* get(int index)

## Queue and Set Interface

What is Queue interface?

* Java Queue interface orders the element in FIFO(First In First Out) manner. In FIFO, first element is removed first and last element is removed at last.
* How to create the objects?

```bash
	Queue<String> q1 = new PriorityQueue();
  	Queue<String> q2 = new ArrayDeque();
```

What is PriorityQueue class?

* Properties: It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.
* Methods: boolean add(object), boolean offer(object), boolean remove(object), Object poll(), Object element() , Object peek(), void clear(), int size()

What is DeQueue interface?

* Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the 

```bash
	Deque d = new ArrayDeque()
```

What is ArrayDeQueue class?

* ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
* ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

What is Set interface?

* Properties: Set Interface in Java is present in java.util package. It extends the Collection interface.It represents the unordered set of elements which doesn't allow us to store the duplicate items. 
* We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.

```bash
	Set<data-type> s1 = new HashSet<data-type>();  
	Set<data-type> s2 = new LinkedHashSet<data-type>();  
	Set<data-type> s3 = new TreeSet<data-type>(); 
```
What is LinkedHashSet Class?

* Properties: This class implements the Set interface.
* LinkedHashSet maintains insertion order,
* LinkedHashSet doesn’t allow duplicates
* LinkedHashSet allows null values however if you insert more than one nulls it would still return only one null value.
* LinkedHashSet is non-synchronized.

```bash
	LinkedHashSet<String> set=new LinkedHashSet<String>(); 
```
* Methods: boolean add(E e) , void clear(), Object clone(), boolean contains(Object o), boolean isEmpty(), int size(), boolean remove(Object o), removeAll().

What is LinkedHashSet Class?

* Properties: This class implements the SortedSet interface.
* The access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.
* TreeSet doesn’t allow duplicates
* TreeSet doesn’t allows null values 
* TreeSet is non-synchronized.

```bash
	TreeSet<String> tset = new TreeSet<String>();
```

* Methods: boolean add(E e) , void clear(), Object clone(), boolean contains(Object o), boolean isEmpty(), int size(), boolean remove(Object o), Object first(), Object last(). 
