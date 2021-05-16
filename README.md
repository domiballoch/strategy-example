[![Actions Status](https://github.com/domiballoch/strategy-example/actions/workflows/maven.yml/badge.svg)](https://github.com/domiballoch/strategy-example/actions)
[![codecov](https://codecov.io/gh/domiballoch/strategy-example/branch/master/graph/badge.svg?token=3DQWELQG2V)](https://codecov.io/gh/domiballoch/strategy-example)
[![GitHub contributors](https://img.shields.io/github/contributors/Naereen/badges.svg)](https://GitHub.com/Naereen/badges/graphs/contributors/)
[![GitHub version](https://badge.fury.io/gh/Naereen%2FStrapDown.js.svg)](https://github.com/Naereen/StrapDown.js)
[![Github all releases](https://img.shields.io/github/downloads/Naereen/StrapDown.js/total.svg)](https://GitHub.com/Naereen/StrapDown.js/releases/)
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://lbesson.mit-license.org/)
[![GitHub forks](https://img.shields.io/github/forks/Naereen/StrapDown.js.svg?style=social&label=Fork&maxAge=2592000)](https://GitHub.com/Naereen/StrapDown.js/network/)
[![GitHub stars](https://img.shields.io/github/stars/Naereen/StrapDown.js.svg?style=social&label=Star&maxAge=2592000)](https://GitHub.com/Naereen/StrapDown.js/stargazers/)
![Your Repository's Stats](https://github-readme-stats.vercel.app/api?username=domiballoch&show_icons=true)

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