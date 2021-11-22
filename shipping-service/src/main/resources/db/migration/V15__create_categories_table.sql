
CREATE TABLE categories (
	category_id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	sub_category_id INT(11),
	category_title VARCHAR(255),
	image_url VARCHAR(255),
	created_at TIMESTAMP DEFAULT LOCALTIMESTAMP NOT NULL NULL_TO_DEFAULT,
	updated_at TIMESTAMP
);

