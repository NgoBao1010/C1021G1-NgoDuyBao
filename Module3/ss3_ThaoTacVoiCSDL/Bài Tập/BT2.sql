USE quan_ly_ban_hang;
INSERT INTO customer VALUES (1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha",50);

INSERT INTO orders(o_id,c_id,o_date,o_total_price) VALUES
 (1,1,"2006-3-21",null),
 (2,2,"2006-3-23",null),
 (3,1,"2006-3-16",null);
 SELECT * FROM orders;
 INSERT INTO product(p_id,p_name,p_price) VALUES (1,"May Giat",3), (2,"Tu Lanh",5),(3,"Dieu Hoa",7),(4,"Quat",1),(5,"Bep Dien",2);
 SELECT * FROM product;
 INSERT INTO order_detail(o_id,p_id,od_qty) VALUES (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
 SELECT * FROM order_detail;
 SELECT o_id,o_date,o_total_price FROM orders;

 SELECT  customer.c_name, GROUP_CONCAT(product.p_name) AS "Array product" FROM customer
 INNER JOIN orders on customer.c_id = orders.c_id 
 INNER JOIN order_detail on orders.o_id = order_detail.o_id 
 INNER JOIN product  on order_detail.p_id = product.p_id 
 GROUP BY customer.c_name;
 
 
  SELECT  customer.c_name,product.p_name,order_detail.od_qty FROM customer
 LEFT JOIN orders on  customer.c_id = orders.c_id 
 LEFT JOIN order_detail on  orders.o_id = order_detail.o_id 
 LEFT JOIN product  on  order_detail.p_id = product.p_id 
 WHERE order_detail.od_qty IS NULL;
 
SELECT order_detail.o_id,orders.o_date,SUM(order_detail.od_qty * product.p_price) AS "toltal pirce" FROM
customer INNER JOIN orders on customer.c_id = orders.c_id 
INNER JOIN order_detail on order_detail.o_id = orders.o_id 
INNER JOIN product on product.p_id = order_detail.p_id
GROUP BY order_detail.o_id;