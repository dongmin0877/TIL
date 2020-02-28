# Lambda in Java

Lambda expressions express instance of `functional` interfaces.
Lambda expressions implement the only abstract function and therefore implement functional interface.

```java
public interface LambdaInterface {
  public void method(String s1, String s2, String s3);
}
```

## Using lambda :memo:

Following code shows how to use lambda.

```java
public class MainClass {
  public static void main(String[] args) {
    LambdaInterface lambdaInterface = (String s1, String s2, String s3) -> { System.out.println(s1 + " " + s2 + " " + s3); };
    lambdaInterface.method("Hello", "Java", "World");
  }
}
```

1. Type can be omitted when there is one parameter or the same type.

```java
LambdaInterface lambdaInterface = (s1) -> { System.out.println(s1); };
lambdaInterface.method("Hello");
```

2. `{}` can be omitted when there is one implementation.

```java
LambdaInterface lambdaInterface = (s1) -> System.out.println(s1);
lambdaInterface.method("Hello");
```

3. `()` and `{}` can be omitted when there is one parameter and implementation.

```java
LambdaInterface lambdaInterface = s1 -> System.out.println(s1);
lambdaInterface.method("Hello");
```

4. If there are no parameters, create only `()`.

```java
LambdaInterface lambdaInterface = () -> System.out.println("No parameter");
lambdaInterface.method();
```

5. If there is a return value.

```java
LambdaInterface lambdaInterface = (x, y) -> {
  int result = x + y;
  return result;
};
```