# Pointers and Function Arguments

```c
void swap(int x, int y)
{
    int temp;

    temp = x;
    x = y;
    y = temp;
}
```

This code shows how to swap x and y. But this code is wrong. Because of `call by value`, swap can't affect the arguments a and b. The function above only swaps `copy`. So if you want to swap arguments, you have to use pointer.

```c
void swap(int *px, int *py)
{
    int temp;

    temp = *px;
    *px = *py;
    *py = temp;
}
```

This code swaps address of x and y.
