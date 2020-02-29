# String in Java

String is constant.
Their values cannot be changed after they are created.
If string was changed, discard the existing object and create a new object in memory. Existing objects are remove by GC(Garbage Collection).

## StringBuffer, StringBuilder

StringBuffer and StringBuilder recycles existing objects in memory when data is changed.

```java
public class MainClass {
  public static void main(String[] args) {
    // String
    String str = new String("Java");
    System.out.println("str : " + str);
    str = str + " Hello";
    System.out.println("str : " + str);

    // StringBuffer
    StringBuffer sf = new StringBuffer("Java");
    System.out.println("sf : " + sf);
    
    // append
    sf.append(" Hello");
    System.out.println("sf : " + sf);
    System.out.println("sf's length : " + sf.length());
    
    // insert
    sf.insert(sf.length(), "!!!")
    System.out.println("sf : " + sf);

    // delete
    sf.delete(4, 8);
    System.out.println("sf : " + sf);

    // StringBuilder
    StringBuilder sb = new StringBuilder("Java");
  }
}
```

## StringBuffer vs StringBuilder :memo:

StringBuffer is synchronized, StringBuilder is not.

