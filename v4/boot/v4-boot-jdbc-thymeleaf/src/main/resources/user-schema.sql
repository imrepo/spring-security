DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS user_roles;

CREATE TABLE users (
  username varchar_ignorecase(50) NOT NULL PRIMARY KEY,
  password varchar_ignorecase(100) NOT NULL,
  enabled BOOLEAN NOT NULL DEFAULT TRUE
);

-- User Roles
CREATE TABLE authorities (
  username varchar_ignorecase(50) NOT NULL,
  authority varchar_ignorecase(50) NOT NULL,
  CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users (username)
);

CREATE UNIQUE INDEX ix_auth_username on authorities (username, authority);

create table persistent_logins (
       username varchar_ignorecase(100) not null,
       series varchar(64) primary key,
       token varchar(64) not null,
       last_used timestamp not null
);