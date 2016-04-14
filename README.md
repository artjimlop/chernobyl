# chernobyl
Crash fast library for Android

Simple precondition library for crashing in case you find unexpected values. For example: After you login against a certain API, you have to get back your user. It's completly necessary to have a no null user, so you can checkNotNull(receivedUser). Antoher example: a user must have an email, so you can checkNotEmpty(user.getEmail()).  
 
The sample
----------

```java

checkArgument(1 == 0, "Not equal arguments");

checkArgument(1 == 1, "Equal arguments");

checkState(false, "State is FALSE");

checkState(1 == 1, "State is TRUE");

checkNotNull(null);

checkNotNull(5);

checkElementIndex(5, 4, "index > size");

checkElementIndex(5, 5, "index == size");

checkElementIndex(4, 5, "index < size");

checkNotEmpty("");

checkNotEmpty("string");

checkNotEmpty(Collections.emptyList());

checkNotEmpty(Collections.singletonList("element"));

```

#Download

* Grab via Gradle:
```groovy
compile 'com.artjimlop:chernobyl:1.0.0'
```
* Grab via Maven:
```xml
<dependency>
  <groupId>com.artjimlop</groupId>
  <artifactId>chernobyl</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
