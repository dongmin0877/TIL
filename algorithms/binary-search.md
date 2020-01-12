# Binary Search

Binary search is a search algorithm that finds the position of a target value within sorted array. Binary search compares target value to middle element of the array. If they are not equal, the half is eliminated and the search continues.

![Binary Search](https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Binary_Search_Depiction.svg/1920px-Binary_Search_Depiction.svg.png)

```java
import java.util.Arrays;

public class BinarySearch {
  public static int rank(int key, int[] a ) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if (key > a[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      };
    return -1;
    }
  }

  public static void main(String[] args) {
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();

    Arrays.sort(whitelist);

    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (rank(key, whitelist) == -1) {
        StdOut.println(key);
      }
    }
  }
}
```


---
- [Algorithms forth edition](https://algs4.cs.princeton.edu/home/)