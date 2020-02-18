# Method in Java

A method is a code runs when it is called.

## Create Method

Method must be declared in class.

```java
public class MyClass {
  public void getInfo() {
    System.out.println(" --- Info --- ");
  }
}
```

1. `MyClass` is a class.
2. `getInfo()` is a method.
3. `public` is a access modifier. (private, default, protected, public)
4. `void` is a return value.

## Call Method

```java
MyClass info = new MyClass();
info.getInfo();
```

## Parameter

You can set info by using parameter.

```java
public class MyClass {
  public String name;
  public String gender;
  public int age;

  public void setInfo(String n, String g, int a) {
    name = n;
    gender = g;
    age = a;
  }

  public void getInfo() {
    System.out.println(" --- Info --- ");
  }
}
```

## Method overloading

Method overloading is making a method having same mehtod name, but having different types and parameters.

```java
public void getInfo() {
  ...
}

public void getInfo(int x, int y) {
  ...
}

public void getInfo(String s1, String s2) {
  ...
}
```

## Access Modifier

Access modifier specifies the accessibility.

| Access Modifier | within class | within package | outside package by subclass only | outside package |
| --- | --- | --- | --- | --- |
| public | o | o | o | o |
| protected | o | o | o | x |
| default | o | o | x | x |
| private | o | x | x | x |
