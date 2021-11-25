
ALTER TABLE carts
  ADD CONSTRAINT fk4_assign FOREIGN KEY (user_id) REFERENCES users (user_id);
