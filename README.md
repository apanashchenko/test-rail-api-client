# test-rail-api-client
Rest API client for TestRail API(v2)

[![Build Status](https://travis-ci.org/apanashchenko/test-rail-api-client.svg?branch=master)](https://travis-ci.org/apanashchenko/test-rail-api-client)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.apanashchenko/testrail-api-client/badge.svg?style=flat)](https://search.maven.org/artifact/io.github.apanashchenko/testrail-api-client/1.0/jar)


[TestRail API (v2)](http://docs.gurock.com/testrail-api2/start) all API calls declaration



### Add maven dependency to pom.xml
```xml
<dependency>
  <groupId>io.github.apanashchenko</groupId>
  <artifactId>testrail-api-client</artifactId>
  <version>1.0</version>
</dependency>
```

### Add gradle dependency to build.gradle
```groovy
compile 'io.github.apanashchenko:testrail-api-client:1.0'
```



### Create TestRailClient client:
```java
TestRailClient testRailClient = new TestRailClientBuilder("TESTRAIL_URL", "USER", "PASSWORD").build();
```

        