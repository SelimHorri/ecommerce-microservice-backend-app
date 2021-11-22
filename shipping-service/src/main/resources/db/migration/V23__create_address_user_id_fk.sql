
ALTER TABLE address
  ADD CONSTRAINT fk1_assign FOREIGN KEY (user_id) REFERENCES users (user_id);
