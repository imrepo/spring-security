INSERT INTO users (username, password) VALUES
  ('user', '04f8996da763b7a969b1028ee3007569eaf3a635486ddab211d512c85b9df8fb'), /* user */
  ('admin', '4813494d137e1631bba301d5acab6e7bb7aa74ce1185d456565ef51d737677b2'); /* root */

INSERT INTO authorities (username, authority) VALUES
  ('user', 'ROLE_USER'),
  ('admin', 'ROLE_USER'),
  ('admin', 'ROLE_ADMIN');