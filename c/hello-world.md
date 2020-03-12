# Hello World

```c
#include <stdio.h>

main()
{
  printf("hello, world\n");
}
```

On the UNIX system you must create the program as a `".c"`, such as `"hello.c"`, then compile it with the command.

```shell
cc hello.c
```

Compiler makes an executable file called a.out. If you run a.out by typing the command. It will print
`"hello, world"`

## #include <stdio.h>

It tells the compiler to include information about the standard input/output library.

## main()

It defines a function named `main` that receives no argument values.
statements of main are enclosed in `{}` braces.

## printf()

`main()` calls library function `printf` to print.
 `\n` represents the newline character.

Following code produces identical output.

```c
#include <stdio.h>

main()
{
  printf("hello, ");
  printf("world");
  printf("\n");
}
```

