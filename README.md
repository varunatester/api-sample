
QABootCamp Sample Application
====================================

**Introduction:**

This project is to demonstrate creating a test framework for api using design patterns
* IDE Used: **Intellij** Community Edition
* Programming language: **JAVA**
* Build/Dependency Management Tool: **Gradle**
* Mock: **MockServer**

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
  1.open mockapi.ipr  
  2. Right click the *Tests file and run. This will run all the tests in the file.
  3. Run specific annotated scenario : Navigate to SanityTests task in build.gradle right pane
  and double click the task.
  4. ./gradlew test or ./gradlew SanityTests

* Run tests through command line :
  1.Go to folder location where code is checkout, Run the test using command :./gradlew SanityTests

* Check Reports :
  1.Reports can be seen under build/reports/tests/SanityTests/index.html

**Let's try it out**

