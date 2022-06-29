# Blog developed by Luiz Philipe

Initial script to add roles into database using PostgreSQL

INSERT INTO roles(name) VALUES('ROLE_USER'); <br>
INSERT INTO roles(name) VALUES('ROLE_MODERATOR'); <br>
INSERT INTO roles(name) VALUES('ROLE_ADMIN'); <br>

# BACK-END
Devloped using Spring Boot + JWT Authentication at back-end

# Spring Boot + JWT Auth with Spring Security & Spring Data JPA

## Dependency
– If you want to use PostgreSQL:

```xml
<dependency>
<groupId>org.postgresql</groupId>
<artifactId>postgresql</artifactId>
</dependency>
```
– or MySQL:
```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <scope>runtime</scope>
</dependency>
```
## Configure Spring Datasource, JPA, App properties
Open `src/main/resources/application.properties`
- 
- For PostgreSQL:

```
spring.datasource.url= jdbc:postgresql://localhost:5432/mydb
spring.datasource.username= postgres
spring.datasource.password= 123456

spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
philipe.app.jwtSecret= philipeSecretKey
philipe.app.jwtExpirationMs= 86400000

## Run Spring Boot application
FwBlogApplication

## Run following SQL insert statements
```
INSERT INTO roles(name) VALUES('ROLE_USER'); <br>
INSERT INTO roles(name) VALUES('ROLE_MODERATOR'); <br>
INSERT INTO roles(name) VALUES('ROLE_ADMIN'); <br>
```
