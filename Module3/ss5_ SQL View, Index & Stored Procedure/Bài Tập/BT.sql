CREATE DATABASE demo;
USE demo;
CREATE TABLE products (
id int,
product_code CHAR(5),
product_name VARCHAR(255),
product_price DOUBLE,
product_amount INT,
product_description VARCHAR(255),
product_satus VARCHAR(255),
PRIMARY KEY(id)
);
INSERT INTO products VALUES 
(1,"VN-12","Bánh mì",20000,2,"Bánh Mì Thịt Quay","Làm xong"),
(2,"VN-23","Bánh mì",15000,1,"thịt chả","Làm xong"),
(3,"VN-34","Bánh mì",17000,2,"Chả trứng ốp la","Đang làm"),
(4,"VN-45","Bánh mì",30000,4,"Bò hầm ngũ quả","Đang làm");


CREATE UNIQUE INDEX demo_index ON products(product_code);
CREATE INDEX composite ON products(product_name,product_code);
SELECT product_name,product_code FROM products;
EXPLAIN SELECT * FROM products;
CREATE VIEW product_view AS SELECT product_code,product_name,product_price,product_satus FROM products;
SELECT * FROM product_view;
UPDATE product_view
SET product_price = 20000 , product_code = "VN-67",product_satus = "Chưa làm xong"
WHERE product_name = "Bánh mì";
DROP VIEW product_view;
DELIMITER //
CREATE PROCEDURE procedure_products()
BEGIN
SELECT * FROM 
products;
END //
DELIMITER  ;
CALL procedure_products();

DELIMITER //
CREATE PROCEDURE add_products(
id INT,
product_code VARCHAR(50),
product_name VARCHAR(50),
product_price INT,
product_amount INT,
product_description VARCHAR(50),
product_status VARCHAR(255))
BEGIN
INSERT INTO products values(id,product_code,product_name,product_price,product_amount,product_description,product_satus);
END //
DELIMITER //
CALL add_products(7,"VN-56","Bánh mì",50000,4,"Thập cẩm đặc biệt","Đang nấu");

DELIMITER //
CREATE PROCEDURE delete_product(product_id INT)
BEGIN
DELETE FROM products WHERE id = product_id;
END //
DELIMITER //
CALL delete_product(5);
