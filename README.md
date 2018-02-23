spring-security
===============

This repository contains examples on how to implement different functionalities with the Spring Security framework. 
<br />

### Spring Security 4.x

Spring version: 4.3.14.RELEASE <br />
Spring Security version: 4.2.4.RELEASE <br />
Java version: 1.8

<br />

* **Basic in-memory**: The most basic example of a secured application. Users are defined in-memory in the security 
configuration. Secured paths are 'home' and 'admin' which are available depending on the user role.
    
    Links to source code: [Spring Boot][v4-boot-basic-inmemory] | [JavaConfig][v4-basic-inmemory] | [XML][v4-xml-basic-inmemory]
                   
    [v4-boot-basic-inmemory]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-basic-inmemory 
    [v4-basic-inmemory]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-inmemory
    [v4-xml-basic-inmemory]: https://github.com/xpadro/spring-security/tree/master/v4/xml/v4-xml-basic-inmemory

<br />

* **Basic JDBC**: Modified version of basic-inmemory where users are stored in an in-memory database (H2).

    Links to source code: [Spring Boot][v4-boot-basic-jdbc] | [JavaConfig][v4-basic-jdbc]
    
    [v4-boot-basic-jdbc]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-basic-jdbc
    [v4-basic-jdbc]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-jdbc

<br />

* **Basic JDBC with H2**: The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.

    Links to source code: [JavaConfig][v4-basic-jdbc-h2]
    
    [v4-basic-jdbc-h2]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-jdbc-h2-console

<br />

* **BCrypt password encoder**: The previous basic-jdbc example configuring a password encoder that uses BCrypt hashing 
function in order to encode user credentials before persisting them.

    Links to source code: [Spring Boot][v4-boot-bcrypt] | [JavaConfig][v4-bcrypt] | [XML][v4-xml-bcrypt]
    
    [v4-boot-bcrypt]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-password-encoder-bcrypt
    [v4-bcrypt]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-password-encoder-bcrypt
    [v4-xml-bcrypt]: https://github.com/xpadro/spring-security/tree/master/v4/xml/v4-xml-password-encoder-bcrypt

<br />

* **Remember-me token**: Configures a remember me using a token approach, which sets a cookie in the browser.

    Links to source code: [Spring Boot][v4-boot-rememberme-token] | [JavaConfig][v4-rememberme-token]
    
    [v4-boot-rememberme-token]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-rememberme-token
    [v4-rememberme-token]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-rememberme-token

<br />

* **Remember-me persistent**: Configures a persistent remember me. THis is a more secure version which relies on a database

    Links to source code: [Spring Boot][v4-boot-rememberme-persistent] | [JavaConfig][v4-rememberme-persistent]

    [v4-boot-rememberme-persistent]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-rememberme-persistent
    [v4-rememberme-persistent]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-rememberme-persistent

<br />

* **JDBC full sample**: Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * custom login page
    * encrypted credentials with BCrypt
    * CSRF protection
    * logout feature
    * remember-me feature
    
    <br />
    
    Links to source code: [Spring Boot][v4-boot-jdbc-full] | [JavaConfig][v4-jdbc-full] | [XML][v4-xml-jdbc-full]
    
    [v4-boot-jdbc-full]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-jdbc
    [v4-jdbc-full]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-jdbc
    [v4-xml-jdbc-full]: https://github.com/xpadro/spring-security/tree/master/v4/xml/v4-xml-jdbc

<br />

* **JDBC full sample with Thymeleaf**: The above example but using Thymeleaf instead of JSPs.
    
    <br />
    
    Links to source code: [Spring Boot][v4-boot-jdbc-thyme]
    
    [v4-boot-jdbc-thyme]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-jdbc-thymeleaf


<br/>

### Spring Security 3.x

Spring version: 3.2.10.RELEASE <br />
Spring Security version: 3.2.10.RELEASE <br />
Java version: 1.7

<br />

* **Basic in-memory**: The most basic example of a secured application. Users are defined in-memory in the security 
configuration. Secured paths are 'home' and 'admin' which are available depending on the user role.
    
    Links to source code: [XML][v3-inmemory]
                   
    [v3-inmemory]: https://github.com/xpadro/spring-security/tree/master/v3/xml/basic-inmemory 

<br />

* **Basic JDBC**: Modified version of basic-inmemory where users are stored in an in-memory database (H2).

    Links to source code: [XML][v3-basic-jdbc]
    
    [v3-basic-jdbc]: https://github.com/xpadro/spring-security/tree/master/v3/xml/basic-jdbc

<br />

* **Basic JDBC with H2**: The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.

    Links to source code: [XML][v3-jdbc-h2]
    
    [v3-jdbc-h2]: https://github.com/xpadro/spring-security/tree/master/v3/xml/jdbc-h2-console

<br />

* **Default password encoder**: Basic-jdbc example configuring a standard password encoder that uses SHA-256 hashing.

    Links to source code: [XML][v3-password-encoder-default]
    
    [v3-password-encoder-default]: https://github.com/xpadro/spring-security/tree/master/v3/xml/password-encoder-default

<br />

* **BCrypt password encoder**: The previous basic-jdbc example configuring a password encoder that uses BCrypt hashing 
function in order to encode user credentials before persisting them.

    Links to source code: [XML][v3-password-encoder-bcrypt]
    
    [v3-password-encoder-bcrypt]: https://github.com/xpadro/spring-security/tree/master/v3/xml/password-encoder-bcrypt

<br />

* **Remember-me token**: Configures a remember me using a token approach, which sets a cookie in the browser.

    Links to source code: [XML][v3-rememberme-token]
    
    [v3-rememberme-token]: https://github.com/xpadro/spring-security/tree/master/v3/xml/rememberme-token

<br />

* **Remember-me persistent**: Configures a persistent remember me. THis is a more secure version which relies on a database

    Links to source code: [XML][v3-rememberme-persistent]

    [v3-rememberme-persistent]: https://github.com/xpadro/spring-security/tree/master/v3/xml/rememberme-persistent

<br />

* **JDBC full sample**: Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * custom login page
    * encrypted credentials with BCrypt
    * CSRF protection
    * logout feature
    * remember-me feature
    
    <br />
    
    Links to source code: [XML][v3-jdbc-full]
    
    [v3-jdbc-full]: https://github.com/xpadro/spring-security/tree/master/v3/xml/jdbc
