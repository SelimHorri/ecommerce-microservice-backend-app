
CREATE TABLE credentials (
	credential_id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	user_id INT(11),
	username VARCHAR(255),
	password VARCHAR(255),
	role VARCHAR(255),
	is_enabled BOOLEAN DEFAULT false,
	is_account_non_expired BOOLEAN DEFAULT true,
	is_account_non_locked BOOLEAN DEFAULT true,
	is_credentials_non_expired BOOLEAN DEFAULT true,
	created_at TIMESTAMP DEFAULT LOCALTIMESTAMP NOT NULL NULL_TO_DEFAULT,
	updated_at TIMESTAMP
);

