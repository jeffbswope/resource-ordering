resource-ordering
=================


### Run ./gradlew cleanTest test

Classpath is displayed with the following in expected order:
1. build/classes/test
2. build/resources/test
3. build/classes/main
4. build/resources/main.

Output of test is:

     Test run read: FROM TEST RESOURCES

### Import project into Intellij 14.0 (Build #IU-139.224, built on November 4, 2014)

### Run ResourceTest using Gradle Test Executor

Same as above.

### Run ResourceTest using Junit runner

Classpath sent on java command to execute tests has following in incorrect order:

1. build/classes/test
2. build/classes/main
3. build/resources/main
4. build/resources/test

Therefore output is:

     Test run read: FROM MAIN RESOURCES

