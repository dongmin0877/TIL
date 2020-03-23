# System call

System call is the programmatic way in which a computer program requests a service from the kernel of the operating system. The range varies, including  read(), write(), get_narea(), set_tid_address().

## Invoke system call

It is not possible to connect applications in the user domain directly to the kernel area. Therefore, a `signal` is sent to the kernel to run a system call. The application passes the system calls and parameters to be executed through the register. The system call starts with `0` and the system call must prior to be stored in the register to call.

