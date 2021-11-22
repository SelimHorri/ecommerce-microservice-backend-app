
CREATE TABLE products (
	product_id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	category_id INT(11),
	product_title VARCHAR(255),
	image_url VARCHAR(255),
	sku VARCHAR(255),
	price_unit DECIMAL(7, 2),
	quantity INT(11),
	created_at TIMESTAMP DEFAULT LOCALTIMESTAMP NOT NULL NULL_TO_DEFAULT,
	updated_at TIMESTAMP
);

