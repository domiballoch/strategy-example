[![Actions Status](https://github.com/domiballoch/strategy-example/actions/workflows/maven.yml/badge.svg)](https://github.com/domiballoch/strategy-example/actions)
[![codecov](https://codecov.io/gh/domiballoch/strategy-example/branch/master/graph/badge.svg?token=3DQWELQG2V)](https://codecov.io/gh/domiballoch/strategy-example)
[![GitHub version](https://badge.fury.io/gh/domiballoch%2Fstrategy-example.svg)](https://badge.fury.io/gh/domiballoch%2Fstrategy-example)
[![forthebadge](https://forthebadge.com/images/badges/contains-tasty-spaghetti-code.svg)](https://forthebadge.com)

<h1>Strategy Pattern Example</h1>
<h4>Author: Dominic Balloch</h4>

<h3>Description</h3>
Two interface versions of strategy pattern implementation.
<br/>Two helper classes: One using setters, one using Java8.
<br/>Run tests to test functionality.
<br/>No DB or servers set up for the purpose of this program.

<h3>Design</h3>
Simple demo using a discounter for a shopping basket.
<br/>Strategy is based on composition (has-A relationship) but the behaviour changes dyamically at run-time.
<br/>Solid principles include single responsibility, open-closed,
interface segregation and dependency inversion.
<br/>Solid principles covered in solid.txt in resources folder.

<h3>Learning Outcomes</h3>
1. Standard design using concrete classes:
   <br/>Benefits:
   <br/> Can implement multiple interfaces enabling different behaviours.
   <br/> Can inject Spring handled objects into the concrete classes.
   <br/> Drawbacks:
   <br/> Can become difficult to maintain with lots of classes.
<br/>
<br/>2. Java 8 design using static calls with lambdas:
   <br/>Benefits:
   <br/> Cleaner and more lightweight.
   <br/> Less objects that need autowiring, just a static call.
   <br/> Drawbacks:
   <br/> Cannot inject into interfaces.
   <br/> Cannot implement different interfaces.

<h3>Prerequisites</h3>
Java 11
<br/> Spring Boot 2.4.5
<br/>Maven 3.6.3
<br/>No SQL required

<h3>Build project</h3>
mvn clean install
<br/>spring-boot:run
<br/>mvn test to test

<h3>Logging level</h3>
DEBUG - set filepath as/if required