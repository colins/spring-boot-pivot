# Spring Boot Pivot

A quick way to get started writing a Spring Boot application.

Goals: 

- Developers should be able to download and run this application w/o additional configuration
- Common stack decisions should already be configured (database, template language, logging, testing etc.)

#

Installation:

brew install gradle;
git clone https://github.com/pivotal/spring-boot-pivot.git
cd spring-boot-pivot/project;
gradle bootRun;
open http://localhost:8080/

---

- ability to create controllers backed by a template language
- ability to create entities with a database mapping solution
- ability to automate my database changes using a database migration solution
- an application server solution
- model serialization solution (respond to different mime-types)
- a single build tool (we prefer gradle)
- a *very clear* guide for expected project/file structure
- a testing framework, complete with configuration for unit, integration, and browser tests
