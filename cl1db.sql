create database cl1;
use cl1;

drop table if exists Articulos;
create table Articulos(
Id CHAR(8) NOT NULL,
Nombre VARCHAR(50) NOT NULL,
Descripcion VARCHAR(50) NOT NULL,
Precio DOUBLE NOT NULL,
Cantidad INT NOT NULL,
Total double NOT NULL,
PRIMARY KEY(Id)
);

insert into Articulos(Id, Nombre, Descripcion, Precio, Cantidad, Total)
values('A0000001','Pc Escritorio','Pc escritorio LG',1500.0,1,1500.0),
('A0000002','Cámara CANNON','Camara Cannon 32 pixeles',600.0,2,1200.0),
('A0000003','Audifonos','Audifonos Sony',120.0,3,360.0);


select*from Articulos;