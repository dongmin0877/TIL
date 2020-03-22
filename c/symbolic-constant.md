# Symbolic constant

A `#define` line defines a `symbolic name` or `symbolic constant` to be a particular string of characters.

## `#define name replacement text`

any occurrence of name will be replaced by the corresponding replacement text.

```c
#include <stdio.h>

#define LOWER 0
#define UPPER 300
#define STEP 20

main()
{
  int fahr;

  for (fahr = LOWER; fahr <= UPPER; fahr = fahr + STEP)
    printf("%3d %6.1f\n", fahr, (5.0/9.0)*(fahr-32));
}
```
Symbolic constant names are conventionally written in `upper case`.


