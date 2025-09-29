DROP DATABASE IF EXISTS Currency;
CREATE DATABASE Currency;
USE Currency;
CREATE TABLE Currency_Converter (
	 id INT NOT NULL AUTO_INCREMENT,
    code VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
    rateToUSD DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO Currency_Converter (code, name, rateToUSD) VALUES
    ('E', 'Euro', 0.85),
    ('Birr', 'Eth Birr', 158),
    ('Pound', 'Pound', 0.90);

CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE ON Currency_converter.* TO 'appuser'@'localhost';