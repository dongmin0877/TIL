# Class in Java

Java is an Object-Oriented Language.

## Objects in Java

We can easily imagin object. Object is a anything is in real-world like a dog, cat, car and so on. So in java, we think a object as things we can imagine. And you can make object using class.

## Class in Java

A class is a blueprint from which individual objects are created.

Follwing is a example of class.

```java
// Class
public class Car {

// Member variable
  public String color;
  public String gear;
  public int price;

// Constructor
  public Car() {
    System.out.println("Car constructor");
  }

// Method
  public void run() {
    System.out.println(" -- run -- ");
  }

// Method
  public void stop() {
    System.out.println(" -- stop --");
  }
  
// Method
  public void info() {
		System.out.println(" --- info --- ");
		System.out.println(" color : " + color);
		System.out.println(" gear : " + gear);
		System.out.println(" price : " + price);
	}
}
```

## Constructor vs Method :memo:

Constructor is called to initialize object. And constructor has following rules.

1. Constructor's name should be same with class name.
2. Constructor doesn't have return type.

Method is uesd to show object's any behavior. And Method has following rules.

1. Method can be named same or not with class name.
2. Method should have return type. (If method doesn't have any return value, we should use void.)

## Creating object and using

```java
Car myCar = new Car();
myCar.color = "red";
myCar.gear = "auto";
myCar.price = 2000;

myCar.run();
myCar.stop();
myCar.info();
```

## class overloading :memo:

If constructor or method receive different parameters (number of parameters), you can use overloading. 

```java
public class Bicycle {
  // Declare member variable
  public String color;
  public int price;

  // Constructor
  public Bicycle() {
    System.out.println("Bicycle constructor");
  }

  // Constructor Overloading
  public Bicycle(String color, int price) {
    System.out.println("Bicycle constructor overloading");
    // use arguments
    this.color = color
    // this.color is member variable, and color is argument
    this.price = price
    // this.price is member variable, and price is argument
  }
}
```