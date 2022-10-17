INSERT INTO category (id,name,parent,is_leaf) VALUES (1,'electronic',NULL,'no');
INSERT INTO category (id,name,parent,is_leaf) VALUES (2,'laptop',1,'no');
INSERT INTO category (id,name,parent,is_leaf) VALUES (3,'mac',2,'yes');
INSERT INTO product (id, name, brand_name, description, quantity, category_id)
VALUES (nextval('hibernate_sequence'), 'iphone', 'Apple', 'expensive phone', 2, 1);
INSERT INTO product (id, name, brand_name, description, quantity, category_id)
VALUES (nextval('hibernate_sequence'), 'UX410', 'ASus', 'expensive laptop', 1, 2);
INSERT INTO product (id, name, brand_name, description, quantity, category_id)
VALUES (nextval('hibernate_sequence'), 'Macbook Air', 'Apple', 'very thin', 5, 3);
INSERT INTO product (id, name, brand_name, description, quantity, category_id)
VALUES (nextval('hibernate_sequence'), 'Macbook pro', 'Apple', 'expensive laptop', 5, 3);