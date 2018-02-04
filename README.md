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
    
    Links to source code: [Spring Boot] | [JavaConfig]
                   
    [Spring Boot]: https://github.com/xpadro/spring-security/tree/master/v4/boot/v4-boot-basic-inmemory 
    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-inmemory

<br />

* **Basic JDBC**: Modified version of basic-inmemory where users are stored in an in-memory database (H2).

    Links to source code: [JavaConfig]
    
    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-jdbc

<br />

* **Basic JDBC with H2**: The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.

    Links to source code: [JavaConfig]
    
    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-jdbc-h2-console

<br />

* **BCrypt password encoder**: The previous basic-jdbc example configuring a password encoder that uses BCrypt hashing 
function in order to encode user credentials before persisting them.

    Links to source code: [JavaConfig]
    
    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-password-encoder-bcrypt

<br />

* **Remember-me token**: Configures a remember me using a token approach, which sets a cookie in the browser.

    Links to source code: [JavaConfig]
    
    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-rememberme-token

<br />

* **Remember-me persistent**: Configures a persistent remember me. THis is a more secure version which relies on a database

    Links to source code: [JavaConfig]

    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-rememberme-persistent

<br />

* **JDBC full sample**: Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * custom login page
    * encrypted credentials with BCrypt
    * CSRF protection
    * logout feature
    * remember-me feature
    
    <br />
    
    Links to source code: [JavaConfig]
    
    [JavaConfig]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-jdbc



<br/>

### Spring Security 3.x

Spring version: 3.2.10.RELEASE <br />
Spring Security version: 3.2.10.RELEASE <br />
Java version: 1.7

<br />

* **Basic in-memory**: The most basic example of a secured application. Users are defined in-memory in the security 
configuration. Secured paths are 'home' and 'admin' which are available depending on the user role.
    
    Links to source code: [XML]
                   
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/basic-inmemory 

<br />

* **Basic JDBC**: Modified version of basic-inmemory where users are stored in an in-memory database (H2).

    Links to source code: [XML]
    
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/basic-jdbc

<br />

* **Basic JDBC with H2**: The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.

    Links to source code: [XML]
    
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/jdbc-h2-console

<br />

* **Default password encoder**: Basic-jdbc example configuring a standard password encoder that uses SHA-256 hashing.

    Links to source code: [XML]
    
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/password-encoder-default

<br />

* **BCrypt password encoder**: The previous basic-jdbc example configuring a password encoder that uses BCrypt hashing 
function in order to encode user credentials before persisting them.

    Links to source code: [XML]
    
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/password-encoder-bcrypt

<br />

* **Remember-me token**: Configures a remember me using a token approach, which sets a cookie in the browser.

    Links to source code: [XML]
    
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/rememberme-token

<br />

* **Remember-me persistent**: Configures a persistent remember me. THis is a more secure version which relies on a database

    Links to source code: [XML]

    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/rememberme-persistent

<br />

* **JDBC full sample**: Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * custom login page
    * encrypted credentials with BCrypt
    * CSRF protection
    * logout feature
    * remember-me feature
    
    <br />
    
    Links to source code: [XML]
    
    [XML]: https://github.com/xpadro/spring-security/tree/master/v3/xml/jdbc
