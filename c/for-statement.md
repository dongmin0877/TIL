# For statement in C

```c
#include <stdio.h>

main()
{
  int fahr;

  for (fahr = 0; fahr <= 300; fahr = fahr + 20)
    printf("%3d %6.1f\n", fahr, (5.0/9.0)*(fahr-32));
}
```

The for statement is a loop, a generalization of the `while`. For statement more clear than while loop. The first part, the initialization. `fahr = 0`. The second part is the test or condition that controls the loop. `fahr <= 300`. This condition is evaluated. Then last one `fahr = fahr + 20` is increment step. The loop is terminated if the condition has become false.
