## Practice section:
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
   ## OOPS-
   ## Serialization:
   * Can through serialization immutability of an object can break?
   
   ## Collection-
   * How you will make a best key for HashMap?
   ## Generics-
   ## Threading-
   * Tell me all different service provided by the Executor Service?
   ## Functional Programming-
   ## Steams-
   ## Miscellaneous-
   ## Puzzle-
 
 
 
    

