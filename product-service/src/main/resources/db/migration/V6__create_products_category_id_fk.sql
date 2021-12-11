
ALTER TABLE products
  ADD CONSTRAINT fk8_assign FOREIGN KEY (category_id) REFERENCES categories (category_id);
