# Java installation

## :rocket: Java install & version check

```shell
$ sudo apt update

$ sudo apt install default-jdk

$ javac -version
```

## :wrench: Setting java environment variable

Using text editor, open `.profile` at `home/user-name` directory, add the following line (java version should be changed as own java version)

```bash
JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/bin/"
```
```shell
$ source .profile

$ echo $JAVA_HOME 
#Check JAVA_HOME variable is declared at your enviroment
```
