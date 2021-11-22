
ALTER TABLE payments
  ADD CONSTRAINT fk6_assign FOREIGN KEY (order_id) REFERENCES orders (order_id);
