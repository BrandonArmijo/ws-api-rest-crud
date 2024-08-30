create database bdProducto;

use bdProducto;

create table producto(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  precio DECIMAL(10,2) NOT NULL,
  stock INT NOT NULL
);

insert into producto (nombre,precio,stock) values ('Fideo Lavaggi',3.10,50);
insert into producto (nombre,precio,stock) values ('Jabon Dove',3.80,30);
insert into producto (nombre,precio,stock) values ('Shampoo Pantene',15,20);
insert into producto (nombre,precio,stock) values ('Lavavajilla Sapolio',1.50,10);
insert into producto (nombre,precio,stock) values ('PS5 con ranura',3000,1);