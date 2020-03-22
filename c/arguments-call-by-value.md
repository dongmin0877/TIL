# Arguments - Call by Value

In C, all function arguments are passed `by value`. This means that the called function is given the values of its arguments in temporary variables.

The main distinction with is that in C the called function can't directly alter a variable in the calling function. It can only change its temporary variables.

## Benefit of `call by value`

However, `call by vlaue` can lead to more compact code with fewer extraneous variables. Parameters can be treated as conveniently initialized local variables in the called routine. Check below codes from [`function`](/c/function.md)

```c
int power(int base, int n)
{
    int p;

    for (p = 1; n > 0; --n)
        p = p * base;
    return p;
}
```

The parameter `n` is used as a temporary variable. There is no need to use other extraneous variables. So, there is no effect on the arguments that power originally was called with.
