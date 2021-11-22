
ALTER TABLE categories
  ADD CONSTRAINT fk7_assign FOREIGN KEY (sub_category_id) REFERENCES categories (category_id);
