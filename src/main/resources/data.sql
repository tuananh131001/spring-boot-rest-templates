INSERT INTO category (id,is_leaf,name,parent) VALUES  (0,'no','Electronics',null);
INSERT INTO category (id,is_leaf,name,parent) VALUES  (1,'yes','Phone',0);
INSERT INTO category (id,is_leaf,name,parent) VALUES  (2,'yes','Laptop',0);
INSERT INTO product (id, brand_name, description, name, quantity, category_id) VALUES
    (0,'Apple','A phone','Iphone 14',1,1);
INSERT INTO product (id, brand_name, description, name, quantity, category_id) VALUES
    (1,'Apple','A phone','Iphone 14',1,1);
INSERT INTO product (id, brand_name, description, name, quantity, category_id) VALUES
    (2,'Microsoft','A phone','Iphone 12',1,1);
INSERT INTO product (id, brand_name, description, name, quantity, category_id) VALUES
    (3,'ASUS','Laptop','UX410',2,2);

