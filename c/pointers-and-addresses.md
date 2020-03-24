# Pointers and Addresses

A `pointer` is a variable that contains the address of variable.

![Pointer](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Pointers.svg/220px-Pointers.svg.png)

This picture simplifies how memory is organized. A `pointer` is a group that holds an address.

The `& operator` is the address of an object.

```c
p = &c;
```

This assigns the address of `c` to the variable `p`.

The `* operator` is the dereferencing operator. It accesses the object which the pointer points to. So, the declaration of the pointer ip is `int *ip;`.

```c
int x = 1, y = 2, z[10];
// ip is a pointer to int
int *ip;

// ip now points to x
ip = &x;
// y is now 1
y = &ip;
// x is now 0
*ip = 0;
// ip now points to z[0]
ip = &z[0]
```

There are a lot of way to declare a pointer. :memo:

```c
int* ip;
int * ip;
int *ip;
```

Following code increments *ip by 5.

```c
*ip = *ip + 5;
```