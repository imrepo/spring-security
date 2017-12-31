spring-security
===============

A Spring Security Repository containing examples on how to implement different functionalities of the framework. 

### Spring Security 3.2 samples
Sometimes you may be working on a client or project where upgrading libraries is not an option. Here you will find some basic examples on how to work with an older version of Spring Security.

Spring version: 3.2.10
Spring Security version: 3.2.10
Java version: 1.7

* [basic-inmemory] - A basic example of a secured application using in-memory defined users (defined in security-context.xml).
* [basic-jdbc] - Modified version of basic-inmemory where users are stored in an in-memory database (H2).
* [jdbc-h2-console] - The previous basic-jdbc example configuring a H2 servlet to enable connecting to the in-memory database.
* [password-encoder-default] - basic-jdbc example configuring a standard password encoder that uses SHA-256 hashing.
* [password-encoder-bcrypt] - basic-jdbc example configuring a password encoder that uses BCrypt hashing function.


   [basic-inmemory]: https://github.com/xpadro/spring-integration/tree/master/unexisting
   [basic-jdbc]: https://github.com/xpadro/spring-integration/tree/master/unexisting
   [jdbc-h2-console]: https://github.com/xpadro/spring-integration/tree/master/unexisting
   [password-encoder-default]: https://github.com/xpadro/spring-integration/tree/master/unexisting
   [password-encoder-bcrypt]: https://github.com/xpadro/spring-integration/tree/master/unexisting