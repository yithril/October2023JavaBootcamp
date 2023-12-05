SELECT * 
FROM products
JOIN suppliers ON products.SupplierID = suppliers.SupplierID;

#With aliases to save typing
SELECT * 
FROM products p
JOIN suppliers s ON p.SupplierID = s.SupplierID;

#What if I don't want all the columns, but some of them from each table?
#I want product Name and Unit Price from the products table and I want Company Name and Contact Name from the supplier's table

SELECT products.ProductName, products.UnitPrice, suppliers.CompanyName, suppliers.ContactName
FROM products
JOIN suppliers ON products.SupplierID = suppliers.SupplierID;

#I'd like the company name and phone number, and all the order information for each order
SELECT shippers.CompanyName, shippers.Phone, employees.FirstName, employees.LastName, orders.*
FROM orders
JOIN shippers ON orders.ShipVia = shippers.ShipperID
JOIN employees ON employees.EmployeeID = orders.EmployeeID;



