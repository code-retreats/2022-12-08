"Introduction to Kotlin" workshop, 12th December 2022

### Contains starter project

- You can fork this repository into your own account, and clone it to make it your own. It includes `mvnw`, so you can
  just build and run (provided you have Java 11, see later)
- For the best experience, use the starter with IntelliJ IDEA Community Edition

```shell
$ ./mvnw clean install
```

### Pre-requisites

- The workshop will be available virtually on Zoom
- We will use some online paste board to share links, etc. If all participants are able to join the same Slack
  workspace, we might create and use a channel for this purpose.

### Setup

- In the event you cannot setup local tools or an IDE, you can still write and run most Kotlin code online using
  the [Kotlin Playground](https://play.kotlinlang.org)
- Prefer to setup Kotlin locally as follows

```shell
# install sdkman from https://sdkman.io

$ sdk ls java 			# lists multiple available Java versions
$ sdk install java 11.0.2-open  # we will use Java 11
$ java -version
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)

$ sdk install kotlin
$ kotlin -version
Kotlin version 1.7.21-release-272 (JRE 11.0.2+9)

```

- You can also obtain and install the IntelliJ IDEA Community Edition (features integrated support for Kotlin)
