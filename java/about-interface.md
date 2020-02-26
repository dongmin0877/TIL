# Interface in Java

Interface is an abstract type in Java. Interface is declared using the `interface` keyword, and only contains method signature and constant declarations.

```java
public interface InterfaceA {
  public void functionA();
}
```

```java
public interface InterfaceB {
  public void functionB();
}
```

```java
public interface InterfaceC {
  public void functionC();
}
```


## Why using Interface? :memo:

One of the reasons using interface is multiple inheritance.
Following code shows how to get multiple interfaces.

```java
public class InterFaceClass implements InterfaceA, InterfaceB, InterfaceC {
  public InterFaceClass() {
    System.out.println(" --- InterFaceClass constructor --- ");
  }

  @Override
  public void functionA() {
    System.out.println(" --- Fuction A --- ");
  }

  @Override
  public void functionB() {
    System.out.println(" --- Fuction B --- ");
  }

  @Override
  public void functionC() {
    System.out.println(" --- Fuction C --- ");
  }
}
```

## Subinterface

Interface can extend several other interfaces.

```java
public interface MintChocolate extends Mint, Chocolate {
  // Interface body
}
```