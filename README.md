
QABootCamp Sample Application
====================================

**Introduction:**

This project is to demonstrate creating a test framework for api using design patterns
* IDE Used: **Intellij** Community Edition
* Programming language: **JAVA**
* Build/Dependency Management Tool: **Gradle**


**Prerequisties:**

* Java 17
* Git
* Any IDE (Intellij)
* Install lombok plugin to run tests from Intellij and enable annotation processor
  "Settings > Build > Compiler > Annotation Processors"


**Testing Notes:**

* Tested on platform Mac 11.6.2

**Set up**

* ./gradlew clean test
* ./gradlew eclipse
* ./gradlew cleaneclipse

**Notes**

* Please make sure you have decent internet speed during test run.

**How to run test:**

* Run tests through IDE :
  1Right click the *Tests file and run. This will run all the tests in the file.
  2Run specific annotated scenario : Navigate to SanityTests task in build.gradle right pane
  and double click the task.
  3./gradlew test or ./gradlew SanityTests

* Run tests through command line :
  1.Go to folder location where code is checkout, Run the test using command :./gradlew SanityTests

* Check Reports :
  1.Reports can be seen under build/reports/tests/SanityTests/index.html

**Let's try it out**

1. Login to application
2. Search all Product
3. Submit Product Review
4. Any design pattern to try out
5. Add tag to test and run all the tests using that tag
6. Run the test both on local and prod deployed OWASP application


