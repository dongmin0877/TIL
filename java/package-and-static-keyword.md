# Package and Static keyword

:package: Package is a namespace organizes a set of related classes and interfaces. 


## Package's naming rule :memo:

1. Package name should to be unique.
2. Package name usually be set by using reversed name of domain.
```java
package com.java.classname;

public class TestClass {
  ...
}
// Import class rule
import com.java.classname.TestClass;
```
3. Package name can be changed during developing.
4. Package name should be created to let you can predict what functions are classes in package having.


## Static keyword :memo:

When a variable is declared as a static, it can be accessed by any objects. 

Static variables are global variables. All instances share the same static variable.

```java
public class Bank {
  String name;
  static int amount = 0;

  public Bank(String name) {
    this.name = name;
  }

  public void saveMoney(int money) {
    amount += money;
    System.out.println(" Amount of account : " + amount );
  }

  public void spendMoney(int money) {
    amount -= money;
    System.out.println(" Amount of account : " + amount );
  }
}
```
