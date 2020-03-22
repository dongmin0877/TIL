# Input and Output

```c
#include <stdio.h>

main()
{
  int c;

  c = getchar();
  while(c != EOF) {
    putchar(c);
    c = getchar();
  }
}
```

This example is a program that copies its input to output one character at a time.

## getchar()

`getchar` reads the next input character from a text stream and returns that as its value.

## putchar()

`putchar` prints a character each time it is called.


## EOF

`EOF` is  `"end of file"`. EOF is an integer defined in <stdio.h>.

In order to emulate `EOF` press `Ctrl + D`.

---

Another way to read characters.

```c
#include <stdio.h>

main()
{
  int c;

  while((c = getchar()) != EOF)
    putchar(c);

}
```

The `while` gets a character, assigns it to c, and then tests whether the character was the EOF signal.
