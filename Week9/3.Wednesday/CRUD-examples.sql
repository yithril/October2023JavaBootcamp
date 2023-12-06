SELECT * FROM northwind.products;

SELECT * FROM suppliers;
SELECT * FROM categories;

#CRUD 

#CREATE
INSERT INTO products(ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES('Pluots', 30, 7, '1 piece of fruit', 30, 50, 10, 0, 0); 

#Update
UPDATE products
SET UnitsInStock = 80, UnitsOnOrder = 20
WHERE ProductID = 84;

#Delete
DELETE 
FROM products
WHERE ProductID = 84;

CREATE TABLE pokemon(
	PokemonID INT AUTO_INCREMENT,
    MoveSet VARCHAR(100) NOT NULL,
    Type VARCHAR(10) NOT NULL,
    Name VARCHAR(50) NOT NULL,
    Hp INT NOT NULL,
    Weaknesses VARCHAR(100) NOT NULL,
    PRIMARY KEY (PokemonID)
);

ALTER TABLE pokemon
ADD Location VARCHAR(50) NOT NULL;

ALTER TABLE pokemon
DROP COLUMN Location;

CREATE TABLE Author(
	AuthorID INT AUTO_INCREMENT,
    AuthorName VARCHAR(100),
    PRIMARY KEY (AuthorID)
);

CREATE TABLE books(
	BookID INT AUTO_INCREMENT,
    BookTitle VARCHAR(255),
    AuthorID INT,
    PRIMARY KEY (BookID),
    FOREIGN KEY (AuthorID) REFERENCES author(AuthorID)
);

INSERT INTO author(AuthorName)
VALUES('Isaac Asimov');

INSERT INTO books(BookTitle, AuthorID)
VALUES('Foundations End', 1);




