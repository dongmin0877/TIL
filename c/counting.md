# Counting


## Character Counting

```c
#include <stdio.h>

main()
{
  long char_n;

  char_n = 0;
  while (getchar() != EOF)
    ++char_n;
  printf("%ld\n", char_n);
}
```

Press `Ctrl + D` you can check char_n.

The statement `++char_n` presents `++ operator`, which means increment by one. It could be replaced `char_n = char_n + 1`, but ++char_n is more compact and efficient. There is also a `-- operator` to decrement by one.


## Line Counting

```c
#include <stdio.h>

main()
{
  int c, line_n;

  line_n = 0;
  while ((c = getchar()) != EOF)
    if (c == '\n')
      ++line_n;
  printf("%d\n", line_n);
}
```

A character written between `single quotes` represents an integer value of the character in the machine's character set. So, `'\n'` is a character constant.
