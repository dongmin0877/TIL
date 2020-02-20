# Constructor, Destructor and this keyword in Java

When object was created, constructor is called automatically. 

Destructor is used to remove memory allocated.

## Create Constructor

Default Constructor

```java
public class ObjectClass {
  public ObjectClass() {
    System.out.println(" --- ObjectClass() --- ");
  }
}
```

Custom Constructor

```java
// With parameters
public class ObjectClass {
  public ObjectClass(String n, int[] iArr) {
    System.out.println(" --- ObjectClass() --- ");
    System.out.println(" s : " + s);
    System.out.prinltn(" iArr : " + iArr);
  }
}
```

## finalize()

Finalizers get invoked when JVM figures out this instance should be garbage collected. The main purpose of finalizers is to release resources used by objects before they are removed from memory. Therefore Using finalizer can make you do more task than just returning memory.

```java
@Override
protected void finalize() throw Throwable {
  System.out.println(" --- finalize() method --- ");

  super.finalize();
}
```

But GC(Garbage Collection) doesn't operated immediately, So finalize method doesn't ensure to invoke `finalize()`.

## this Keyword :memo:

Within an instance method and constructor, `this` is a reference to the current object, so you can refer member variables of the current object by using `this` keyword.

```java
public class ObjectClass {
  // Member variable
  public int x = 0;
  public int y = 0;

  public ObjectClass() {
    System.out.println(" x : " + this.x);
    System.out.println(" y : " + this.y);
  }

  public ObjectClass(int a, int b) {
    this.x = a;
    this.y = b;
  }
}
```

