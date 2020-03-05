# Tomcat installation

## Homebrew

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

## Zip

Using ![zip file](https://tomcat.apache.org/download-90.cgi)

```shell
# move to usr directory
$ sudo rm -f /Library/Tomcat
$ sudo ln -s /usr/local/apache-tomcat-9.0.31 /Library/Tomcat
# Check your username
# whoami
$ sudo chown <username> /Library/Tomcat
$ sudo chmod +x /Library/Tomcat/bin/*.sh
```

## Launch and stop tomcat :sparkles:

```shell
$ /Library/Tomcat/bin/startup.sh
# localhost:8080 will be open
$ /Library/Tomcat/bin/shutdown.sh
# tomcat server stop
```