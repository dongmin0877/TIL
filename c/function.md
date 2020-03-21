# Function in C

A function provides a convenient way to encapsulate some computation, which can be used without worrying about its implementation.

```c
#include <stdio.h>
// declaration
int power(int m, int n);

main()
{
    int i;

    for (i = 0; i < 10; ++i)
        printf("%d %d %d\n", i, power(2, i), power(-3, i));
    return 0;
}

// definition
int power(int base, int n)
{
    int i, p;

    p = 1;
    for (i = 1; i <= n; ++i)
        p = p * base;
    return p;
}
```

A function definition has this form:

```c
return-type function-name(parameter declarations, if any)
{
    declarations
    statements
}
```