# About abstract class

Abstract class is a class that is declared `abstract`.
Abstraction can be achieved with either abstract classes or intefaces. 

## How to use abstract class

Same as class inheritance, using `extends keyword` to implement abstract class.

```java
public abstract class AbstractClass {
  int num;
  String str;

  public AbstractClass() {
    System.out.println(" --- AbstractClass Constructor --- ");
  }

  public AbstractClass(int i, String s) {
    System.out.println(" --- Overloaded AbstractClass Constructor --- ");

    this.num = i;
    this.str = s;
  }

  public void function1() {
    System.out.println(" --- function1 --- ");
  }

  public abstract void function2();
}
```

Following code shows how to use abstract class.

```java
public class ClassEx extends AbstractClass {
  public ClassEx() {
    System.out.println(" --- ClassEx Constructor --- ");
  }

  public ClassEx(int i, String s) {
    super(i, s);
  }

  @Override
  public void function2() {
    System.out.println(" --- function2 --- ");
  }
}
```

```java
AbstractClass ex = new ClassEx(10, "java");
ex.function1();
ex.function2();
// Result
//  --- Overloaded AbstractClass Constructor --- 
//  --- function1 --- 
//  --- function2 --- 
```

## [Abstract class vs Interface](https://www.javatpoint.com/difference-between-abstract-class-and-interface)

| Abstract Class | Interface |
| --- | --- |
| Have abstract and non-abstract methods | Only abstract methods |
| Doesn't support multiple inheritance | Supporting multiple inheritance |
| Can have final, non-final, static and non-static variables | Only static and final variables |
| Can provide the implementation of interface | Can't provide the implementation of abstract class |
| Abstract keyword is used to declare | Interface keyword is used to declare |
| Can extend another java class and implement multiple java interfaces | Can extend another java interface only |
| Can be extended using keyword `extends` | Can be implemented using keyword `implements` |
| Can have class members like private, protected, etc. | Members of a Java interface are public by default |
