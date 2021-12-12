
ALTER TABLE categories
  ADD CONSTRAINT fk7_assign FOREIGN KEY (parent_category_id) REFERENCES categories (category_id);
