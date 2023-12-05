SELECT * FROM northwind.orders
ORDER BY ShipCountry;

#AVG, SUM, MIN, MAX, COUNT
#Aggregate Functions

#How much on average do we spend on freight?
SELECT AVG(Freight) AS Average_Freight
FROM orders;

#How much total did we spend on freight in 1996?
SELECT SUM(Freight)
FROM orders
WHERE OrderDate >= '1996-01-01' AND OrderDate <= '1996-12-31';

#What is the most we've ever spent on freight?
SELECT MAX(Freight)
FROM orders;

#What is the least we've ever spent on freight?
SELECT MIN(Freight)
FROM orders;

#How many orders were shipped to Germany?
SELECT COUNT(*)
FROM orders
WHERE ShipCountry = 'Germany';

#I want to see the average freight broken down by country
SELECT AVG(Freight) AS avg_freight, ShipCountry
FROM orders
GROUP BY ShipCountry
ORDER BY avg_freight;

#I want to see the average freight broken down by country, but only if its over 50
SELECT AVG(Freight) AS avg_freight, ShipCountry
FROM orders
GROUP BY ShipCountry
HAVING avg_freight > 50
ORDER BY avg_freight;


