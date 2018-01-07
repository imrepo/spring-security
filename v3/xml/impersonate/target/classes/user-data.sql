INSERT INTO users (username, password) VALUES
  ('user', 'user'),
  ('admin', 'root');

INSERT INTO authorities (username, authority) VALUES
  ('user', 'ROLE_USER'),
  ('admin', 'ROLE_USER'),
  ('admin', 'ROLE_ADMIN');