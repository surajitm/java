# Installation & configuration guide

## Configuring maven projects-

   * Create a eclipse maven project
     * File -> New -> Maven Project
     * Set artifactId(Project name) and groupId(package name)
     * Run command :(build)
       mvn clean install 
     
   * Add latest verion of compiler in pom.xml
   
    ``` 
    <properties>
      <maven.compiler.target>1.8</maven.compiler.target>
      <maven.compiler.source>1.8</maven.compiler.source> 
    </properties> 
    ```
   * Update maven project.
      * Right click on maven project -> maven -> Update Project
      
 
 ## Configuring github-
   * Right click -> Team ->Share -> Git
   * Do a initial commit
   * Push the project to the repository.
   
 ```
 Got non-first-forward issue:
 > git pull --rebase
 
 This will apply changes that has been done online.
 ```
 
    

