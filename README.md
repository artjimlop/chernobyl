# chernobyl
Crash fast library for Android

Tired of having a crash-free application? Now you have Chernobyl! With this library, you can have crashes wherever you want :)

Just joking, if you want to try really quick the behavior when some exception is thrown at any point of your code, use this. 
 
The sample
----------

```java

Chernobyl.nuke(new RuntimeException()); // Trow the exception you want,
Chernobyl.nuke(new IllegalArgumentException(), PROBABILITY); // Throw an exception with a certain probability,
Chernobyl.nuke(new PrypiatException()); // Throw custom exceptions,
Chernobyl.nuke(); // Just throw an exception.

```

#Download

* Grab via Gradle:
```groovy
compile 'com.artjimlop:chernobyl:0.0.1'
```
* Grab via Maven:
```xml
<dependency>
  <groupId>com.artjimlop</groupId>
  <artifactId>chernobyl</artifactId>
  <version>0.0.1</version>
  <type>pom</type>
</dependency>
```
