#Strategy Pattern Example
####Author: Dominic Balloch

##Description
Two interface versions of strategy pattern implementation.
Two helper classes: One using setters, one using Java8.
Run tests to test functionality.
No DB or servers set up for the purpose of this program.

##Design
Simple demo using a discounter for a shopping basket.
Solid principles include single responsibility, open-closed,
interface segregation and dependency inversion.

##Learning Outcomes
1. Standard design using concrete methods:
   <br/> Benefits:
   <br/> Can implement multiple interfaces enabling different behaviours.
   <br/> Can inject Spring handled objects into the concrete classes.
   <br/> Drawbacks:
   <br/> Can become difficult to maintain with lots of classes.

2. Java 8 design using static calls with lambdas:
   <br/> Benefits:
   <br/> Cleaner and more lightweight.
   <br/> Less objects that need autowiring, just a static call.
   <br/> Drawbacks:
   <br/> Cannot inject into interfaces.
   <br/> Cannot implement different interfaces.

##Prerequisites
Java 11
<br/> Spring Boot 2.4.5.RELEASE
<br/>Maven 3.6.3
<br/>No SQL required

##Build project
mvn clean install
<br/>spring-boot:run
<br/>mvn test to test

#Logging level
DEBUG - set filepath as/if required