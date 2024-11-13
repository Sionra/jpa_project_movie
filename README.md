# JPA MOVIE PROJECT

Our goals are :
- Create tables using JPA
- Parse a JSON file with multiple data
- Add the data from JSON's file to the generated table
- Create a program to extract different data from table using a menu

## Maven Dependency

be sure to have those following maven dependencies to your 'pom.xml'

```
//Hibernate Dependency
    <dependency>
        <groupId>org.hibernate.orm</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.6.1.Final</version>
    </dependency>
```
```
//Mariadb Dependency
    <dependency>
        <groupId>org.mariadb.jdbc</groupId>
        <artifactId>mariadb-java-client</artifactId>
        <version>3.5.0</version>
    </dependency>
```

## Persistence xml

do not forget to update the user and password in your 'persistence.xml'

    <property name="jakarta.persistence.jdbc.user"value=""/>
    <property name="jakarta.persistence.jdbc.password"value=""/>


## Parsing JSON File

Parsing done using Jackson.
Be sure to have this dependency jackson-databind in the pom.xml

    <dependency>
         <groupId>com.fasterxml.jackson.core</groupId>
         <artifactId>jackson-databind</artifactId>
         <version>2.17.0</version>
    </dependency>


The rest of the parsing is described here : https://mkyong.com/java/jackson-how-to-parse-json/

## UML Project Movie

![UML Project Movie.png](src%2Fmain%2Fconception%2FUML%20Project%20Movie.png)
