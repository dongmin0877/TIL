# :sparkles: Language Tutorial
[![JAVA](https://img.shields.io/badge/JAVA-v11.0.4-red)]

## :rocket: Java install & version check

```shell
sudo apt update

sudo apt install default-jdk

javac -version
```

## :wrench: Setting java environment variable

Using text editor, open `.profile` at `home/user-name` directory, add the following line (highligted word should be changed as own java version)

```bash
JAVA_HOME="/usr/lib/jvm/`java-11-openjdk-amd64`/bin/"
```
```shell
source .profile

echo $JAVA_HOME
```

## :sparkles: Move to

* [JAVA](https://github.com/tigermeal/Language_tutorial/tree/master/java)


