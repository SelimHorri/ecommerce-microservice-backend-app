
ALTER TABLE order_items
  ADD CONSTRAINT fk10_assign FOREIGN KEY (order_id) REFERENCES orders (order_id);
