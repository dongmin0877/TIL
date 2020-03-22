# Array

There are twelve categories of input, so it is convenient to use an `array` to treat a lot of types.

```c
#include <stdio.h>

main()
{
    int c, i, nwhite, nother;
    int ndigit[10];

    nwhite = nother = 0;
    for (i = 0; i < 10; ++i)
        ndigit[i] = 0;
    
    while ((c = getchar()) != EOF)
        if (c >= '0' && c <= '9')
            ++ndigit[c - '0'];
        else if (c == ' ' || c == '\n' || c == '\t')
            ++nwhite;
        else
            ++nother;

    printf("digits =");
    
    for (i = 0; i < 10; ++i)
        printf(" %d", ndigit[i]);
    
    printf(", white space = %d, other = %d\n", nwhite, nother);
}
```

## Declaration

```c
int ndigit[10];
```

It declares an array of 10 integers. Array's index always start at `0` in C, so the elements are ndigit[0], ndigit[1], ndigit[2] ..., ndigit[9].

```c
for (i = 0; i < 10; ++i)
    ndigit[i] = 0;
```

This `for loops` initialize the array.

