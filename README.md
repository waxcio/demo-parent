at master

 # about this project
 - this is the parent module that contains all demo sub sub modules

 # setting license type
 - MIT License
 
 # including spring boot module:
 - Dev Tools
 - Web
 - Security: Oauth2
 - SQL: MySQL, JPA, JDBC, Flyway Migration
 - NOSQL: Redis, MongoDB, ElasticSearch
 - Messaging: Camel, RMQ, Kafka, kStream, Websocket
 - I/O: Batch, Mail, Scheduler, Cache.
 - Config Server, Discovery, Routing, Circuit Breaker
 - Cloud Messeging: CloudBus, Cloud Streaming, reactive
 - integration with slack, salesforces, line, grab, facebook, 2c2p payment
 - blockchain: settler, ipfs, hyperledger, codra
 
 # spring 
 - spring boot 2.0 reactor
 - spring cloud
 - spring data flow
 
 # most active open source projects
 - mockito 
 - rxjava
 - design patterns
 - google guava
 - apache common
 - elasticsearh
 - siddhi
 - event bus
 - awesome-java
 
 # Spring book tutorial
[](https://www.tutorialspoint.com/spring_boot/index.htm)
[](https://docs.spring.io/spring-boot/docs/2.1.5.RELEASE/reference/htmlsingle/)
 
 # setting intelli keymap
 - shift-cmd O = open file
 - shift-cmd L = reformat
 - shift-cmd U = run test
 - shift-cmd - = collapse 
 - shift-cmd + = expand
 - shift-cmd F = find in path
 - shift-cmd P = compare from git
 - shift-cmd K = commit to git
 - cmd-B = decleration
 - crt-D = delete line
 - change font size = 14
 - cmd-9 = version control
 - cmd-0 = terminal


 # installing theme
 * visual studio code dark plus theme

 # using Gitflow Workflow

![*](https://www.atlassian.com/dam/jcr:61ccc620-5249-4338-be66-94d563f2843c/05%20(2).svg) 
 
 `git branch develop` // gitflow branch

 `git push -u origin develop`
 
 `git flow init`

 `git flow feature start feature_branch` // Creating a feature branch 

 `git flow feature finish feature_branch` // Finishing a feature branch

 `git flow release start 0.1.0` // Release Branches

 `git flow release finish '0.1.0'` //Switched to a new branch 'release/0.1.0'
 
 `git flow hotfix start hotfix_branch` //Hotfix Branches

 `$ git flow hotfix finish hotfix_branch`

 # spring boot
 create project > spring initializer 
 VCS > import into version control 
 
 1. building restful services
 Create a resource representation class
 /complete/src
 
 2. Create a resource controller
 * define @RestController
 * define @RequestMapping("/greeting")\
 * @RequestParam binds the value of the query string parameter name into the name parameter of method.
 
 Spring Boot automatically configures your application based on the dependencies you have added to the project by using @EnableAutoConfiguration annotation. 
 The entry point of the spring boot application is the class contains @SpringBootApplication annotation and the main method. 
 Spring Boot automatically scans all the components included in the project by using @ComponentScan annotation.
 
 
 
 