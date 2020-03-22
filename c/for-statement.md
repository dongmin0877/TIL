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

The for statement is a loop, a generalization of the `while`. For statement more compact than while loop. The first part, `fahr = 0`, the initialization. The second part, `fahr <= 300`, is a condition that controls the loop. This condition is evaluated. Then, `fahr = fahr + 20` is increment step. The loop is terminated when the condition has become false.
