
ALTER TABLE order_items
  ADD CONSTRAINT fk9_assign FOREIGN KEY (product_id) REFERENCES products (product_id);
