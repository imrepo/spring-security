INSERT INTO users (username, password) VALUES
  ('user', '$2a$10$jVdfbaWsOQWCYjm9YeXd6u52xMbXkSDYa.ySxxe7/CiuO4dEd4PG2'), /* user */
  ('admin', '$2a$10$8AOdKr9ltY21YVNPjwqqiuZdtG2WurPMtxWJkr8Lan4ZIo6yTIXly'); /* root */

INSERT INTO authorities (username, authority) VALUES
  ('user', 'ROLE_USER'),
  ('admin', 'ROLE_USER'),
  ('admin', 'ROLE_ADMIN');