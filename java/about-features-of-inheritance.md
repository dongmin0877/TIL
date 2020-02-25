# Features of Inheritance

Check what is inheritance
[About Inheritance](/java/about-inheritance.md)

## Method override

```java
public class ParentClass {
  public void makeIce() {
    System.out.println(" --- makeIce() --- ");
  }
}
```

Declaring a method in Child Class which is already in Parent Class is `method overriding`. Following code is example about method overriding.

```java
public class ChildClass extends ParentClass {
  @Override
  public void makeIce() {
    System.out.println(" --- overridden method about makeIce() --- ");
  }
}
```

## Type of class

Like primitive type, class is also type.

```java
public class FirstChildClass extends ParentClass {
  @Override
  public void makeIce() {
    System.out.println(" --- FirstChildClass makeIce() --- ");
  }
}
```

```java
public class SecondChildClass extends ParentClass {
  @Override
  public void makeIce() {
    System.out.println(" --- SecondChildClass makeIce() --- ");
  }
}
```

```java
public class MainClass {
  public static void main(String[] args) {
    ParentClass childs[] = new ParentClass[2];
    childs[0] = new FirstChildClass();
    childs[1] = new SecondChildClass();

    for (int i = 0; i < childs.length; i++) {
      childs[i].makeIce();
    }
  }
}
// Result
//  --- FirstChildClass makeIce() --- 
//  --- SecondChildClass makeIce() --- 
```

## Object Class :memo:

Object Class is the root of the class hierarchy. Every class has `Object` as a superclass.

## Super Class :memo:

`super` is a keyword to call a method defined in Parent Class.

```java
public class ParentClass {
  int openYear = 2000;

  public void makeIce() {
    System.out.println(" --- makeIce() --- ");
  }
}
```
Following code invokes parent's openYear.

```java
public class ChildClass extends ParentClass {
  int openYear = 2020;

  @Override
  public void makeIce() {
    System.out.println(" --- overridden method about makeIce() --- ");
  }

  public void getOpenYear() {
    System.out.println("ChildClass's open year : " + this.openYear);
    System.out.println("ParentClass's open year : " + super.openYear);
  }
}

```
