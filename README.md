# Installation & configuration guide

   * Create a eclipse maven project
     * File -> New -> Maven Project
     * Set artifactId(Project name) and groupId(package name)
     * Run command :(build)
       mvn clean install 
     
   * Add latest verion of compiler in pom.xml
    ``` <properties>
      <maven.compiler.target>1.8</maven.compiler.target>
		  <maven.compiler.source>1.8</maven.compiler.source> 
    </properties> ```
    
    * Update maven project.
