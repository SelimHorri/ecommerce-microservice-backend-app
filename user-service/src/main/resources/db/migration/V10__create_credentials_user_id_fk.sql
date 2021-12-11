
ALTER TABLE credentials
  ADD CONSTRAINT fk2_assign FOREIGN KEY (user_id) REFERENCES users (user_id);
