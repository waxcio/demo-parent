# vision 
* to build a demo suites so that we have build prototype and test new technology quickly before migrating to the actual code.
* can be used for hactackon, POC 

*Welcome to join in, if you are interested too*

# demo-parent
this is the parent module that contains all demo sub sub modules

# spring boot module to be included in demo
 * Dev Tools
 * Web
 * Security: Oauth2
 * SQL: MySQL, JPA, JDBC, Flyway Migration
 * NOSQL: Redis, MongoDB, ElasticSearch
 * Messaging: Camel, RMQ, Kafka, kStream, Websocket
 * I/O: Batch, Mail, Scheduler, Cache.
 * Config Server, Discovery, Routing, Circuit Breaker
 * Cloud Messeging: CloudBus, Cloud Streaming, reactive // event processing, event bus
 * blockchain: CORBA?
 * Progressive web application
 * stream processing engine: siddhi https://github.com/siddhi-io/siddhi
 * real time processing: spark?
 
 
 
 # Gitflow Workflow
 https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow
 
 # references
 https://www.tutorialspoint.com/spring_boot/index.htm
 https://docs.spring.io/spring-boot/docs/2.1.5.RELEASE/reference/htmlsingle/ 
 
 
 # update intelli keymap
 * shift-cmd O = open file
 * shift-cmd L = reformat
 * shift-cmd U = run test
 * shift-cmd - = collapse 
 * shift-cmd + = expand
 * shift-cmd F = find in path
 * shift-cmd P = compare from git
 * shift-cmd K = commit to git
 * cmd-B = decleration
 * crt-D = delete line
 * change font size = 15 

 # intellij setup
 create project > spring initializer 
 VCS > import into version control 
 
 1. building restful services
 Create a resource representation class
 /complete/src
 
 2. Create a resource controller
 * define @RestController
 * define @RequestMapping("/greeting")\
 * @RequestParam binds the value of the query string parameter name into the name parameter of method.
 
 
 # spring boot:
 Spring Boot automatically configures your application based on the dependencies you have added to the project by using @EnableAutoConfiguration annotation. 
 
 The entry point of the spring boot application is the class contains @SpringBootApplication annotation and the main method.
 
 Spring Boot automatically scans all the components included in the project by using @ComponentScan annotation.
 
 
# install
$brew install maven-completion
