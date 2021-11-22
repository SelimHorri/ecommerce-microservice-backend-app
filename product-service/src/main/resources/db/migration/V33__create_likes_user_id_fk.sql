
ALTER TABLE likes
  ADD CONSTRAINT fk11_assign FOREIGN KEY (user_id) REFERENCES users (user_id);
