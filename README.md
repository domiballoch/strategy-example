<h1>Strategy Pattern Example</h1>
<h4>Author: Dominic Balloch</h4>

<h3>Description</h3>
Two interface versions of strategy pattern implementation.
<br/>Two helper classes: One using setters, one using Java8.
<br/>Run tests to test functionality.
<br/>No DB or servers set up for the purpose of this program.

<h3>Design</h3>
Simple demo using a discounter for a shopping basket.
<br/>Solid principles include single responsibility, open-closed,
interface segregation and dependency inversion.

<h3>Learning Outcomes</h3>
1. Standard design using concrete methods:
   Benefits:
   <br/> Can implement multiple interfaces enabling different behaviours.
   <br/> Can inject Spring handled objects into the concrete classes.
   <br/> Drawbacks:
   <br/> Can become difficult to maintain with lots of classes.

2. Java 8 design using static calls with lambdas:
   Benefits:
   <br/> Cleaner and more lightweight.
   <br/> Less objects that need autowiring, just a static call.
   <br/> Drawbacks:
   <br/> Cannot inject into interfaces.
   <br/> Cannot implement different interfaces.

<h3>Prerequisites</h3>
Java 11
<br/> Spring Boot 2.4.5.RELEASE
<br/>Maven 3.6.3
<br/>No SQL required

<h3>Build project</h3>
mvn clean install
<br/>spring-boot:run
<br/>mvn test to test

<h3>Logging level</h3>
DEBUG - set filepath as/if required