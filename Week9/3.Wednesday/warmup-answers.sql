#Join Question 1: Write a query to display the order ID, order date, and company name of each customer. Join the Orders table with the Customers table.

SELECT orderID, orderDate, CompanyName
FROM orders
JOIN customers ON orders.CustomerID = customers.CustomerID;

#Join Question 2: Create a query to list all products (product name) and their respective categories (category name). Use a join between the Products table and the Categories table.

SELECT products.ProductName, categories.CategoryName
FROM products
JOIN categories ON products.CategoryID = categories.CategoryID;

#Subquery Question 1: Find the names of the customers who have placed orders with a total value greater than the average total value of all orders. Use a subquery in the Orders table.

SELECT DISTINCT c.ContactName, TotalValue
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
JOIN (SELECT orderID, SUM(UnitPrice * Quantity) as TotalValue
	  FROM `Order Details`
	  GROUP BY OrderID)
      as od ON o.OrderID = od.OrderID
WHERE od.TotalValue > (
	SELECT AVG(TotalValue)
    FROM (
		SELECT OrderID, SUM(UnitPrice * Quantity) as TotalValue
        FROM `Order Details`
        GROUP BY OrderID
    ) as avgOrderValues
);

#Subquery Question 2: Write a query to list the names of the products that have never been ordered. Use a subquery with the Products table and the Order_Details table.
SELECT p.ProductName
FROM Products p
WHERE p.ProductID NOT IN (
    SELECT DISTINCT od.ProductID
    FROM `Order Details` od
);

/*
Challenge Question: Display the product name, supplier name, and category name for all products that have a unit price higher than the average unit price of their respective category. 
This query will require joins between the Products, Suppliers, and Categories tables, and a subquery to calculate the average price per category.
*/

SELECT 
    p.ProductName, 
    s.CompanyName AS SupplierName, 
    c.CategoryName, 
    p.UnitPrice
FROM 
    Products p
JOIN 
    Suppliers s ON p.SupplierID = s.SupplierID
JOIN 
    Categories c ON p.CategoryID = c.CategoryID
WHERE 
    p.UnitPrice > (
        SELECT AVG(UnitPrice)
        FROM Products
        WHERE CategoryID = p.CategoryID
    );
