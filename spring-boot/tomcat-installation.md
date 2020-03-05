# Tomcat installation

Using [homebrew](https://brew.sh/)

## Update homebrew :pencil:

```shell
$ brew update
```

## Install tomcat :rocket:

```shell
$ brew search tomcat
# tomcat              tomcat-native       tomcat@7            tomcat@8
$ brew install tomcat@8
```

## Check brew list :pencil:

```shell
$ brew list
# tomcat@8 ...
```

## Launch and stop tomcat :sparkles:

```shell
$ cd usr/usr/local/Cellar/tomcat@8/8.5.51_1/bin
$ ./catalina start
# localhost:8080 will be open
$ ./catalina stop
# tomcat server stop
```