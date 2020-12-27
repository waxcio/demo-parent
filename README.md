# About this Project

- after 20 years of development, I would like to be humble, relearning everything based on the MIT philosophy, being the
  best engineer!

# how-to setup development machine (macosx)

- install productive software: parallel, drive, convert it, office, The Unarchiver
- install dev tools: intellij, graphiql, postman, docker, webp viewer, lens, dbeaver
- install amazon-corretto-15.0.1.9.1-macosx-x64.pkg

# setup parallel keyboard mapping
  - cmd+left = home
  - shift+cmd+left = shift+home
  - cmd+right = end
  - shift+cmd+right = shift+end
  - cmd = ctrl

# popular brew package: wget, curl, maven, maven-completion, htop
- brew cask install iterm2
  [zsh config] (https://www.freecodecamp.org/news/how-to-configure-your-macos-terminal-with-zsh-like-a-pro-c0ab3f3c1156/)

- brew will install in path /usr/local/bin/

- default path for the version
    - /usr/bin/python 2.7.16
    - /usr/bin/ruby 2.6
    - /usr/bin/java 15

# Path precedent 
>$PATH /usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin

# setup intellij

- login to github
- git clone: git@github.com:waxcio/demo-parent.git

# setting intelli keymaps

- shift-cmd O = open file
- shift-cmd L = reformat // remap required
- shift-cmd T = run test // review
- shift-cmd - = collapse recursively
- shift-cmd + = expand all recursively
- shift-cmd F = find in path
- shift-cmd P = compare with same repository version // remap required
- shift-cmd K = commit and push, cmd-k = commit only
- shift-cmd I = optimize import // remap required
- shift-cmd N = new file
- shift-cmd J = quick documentation
- shift-cmd B = declaration and usage
- shift-cmd M = terminal panel
- crt-D = delete line
- change font size = 14

Panel 
- cmd-1 = project 
- cmd-2 = favorites
- cmd-3 = Find 
- cmd-4 = run test
- cmd-5 = debug
- cmd-6 = problem
- cmd-7 = structure
- cmd-8 = service
- cmd-9 = changelist
- cmd-0 = commit

# popular Git command

# Follow MIT computer science tutorial
- every engineer should master the basic engineering practices
  - work in pairs
  - perform code review 
  - write test code
- reference [MIT 6.00.5.1x](https://courses.edx.org/courses/course-v1:MITx+6.005.1x+3T2016/course/)

# setting license type

- MIT License

# including spring boot module:

- Dev Tools
- Web , how about providing GraphQL?
- Security: Oauth2
- SQL: MySQL, JPA, JDBC, Flyway Migration
- NOSQL: Redis, MongoDB, ElasticSearch
- Messaging: Camel, RMQ, Kafka, kStream, Websocket
- I/O: Batch, Mail, Scheduler, Cache.
- Config Server, Discovery, Routing, Circuit Breaker
- Cloud Messeging: CloudBus, Cloud Streaming, reactive
- integration with slack, salesforces, line, grab, facebook, 2c2p payment
- blockchain: settler, ipfs, hyperledger

# spring framework

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

# installing theme

* visual studio code dark plus theme

# using Gitflow Workflow

![*](https://www.atlassian.com/dam/jcr:61ccc620-5249-4338-be66-94d563f2843c/05%20(2).svg)

    git branch develop // gitflow branch
    git push -u origin develop
    git flow init
    git flow feature start feature_branch // Creating a feature branch    
    git flow feature finish feature_branch // Finishing a feature branch
    git flow release start 0.1.0 // Release Branches
    git flow release finish '0.1.0' //Switched to a new branch 'release/0.1.0'
    git flow hotfix start hotfix_branch //Hotfix Branches
    git flow hotfix finish hotfix_branch

# install xcode-select, otherwise xcrun: error: invalid active developer path

    $xcode-select --install

# install software

* git-tower

# spring boot

create project > spring initializer VCS > import into version control

1. building restful services Create a resource representation class /complete/src

2. Create a resource controller

* define @RestController
* define @RequestMapping("/greeting")\
* @ binds the value of the query string parameter name into the name parameter of method.

Spring Boot automatically configures your application based on the dependencies you have added to the project by using
@EnableAutoConfiguration annotation. The entry point of the spring boot application is the class contains
@SpringBootApplication annotation and the main method. Spring Boot automatically scans all the components included in
the project by using @ComponentScan annotation.

# maven setting.xml to include source and javadoc

<settings>
   <!-- ... other settings here ... -->
    <profiles>
        <profile>
            <id>downloadSources</id>
            <properties>
                <downloadSources>true</downloadSources>
                <downloadJavadocs>true</downloadJavadocs>
            </properties>
        </profile>
    </profiles>

    <activeProfiles>
        <activeProfile>downloadSources</activeProfile>
    </activeProfiles>

</settings>

# build

mvn clean install
> maven > download sources and documentation

# run the application

    java -jar ./webstarter/target/webstarter-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev

[](http://localhost:9090)

    java -jar ./webstarter/target/webstarter-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

[](http://localhost:4431)


    
    
 
 
 