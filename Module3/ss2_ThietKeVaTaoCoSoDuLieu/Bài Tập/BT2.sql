USE quan_ly_ban_hang;
CREATE TABLE customer (
c_id INT PRIMARY KEY,
c_name VARCHAR(255) NOT NULL,
c_age INT NOT NULL
);
CREATE TABLE orders (
o_id INT PRIMARY KEY,
c_id INT,
o_date DATETIME,
o_total_price DOUBLE NOT NULL,
FOREIGN KEY (c_id) REFERENCES customer(c_id)
);
CREATE TABLE product (
p_id INT PRIMARY KEY,
p_name VARCHAR(255),
p_price DOUBLE
);
CREATE TABLE order_detail (
o_id INT,
p_id INT,
od_qty INT,
PRIMARY KEY(o_id,p_id),
FOREIGN KEY (o_id) REFERENCES orders(o_id),
FOREIGN KEY (p_id) REFERENCES product(p_id)
);