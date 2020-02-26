# Inner and Anonymous Class

## Inner Class

In java, class can have another class as its member. If the class is a member of other class, the inner class can be also made private or protected.

```java
public static void main(String[] args) {
  OuterClass oc = new OuterClass();
  System.out.println("oc.num : " + oc.num);
  System.out.println("oc.str1 : " + oc.str1);

  OuterClass.InnerClass in = oc.new InnerClass();
  System.out.println("in.num : " + in.num);
  System.out.println("in.str2 : " + in.str2);

  OuterClass.SInnerClass si = new OuterClass.SInnerClass();
  System.out.println("si.num : " + si.num);
  System.out.println("si.str3 : " + si.str3);
}
```

Following code shows how to write a inner class.

```java
public class OuterClass {
  int num = 10;
  String str1 = "java";
  static String world = "world";
  
  public OuterClass {
    System.out.println("OuterClass constructor");
  }

  class InnerClass {
    int num = 100;
    String str2 = str1;
    
    public InnerClass() {
      System.out.println("InnerClass constructor");
    }
  }

  static class SInnerClass {
    int num = 1000;
    String str3 = world;

    public SInnerClass() {
      System.out.println("static InnerClass constructor");
    }
  }
}
```

## Anonymous Class :memo:

Anonymous class enables to declare and instantiate a class at the same time, therefore it makes code more concise.

```java
public class AnonymousClass {
  public AnonymousClass() {
    System.out.println("AnonymousClass constructor");
  }

  public void method() {
    System.out.println(" --- AnonymousClass's method() --- ");
  }
}
```

```java
new AnonymousClass() {
  @Override
  public void method() {
    System.out.println(" --- AnonymousClass's Override method() --- ");
  };
}.method();
```
