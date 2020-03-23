# Variables and Arithmetic Expressions

```c
#include <stdio.h>

/* print Fahrenheit-Celsius table
  for fahr = 0, 20, ..., 300 */

main()
{
  int fahr, celsius;
  int lower, upper, step;

  lower = 0;
  upper = 300;
  step = 20;

  fahr = lower;
  while (fahr <= upper) {
    celsius = 5 * (fahr - 32) / 9;
    printf("%d \t %d \n", fahr, celsius);
    fahr = fahr + step;
  }
}
```

## comment

/* and */ are ignored by the compiler. Comment be used to make a program easier to understand and read.

## declare

In C, all variables must be declared before they are used, usually at the beginning of the function before any executable statements. It consists of a type name and a list of variables.

```c
int fahr, celsius;
int lower, upper, step;
```

## assignment

```c
lower = 0;
upper = 300;
step = 20;
fahr = lower;
```

Which set the variables to their initial values. Individual statements are terminated by semicolons.

## while loop

```c
while (fahr <= upper) {
    ...
}
```

If result of condition is true, the body of the while loop is executed. Until condition being false, the statement is executed.

## Format specifier
|Format specifier|Descriptions|
|---|:---|
|`%d`|print as decimal integer|
|`%6d`|print as decimal integer, at least 6 characters wide|
|`%f`|print as floating point|
|`%6f`|print as floating point, at least 6 characters wide|
|`%.2f`|print as floating point, 2 characters after decimal point|
|`%6.2f`|print as floating point, at least 6 wide and 2 after decimal point|


