# Euclidean Algorithm

Euclidean algorithm is an method for getting the greatest common divisor (GCD) of two numbers, the largest number that can divide both of them without remainder.

![Eculd's Algorithm](https://upload.wikimedia.org/wikipedia/commons/3/37/Euclid%27s_algorithm_Book_VII_Proposition_2_3.png)
```java
public static int gcd(int p, int q) {
  if (q == 0) return p;
  int r = p % q;
  return gcd(q, r);
}
```

---
- [Algorithms forth edition](https://algs4.cs.princeton.edu/home/)