# LF error in git

In UNIX systems, EOL is represented with a line feed (LF). In windows a line is represented with a carriage return (CR) and a line feed (LF) thus (CRLF). If you are developing other person, you should to care of it. So, following command can turn this warning off.


```shell
$ git config --global core.autocrlf true
```

If you are windows-only project.

```shell
$ git config --global core.autocrlf false
```
