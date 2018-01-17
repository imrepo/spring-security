spring-security
===============

This repository contains examples on how to implement different functionalities with the Spring Security framework. 
<br />

### Spring Security 4.x

Spring version: 4.2.3 <br />
Spring Security version: 4.2.3 <br />
Java version: 1.8

<br />

JavaConfig samples:

* [v4-basic-inmemory] - A basic example of a secured application using in-memory defined users

   [v4-basic-inmemory]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-inmemory  

<br/>

### Spring Security 3.x
Sometimes you may be working on a client or project where upgrading libraries is not an option. Here you will find some basic examples on how to work with an older version of Spring Security.

Spring version: 3.2.10 <br />
Spring Security version: 3.2.10 <br />
Java version: 1.7

<br />

XML samples:

* [basic-inmemory] - A basic example of a secured application using in-memory defined users (defined in security-context.xml).
* [basic-jdbc] - Modified version of basic-inmemory where users are stored in an in-memory database (H2).
* [jdbc-h2-console] - The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.
* [password-encoder-default] - basic-jdbc example configuring a standard password encoder that uses SHA-256 hashing.
* [password-encoder-bcrypt] - basic-jdbc example configuring a password encoder that uses BCrypt hashing function.
* [rememberme-token] - Configures a remember me using a token approach
* [rememberme-persistent] - Configures a persistent remember me relying on a database
* [jdbc] - Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * encrypted credentials with BCrypt
    * CSRF protection
    * logout feature
    * remember-me feature


   [basic-inmemory]: https://github.com/xpadro/spring-security/tree/master/v3/xml/basic-inmemory
   [basic-jdbc]: https://github.com/xpadro/spring-security/tree/master/v3/xml/basic-jdbc
   [jdbc-h2-console]: https://github.com/xpadro/spring-security/tree/master/v3/xml/jdbc-h2-console
   [password-encoder-default]: https://github.com/xpadro/spring-security/tree/master/v3/xml/password-encoder-default
   [password-encoder-bcrypt]: https://github.com/xpadro/spring-security/tree/master/v3/xml/password-encoder-bcrypt
   [rememberme-token]: https://github.com/xpadro/spring-security/tree/master/v3/xml/rememberme-token
   [rememberme-persistent]: https://github.com/xpadro/spring-security/tree/master/v3/xml/rememberme-persistent
   [jdbc]: https://github.com/xpadro/spring-security/tree/master/v3/xml/jdbc