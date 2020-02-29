# Collection in Java

The collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
Java Collection framwork provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).


![Collections in Java](https://static.javatpoint.com/images/java-collection-hierarchy.png)

## ArrayList

1. ArrayList can contain duplicated elements.
2. ArrayList maintains inserted order.


```java
ArrayList<String> list = new ArrayList<String>();
list.add("A");
list.add("B");

System.out.println(list);
// Result
// [A, B]
```

## HashMap

1. HashMap contains values based on key.
2. HashMap contains only unique keys.

```java
import java.util.HashMap;

...
String str = new String();
HashMap<Integer, String> map = new HashMap<Integer, String>();

map.put(5, "Hello");
map.put(6, "Java");
map.put(7, "World");

str = map.get(5);
// Result
// Hello
```
