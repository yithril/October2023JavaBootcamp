#Sum of all employees salaries
SELECT SUM(Salary)
FROM employees;

#5.	What is the price of the most expensive item that Northwind sells?  
SELECT MAX(UnitPrice)
FROM products;

/*
7.	What is the category ID of each category and the average price of each item in the category?  You can answer this query by only looking at the Products table.
*/

SELECT CategoryID, AVG(UnitPrice) as avg_price
FROM products
GROUP BY CategoryID;

SELECT * FROM products
WHERE SupplierID = 3;

/*
8.	For suppliers that provide at least 5 items to Northwind, what is the supplier ID of each supplier and the number of items they supply?  You can answer this query by only looking at the Products table.
*/
SELECT COUNT(*) as qty_per_unit, SupplierID
FROM products
GROUP BY SupplierID
HAVING qty_per_unit >= 5;

SELECT * FROM products;

/*
9.	List the product id, product name, and inventory value (calculated by multiplying unit price by the number of units on hand).  
Sort the results in descending order by value.  If two or more have the same value, order by product name.
*/

SELECT ProductID, ProductName, UnitsInStock * UnitPrice AS inventory_value
FROM products
ORDER BY inventory_value DESC, ProductName;