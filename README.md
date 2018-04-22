## Topics for interviews:
   * String memory level,immutability
   * JVM memory level.
   * Concurrency and concurrent hash map,producer and consumer,reader and writer,deadlock and resolve deadlock.
   * wait() and notify()
   * Serializable
   * Collection -> Map,comparator,comparable.
   * Exception -> custom runtime and compiletime Exception.
   * New feature added in Java 8 
   * Shallow copy and deep copy and use cases
   * DS(sorting,map,dp,greedy,linkedlist,tree)
   * class designing -> collection usage,pattern usage.-> Practice design from geeksforgeeks,singleton,Factory,set opearion
   * Dependency injection-> loose and tight coupling.
   * Project ->Webcrawler,XMLTranslator
   * Technology - spring core,spring AOP,spring MVC,hibernate,Webservices(RESTFull),MongoDB or cassandra,GIT
   * Hackerrank and geeksforgeeks and interviewbit



## Practice section:
   * [Java Program](http://www.java2novice.com/java-interview-programs/)
   * [CodingBat](http://codingbat.com/java)
   * [Top Java tutorial](http://www.topjavatutorial.com/category/java/)


   


## Configuring maven projects-

   * Create a eclipse maven project
     * File -> New -> Maven Project
     * Set artifactId(Project name) and groupId(package name)
     * Run command :(build)
       mvn clean install 
     
   * Add latest verion of compiler in pom.xml
   
    <properties>
      <maven.compiler.target>1.8</maven.compiler.target>
      <maven.compiler.source>1.8</maven.compiler.source> 
    </properties> 
    
   
   * Update maven project.
   
         * Right click on maven project -> maven -> Update Project
      
 ## How to disable autocomplete-
 
      Window->preference->java->Editor->Advanced->[Uncheck All]
 
 
 ## Configuring github-
   * Right click -> Team ->Share -> Git
   * Do a initial commit
   * Push the project to the repository.
   
            Got non-first-forward issue:
            > git pull --rebase
            This will apply changes that has been done online.
        
 
 # Some important interview question:
   ## [BigDecimal](https://github.com/surajitm/java/wiki/BigDecimal)
   ## [String]()
   * Is String immutable? How you will create immutable class?
   ## [Set operation](https://github.com/surajitm/java/wiki/All-java-Set-Operation)
   ## OOPS-
   ## Serialization:
   * Can through serialization immutability of an object can break?
   
   ## Exception handling:
   * How you will create a custom exception?
   * What are the best practices for implementing Exception Handling?
   
   ## Collection-
   * How you will make a best key for HashMap?
   ## Generics-
   ## Annotation-
   ## Threading-
   * Tell me all different service provided by the Executor Service?
   ## Functional Programming-
   ## Steams-
   ## Miscellaneous-
   ## Puzzle-
 
 
 
    

