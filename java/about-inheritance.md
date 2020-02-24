# Inheritance in Java

Inheritance is an important thing in OOP (Object Oriented Programming).

Inheritance is a mechanism in which one object acquires all the properties and functions of a parent object.

## Why using inheritance? :memo:

1. For methods overriding
2. For code reusability


## About terms of inheritance

- [Class](java/about-class.md): group of objects

- Sub Class / Child Class: Subclass is a class that inherits the other class.

- Super Class / Parent Class: Superclass is the class from where subclass inherits the features.

- Reusability: Allowing you to reuse the reliable class.


## How to inherit super class's feature

Following code is about `Parent Class`.
```java
public class ParentClass {
  public ParentClass() {
    System.out.println("ParentClass Constructor");
  }

  public void parentFunction() {
    System.out.println(" --- parentFunction() --- ");
  }

  private void privateFunction() {
    System.out.println(" --- privateFunction() --- ");
  }
}
```

Following code is about `Child Class`.
```java
public class ChildClass extends ParentClass {
  public ChildClass() {
    System.out.println("ChildClass constructor");
  }

  public void childFunction() {
    Sytem.out.println(" --- childFunction() --- ");
  }
}
```

We can use both function of child and parent.

```java
ChildClass child = new ChildClass();

child.parentFunction();
child.childFunction();
```

## Private access modifier of parent class :memo:

Child class can use all things of parent class except properties and methods of private access modifier.

```java
child.privateFunction();
// The method privateFunction() from the type ParentClass is not visible.
```