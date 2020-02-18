# Object and Memory

All object are dynamically allocated on Heap.

If there is no need to retain object, GC (Gabage Collector) removes objects. :sponge:

## Reference :memo:

If you assign object to variable, variable is assigned a reference, not object.

Therefore reference is an address indicates where object are stored.


```java
public class ObjectClass {
	
}

...

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println("obj 1 = " + obj1);
		System.out.println("obj 2 = " + obj2);
		System.out.println("obj 3 = " + obj3);
	}
}

// Result
// obj 1 = projectTest3.ObjectClass@448139f0
// obj 2 = projectTest3.ObjectClass@7cca494b
// obj 3 = projectTest3.ObjectClass@7ba4f24f
```

## null and NullPointerException :exclamation:

If you assign null to variable, variable no longer access to reference.

```java
obj1 = null

obj1.getInfo();

// Result
// NullPointerException
```