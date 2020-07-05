
# Steps to run tests
1. To run modern tests against version 1:
`mvn test -DtestNgSuite=resources/suites/ModernTestsV1Suite.xml`
2. To run modern tests against version 2:
`mvn test -DtestNgSuite=resources/suites/ModernTestsV2Suite.xml`

#### The AppliFashion App:
[Version 1](https://demo.applitools.com/gridHackathonV1.html)

[Version 2](https://demo.applitools.com/gridHackathonV2.html)

# Pre-requisites:

1. Java is installed on your machine.
   
   * [Install JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
   
2. Maven is installed on your machine, JAVA_HOME environment variable is created, path to Maven is added to environment variable PATH

   * [Download Maven](https://maven.apache.org/download.cgi)

   * [Install Maven, configure enviroment variables](https://maven.apache.org/install.html)

3. Chrome browser is installed on your machine.

   * [Install Chrome browser](https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en&oco=0)

4. Chrome Webdriver is on your machine and is in the PATH. Here are some resources from the internet that'll help you.

   * [Download Chrome Webdriver](https://chromedriver.chromium.org/downloads)
   * https://splinter.readthedocs.io/en/0.1/setup-chrome.html
   * https://stackoverflow.com/questions/38081021/using-selenium-on-mac-chrome
   * https://www.youtube.com/watch?time_continue=182&v=dz59GsdvUF8

5. Git is installed on your machine. 

   * [Install git](https://www.atlassian.com/git/tutorials/install-git)

6. IDE (IntelliJ IDEA for example) is installed on your machine.

   * [Install IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

     6.1 Set Project SDK to your JDK (installed in Step 1)  in Intellij - File > Project Structure > Project.

7. Restart your machine to implement updated  environment variables (need for some OS).

