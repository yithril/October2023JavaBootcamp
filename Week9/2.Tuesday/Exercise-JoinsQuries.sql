/*
1.	List the product id, product name, unit price and category name of all products.  Order by category name and within that, by product name.
*/
SELECT products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName
FROM products
JOIN categories ON products.CategoryID = categories.CategoryID
ORDER BY categories.CategoryName, products.ProductName;

/*
2.	List the product id, product name, unit price and supplier name of all products that cost more than $75.  Order by product name.
*/
SELECT products.ProductID, products.ProductName, products.UnitPrice, suppliers.CompanyName
FROM products
JOIN suppliers ON suppliers.SupplierID = products.SupplierID
WHERE products.UnitPrice > 75
ORDER BY products.ProductName;

/*
5.	List the order id, ship name, ship address, and shipping company name of every order that shipped to Germany.
*/
SELECT orders.OrderID, orders.ShipName, orders.ShipAddress, shippers.CompanyName
FROM orders
JOIN shippers ON orders.ShipVia = shippers.ShipperID
WHERE orders.ShipCountry = 'Germany';

/*
6.	List the order id, order date, ship name, ship address of all orders that ordered "Sasquatch Ale"? 
*/
SELECT orders.OrderID, orders.OrderDate, orders.ShipName, orders.ShipAddress
FROM orders 
JOIN `order details` ON orders.OrderID = `order details`.OrderID
WHERE `order details`.ProductID = (SELECT ProductID FROM products WHERE ProductName = 'Sasquatch Ale');


