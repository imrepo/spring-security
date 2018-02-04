spring-security
===============

This repository contains examples on how to implement different functionalities with the Spring Security framework. 
<br />

### Spring Security 4.x

Spring version: 4.3.14.RELEASE <br />
Spring Security version: 4.2.4.RELEASE <br />
Java version: 1.8

<br />

JavaConfig samples:

* [v4-basic-inmemory] - The most basic example of a secured application. Users are defined in-memory in the security 
configuration. Secured paths are 'home' and 'admin' which are available depending on the user role.
* [v4-basic-jdbc] - Modified version of basic-inmemory where users are stored in an in-memory database (H2).
* [v4-jdbc-h2-console] - The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.
* [v4-password-encoder-bcrypt] - The previous basic-jdbc example configuring a password encoder that uses BCrypt hashing 
function in order to encode user credentials before persisting them.
* [v4-rememberme-token] - Configures a remember me using a token approach, which sets a cookie in the browser.
* [v4-rememberme-persistent] - Configures a persistent remember me. THis is a more secure version which relies on a database
* [v4-jdbc] - Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * custom login page
    * encrypted credentials with BCrypt
    * CSRF protection
    * logout feature
    * remember-me feature

   [v4-basic-inmemory]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-inmemory
   [v4-basic-jdbc]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-basic-jdbc
   [v4-jdbc-h2-console]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-jdbc-h2-console
   [v4-password-encoder-bcrypt]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-password-encoder-bcrypt
   [v4-rememberme-token]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-rememberme-token
   [v4-rememberme-persistent]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-rememberme-persistent
   [v4-jdbc]: https://github.com/xpadro/spring-security/tree/master/v4/javaconfig/v4-jdbc

<br/>

### Spring Security 3.x

Spring version: 3.2.10.RELEASE <br />
Spring Security version: 3.2.10.RELEASE <br />
Java version: 1.7

<br />

XML samples:

* [basic-inmemory] - The most basic example of a secured application. Users are defined in-memory in the security 
configuration. Secured paths are 'home' and 'admin' which are available depending on the user role.
* [basic-jdbc] - Modified version of basic-inmemory where users are stored in an in-memory database (H2).
* [jdbc-h2-console] - The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.
* [password-encoder-default] - basic-jdbc example configuring a standard password encoder that uses SHA-256 hashing.
* [password-encoder-bcrypt] - The previous basic-jdbc example configuring a password encoder that uses BCrypt hashing function
 in order to encode user credentials before persisting them.
* [rememberme-token] - Configures a remember me using a token approach, which sets a cookie in the browser.
* [rememberme-persistent] - Configures a persistent remember me. THis is a more secure version which relies on a database
* [jdbc] - Complete example covering the basic features of a secured application, described below:
    * user details backed up by an in-memory database (H2)
    * custom login page
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