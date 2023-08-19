CREATE SCHEMA train_yard;

ALTER DATABASE railway SET search_path TO train_yard;

CREATE TABLE train_yard.company(
	id SERIAL NOT NULL,
	name VARCHAR(256),
	PRIMARY KEY(id)
);

CREATE INDEX idx_company_name
ON train_yard.company (name);

CREATE TABLE train_yard.locomotive_type(
	id SERIAL NOT NULL,
	class VARCHAR(256),
	avg_speed DOUBLE PRECISION,
	PRIMARY KEY(id)
);

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE train_yard.locomotive(
 	id BIGSERIAL NOT NULL,
	locomotive_uuid UUID DEFAULT uuid_generate_v4(),
	type_id INT,
	company_id INT,
	name VARCHAR(256),
	PRIMARY KEY(id),
 	CONSTRAINT fk_locomotive_type FOREIGN KEY(type_id) REFERENCES train_yard.locomotive_type(id),
 	CONSTRAINT fk_company FOREIGN KEY(company_id) REFERENCES train_yard.company(id)
 );
