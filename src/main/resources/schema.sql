CREATE TABLE category (
    id INTEGER,
    is_leaf VARCHAR(255),
    name VARCHAR(255),
    parent INTEGER,
    PRIMARY KEY (id)
);
CREATE TABLE product (
    id INTEGER,
    brand_name VARCHAR(255),
    description VARCHAR(255),
    name VARCHAR(255),
    quantity INTEGER,
    category_id INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES category(id)
);