# Private, Setter and Getter

Access Modifier is a keyword controls and restricts the access of variable. private access specifier restricts the access of varialbe to the class itself.

In java, getter and setter are two conventional methods that are used for retrieving and updating value of a variable.

## Using private access modifier, getter and setter

```java
public class Student {
  private String name;
  private int score;

  public Student(String n, int s) {
    this.name = n;
    this.score = s;
  }

  public void getInfo() {
    System.out.println(" --- getInfo() --- ");
    System.out.println(" name : " + name);
    System.out.println(" score : " + score);
  }

  // getName getter return String value
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // getScore getter return int value
  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
```

## Why using getter and setter? :memo:

By using getter and setter, programmer can control variables in correct way. Following code only receives the value of `score` is more than 50.

```java
public void setScore(int score) {
  if (score > 50) {
    this.score = score;
  }
}
```