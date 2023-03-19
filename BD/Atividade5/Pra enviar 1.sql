CREATE DATABASE Exemplo_Select;

use Exemplo_Select;

CREATE TABLE Categoria(
Cod_Categoria int,
Nome_Categoria varchar(15) NOT NULL,
Descricao varchar(25) NULL,
PRIMARY KEY (Cod_Categoria)
 );

INSERT into categoria VALUES (
(1,'Beverages','Soft drinks'),

(2,'Condiments','Sweet and savory sauces'),

(3,'Confections','candies'),

(4,'Dairy Products','Cheeses'),

(5,'Grains/Cereals','cereal'),

(6,'Meat/Poultry','Prepared meats'),

(7,'Produce','Dried fruit and bean curd'),

(8,'Seafood','Seaweed and fish'));

select * from categoria;

delete from categoria where Descricao ='Cheeses';

delete from categoria where Descricao  like 'S%';

delete from categoria where Nome_Categoria like  "%a%";

delete from categoria;