DROP TABLE IF EXISTS products;

CREATE TABLE products(
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL,
    score SMALLINT,
    image VARCHAR(100)
    );