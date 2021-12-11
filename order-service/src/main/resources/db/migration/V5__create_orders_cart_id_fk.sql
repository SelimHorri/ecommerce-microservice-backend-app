
ALTER TABLE orders
  ADD CONSTRAINT fk5_assign FOREIGN KEY (cart_id) REFERENCES carts (cart_id);
