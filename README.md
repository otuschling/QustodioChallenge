# QustodioChallenge

This project has been performed as a result of a selection process for Qustodio company. The main objective is to create a test infrastructure that allows to easily create lots of automated test cases for the Qustodio Family web site.

Project has been performed with:

- IntelliJ IDEA 2021.1.2 (Community Edition)
Build #IC-211.7442.40, built on June 1, 2021
Runtime version: 11.0.11+9-b1341.57 amd64
VM: Dynamic Code Evolution 64-Bit Server VM by JetBrains s.r.o.
Linux 5.11.0-18-generic
GC: G1 Young Generation, G1 Old Generation
Memory: 750M
Cores: 8
Non-Bundled Plugins: PythonCore (211.7142.45)
Kotlin: 211-1.4.32-release-IJ7442.2
Current Desktop: ubuntu:GNOME

- Junit 5.0

- Selenium 3.141.59

- ChromeDriver for Chrome Version 91.0.4472.101 (Official Build) (64-bit)


Project contains 4 main java files:

- QustodioChallenge.java (under test folder): Contains a sample of how to use all the infrastructure created from scratch.
- QustodioLoginPage.java : POM (Page Object Model) created java file that contains all encapsulation for the Qustodio Login page
- QustodioMainPage.java: POM (Page Object Model) created java file that contains all encapsulation for the Qustodio Main web site (once logged in)
- Helper.java: Library that contains some helper functions
