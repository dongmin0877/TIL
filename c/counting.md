# Counting


## Character Counting

```c
#include <stdio.h>

main()
{
  long nc;

  nc = 0;
  while (getchar() != EOF)
    ++nc;
  printf("%ld\n", nc);
}
```

The statement `++nc` presents ++ operator, which means increment by one. It could be replaced nc = nc + 1, but ++nc is more concise and often more efficient. There is a corresponding operator -- to decrement by one.

## Line Counting

```c
#include <stdio.h>

main()
{
  int c, nl;

  nl = 0;
  while ((c = getchar()) != EOF)
    if (c == '\n')
      ++nl;
  printf("%d\n", nl);
}
```

A character written between single quotes represents an integer value equal to the numerical value of the character in the machine's character set. So, `'\n'` is a character constant.
