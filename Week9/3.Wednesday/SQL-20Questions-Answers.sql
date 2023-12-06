#1
SELECT * FROM Customers WHERE Country = 'UK';

#2
SELECT ProductName, UnitPrice FROM Products WHERE UnitPrice > 30;

#3
SELECT COUNT(*) FROM Products WHERE Discontinued = 1;

#4
SELECT AVG(UnitPrice) AS AveragePrice, MAX(UnitPrice) AS MaxPrice, MIN(UnitPrice) AS MinPrice FROM Products;

#5
SELECT c.CategoryName, COUNT(p.ProductID) AS ProductCount
FROM Categories c
JOIN Products p ON c.CategoryID = p.CategoryID
GROUP BY c.CategoryName;

#6
SELECT SupplierID, CompanyName FROM Suppliers WHERE Country NOT IN ('USA', 'Germany', 'UK');

#7
SELECT DISTINCT Country FROM Customers;

#8
SELECT ProductName, UnitPrice FROM Products ORDER BY UnitPrice DESC LIMIT 5;

#9
SELECT o.OrderID, SUM(od.UnitPrice * od.Quantity) AS TotalRevenue
FROM Orders o
JOIN Order_Details od ON o.OrderID = od.OrderID
GROUP BY o.OrderID;

#10
SELECT e.FirstName, e.LastName, COUNT(o.OrderID) AS OrderCount
FROM Employees e
JOIN Orders o ON e.EmployeeID = o.EmployeeID
GROUP BY e.EmployeeID;

#11
SELECT c.CustomerID, c.CompanyName
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID
HAVING COUNT(o.OrderID) > 10;

#12
SELECT ProductName FROM Products WHERE UnitsInStock = 0;

#13
SELECT p.ProductName, c.CategoryName
FROM Products p
JOIN Categories c ON p.CategoryID = c.CategoryID
WHERE c.CategoryName IN ('Beverage', 'Confections');

#14
SELECT s.SupplierID, s.CompanyName, COUNT(p.ProductID) AS NumberOfProducts
FROM Suppliers s
JOIN Products p ON s.SupplierID = p.SupplierID
GROUP BY s.SupplierID
ORDER BY NumberOfProducts DESC
LIMIT 1;

#15
SELECT p.ProductID, p.ProductName
FROM Products p
LEFT JOIN Order_Details od ON p.ProductID = od.ProductID
WHERE od.ProductID IS NULL;

#16
SELECT OrderID FROM Orders WHERE OrderDate BETWEEN '1997-12-01' AND '1997-12-31';

#17
SELECT e.EmployeeID, e.FirstName, e.LastName, COUNT(o.OrderID) AS OrderCount
FROM Employees e
JOIN Orders o ON e.EmployeeID = o.EmployeeID
WHERE YEAR(o.OrderDate) = 1998
GROUP BY e.EmployeeID
ORDER BY OrderCount DESC
LIMIT 1;

#18
SELECT c.CustomerID, c.CompanyName, SUM(od.Quantity) AS TotalQuantity
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
JOIN Order_Details od ON o.OrderID = od.OrderID
GROUP BY c.CustomerID
ORDER BY TotalQuantity DESC
LIMIT 1;

#19
SELECT s.ShipperID, s.CompanyName, COUNT(o.OrderID) AS DeliveryCount
FROM Shippers s
JOIN Orders o ON s.ShipperID = o.ShipVia
GROUP BY s.ShipperID
ORDER BY DeliveryCount DESC
LIMIT 1;

#20
SELECT c.CategoryName, COUNT(p.ProductID) AS NumberOfProducts
FROM Categories c
JOIN Products p ON c.CategoryID = p.CategoryID
GROUP BY c.CategoryID
ORDER BY NumberOfProducts DESC
LIMIT 3;




