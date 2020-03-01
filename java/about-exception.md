# Exception in Java

Exception is an unexpected event.

## Error vs Exception

| Error | Exception |
| --- | --- |
| Can't dealt with | Can dealt with |

## Exceptions

1. Checked Exception: IO or Compile time exception
2. Unchecked Exception: Runtime or Null pointer exception

## try-catch-finally

```java
int i = 10;
int j = 0;
int r = 0;

System.out.println("Exception Before");

try {
  r = i / j;
} catch (Exception e) {
  e.printStackTrace();
  String msg = e.getMessage();
  System.out.println("Exception: " + msg);
} finally {
  System.out.println("Finally block is always implemented")
}

System.out.println("Exception After");
// Result
// Exception Before
// java.lang.ArithmeticException: / by zero
// Exception :/ by zero
// Finally block is always implemented
// Exception After
```

## throws

```java
public class MainClass {
  public static void main(String[] args) {
    MainClass mainClass = new MainClass();

    try {
      mainClass.firstMethod();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void firstMethod() throws Exception {
    secondMethod();
  }

  public void secondMethod() throws Exception {
    thirdMethod();
  }

  public void thridMethod() throws Exception {
    System.out.println(" 10 / 0 = " + ( 10 / 0 ));
  }
}
```