# Write your MySQL query statement below
select Product.product_name, Sales.year, Sales.price
FROM Sales
join Product on sales.product_id =  product.product_id;