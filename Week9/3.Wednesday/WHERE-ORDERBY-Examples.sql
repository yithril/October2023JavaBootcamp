SELECT ProductID, ProductName, UnitPrice
FROM products;

SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice;

SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice < 7.5;

/*
What are the products that we carry where we have at least 100 units on hand?  Order them in descending order by price. 
*/
SELECT *
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

/*
What are the products that we carry where we have at least 100 units on hand?  Order them in descending order by price.   
If two or more have the same price, list those in ascending order by product name.
*/
SELECT *
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice, ProductName DESC;

/*
What are the products that we carry where we have no units on hand, but 1 or more units of them on backorder?  Order them by product name.
*/
SELECT *
FROM products
WHERE UnitsInStock = 0 AND UnitsOnOrder >= 1
ORDER BY ProductName;

/*
Write a query that lists all of the columns and all of the rows of the categories table?  What is the category id of seafood?
*/
SELECT * 
FROM categories;



