## Practice section:
   * [CodingBat](http://codingbat.com/java)

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
   ## BigDecimal:
   
        * For getting accurate result in calculation or big number calculation we can use BigDecimal.
        * BigDecimal is a immutable class.
        * We can do all numerical operation with BigDecimal.
        * Method of big decimal:
          add(),subtract(),multiply(),divide()  
        * For comparing use compareTo() method.
   * Issues:
      * Exception:Non-terminating decimal expansion
         ```
         Use RoundingMode: import java.math.RoundingMode;
         BigDecimal avg=sum.divide(n,3,RoundingMode.HALF_UP); -> Precesion 3
         Check Java doc for RoundingMode. 
    
         ```
        
        
         
   ## String-
   ## OOPS-
   ## Collection-
   ## Generics-
   ## Threading-
   ## Functional Programming-
   ## Steams-
   ## Miscellaneous-
   ## Puzzle-
 
 
 
    

