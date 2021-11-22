
ALTER TABLE verification_tokens
  ADD CONSTRAINT fk3_assign FOREIGN KEY (credential_id) REFERENCES credentials (credential_id);
