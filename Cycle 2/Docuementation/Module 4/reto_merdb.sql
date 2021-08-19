CREATE DATABASE reto_mer;
USE reto_mer;
CREATE TABLE tb_categoria(
   id_categoria INT AUTO_INCREMENT,
   categoria VARCHAR(45) NOT NULL,
   descripcion VARCHAR(45) NOT NULL,
   PRIMARY KEY(id_categoria) );

-- Create customer's phone table
CREATE TABLE tb_tel_cliente(
  id_tel_cliente INT AUTO_INCREMENT,
  tel_1 VARCHAR(45),
  tel_2 VARCHAR(45) null,
  tel_3 VARCHAR(45) null,
  PRIMARY KEY(id_tel_cliente)
);

--- Create address's TABLE
CREATE TABLE tb_direccion(
	id_direccion INT AUTO_INCREMENT,
    calle VARCHAR(45) NOT NULL,
    carrera VARCHAR(45) NOT NULL,
    numero VARCHAR(45) NOT NULL,
    barrio VARCHAR(45) NOT NULL,
    ciudad VARCHAR(45) NOT NULL,
    PRIMARY KEY(id_direccion)
);
-- Create proveedores table
CREATE TABLE tb_proveedores(
	id_proveedores INT AUTO_INCREMENT,
  id_direccion INT,
    nit VARCHAR(45) NOT NULL,
    razon_social VARCHAR(45) NOT NULL,
    telefono VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    representante_legal VARCHAR(45) NOT NULL,
    sitio_web VARCHAR(45) NOT NULL,
    PRIMARY KEY(id_proveedores),
    FOREIGN KEY(id_direccion) REFERENCES tb_direccion(id_direccion)
);

-- Create product's table
CREATE TABLE tb_producto(
	id_producto INT AUTO_INCREMENT,
  id_categoria INT,
    id_proveedores INT,
    precio_actual DECIMAL(10,2) NOT NULL,
    existencia INT,
    PRIMARY KEY(id_producto),
    FOREIGN KEY(id_categoria) REFERENCES tb_categoria(id_categoria),
    FOREIGN KEY(id_proveedores) REFERENCES tb_proveedores(id_proveedores)
);
-- Create customer table
CREATE TABLE tb_cliente(
	id_cliente INT AUTO_INCREMENT,
  id_tel_cliente INT,
    id_direccion INT,
    documento VARCHAR(45) NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    apellidos VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    PRIMARY KEY(id_cliente),
    FOREIGN KEY(id_tel_cliente) REFERENCES tb_cliente(id_cliente),
    FOREIGN KEY(id_direccion) REFERENCES tb_direccion(id_direccion)
);
-- Create selling table
CREATE TABLE tb_venta(
	id_venta INT AUTO_INCREMENT,
  id_cliente INT,
    id_producto INT,
    descuento DECIMAL(10,2),
    total_venta DECIMAL(10,2),
    PRIMARY KEY(id_venta),
    FOREIGN KEY(id_cliente) REFERENCES tb_cliente(id_cliente),
    FOREIGN KEY(id_producto) REFERENCES tb_producto(id_producto)
);

-- INSERT VALUES

INSERT INTO tb_categoria(nombre, descripcion)
VALUES ('vegetales','producto perecedero' )
('Frutas','producto perecederos saludable' ),
('mecato','productos altos en azucar y grasas'),
('gaseosa', 'bebidas con gas y alta en azucar'),
('enlatado','producto en envase metalico y de larga duracion');

-- Insert addresses for both, customers and suppliers
INSERT INTO tb_direccion(calle, carrera, numero, barrio, ciudad) VALUES
('Brockton Avenue','8','30', 'Abington', 'California'),
('Memorial Drive','87','77', 'Brockton', 'Boston'),
('Brockton Avenue','8','12', 'Parkhurst Rd', 'Salem'),
('Brockton Avenue','8','987', ' Brooksby Village Way', 'New york'),
('Brockton Avenue','74','717', 'Russell St', 'seattle');
('Plymouth Street','03','30', 'Abington', 'Austin'),
('Jungle Road','01','77', 'Framingham', 'Phoenix'),
('Curran Memorial','54','12', 'North Adams', 'Atlanta'),
('Otis Street','74','987', ' Brooksby Village Way', 'Cleveland'),
('North King Street','41','717', 'Russell St', 'Buffalo');

-- Insert suppliers
INSERT INTO tb_proveedores(nit, razon_social, telefono, email,
            representante_legal, sitio_web, id_direccion) VALUES
("123.456", "Trader Joe's", "444-444", "traderjoe@example.com","traderjoe.com","Hugo First",1),
("234.3565", "Publix", "222-334","publix@example.com","publix.com","Aida Bugg",2),
("543.323", "Aldi", "177-454","aldi@example.com","aldi.com","Ray Sin",3),
("003.123", "Costco", "412-074","costco@example.com","costco.com","Rod Knee",4),
("003.123", "Meijer", "212-074","meijer@example.com","meijer.com","Col Fays",5);

-- Inser productos

INSERT INTO tb_producto(precio_actual, existencia, id_categoria, id_proveedores)
VALUES (10.99, 200, 1, 1),
(8.99, 12, 2, 2),
(4.43, 51, 3, 3),
(2.99, 32, 3, 3),
(1.99, 54, 3, 3);

-- Insert Customer's phone
INSERT INTO tb_tel_cliente(tel_1, tel_2) VALUES
("754-3010","636-48018"),
("454-3010","567-4322"),
("754-3010","412-1030"),
("462-3010","423-3742"),
("201-3460","543-6543");

-- Insert customer's information

INSERT INTO tb_cliente(documento, nombre, apellidos, email, id_tel_cliente,
            id_direccion)
VALUES ("1032154","Augusta", "Wind","augusta.wind@example.com",1, 6),
("2300321","Harriet", "Upp","harriet.upp@example.com",2, 7),
("9745213","Peter", "Owt","peter.owt@example.com",3, 8),
("4442154","Greg", "Daway","greg.daway@example.com",4, 9),
("5416544","Rose", "Bush","rose.bush@example.com",5, 10);

-- Insert values in id_venta
INSERT INTO tb_venta(fecha, descuento, total_venta, id_cliente, id_producto) VALUES
('2021-01-24', 0.0, 10.50, 1, 1),
('2021-05-01', 0.59, 11.50, 2, 2),
('2021-02-14', 0.99, 9.99, 5, 2),
('2021-06-24', 0.0, 10.50, 3, 4),
('2021-02-09', 0.5, 4.50, 1, 5),
('2021-03-05', 0.5, 5.50, 1, 3),
('2021-03-18', 0.5, 6.50, 3, 1),
('2021-05-30', 1.0, 8.50, 4, 4);

-- READ

--- Consultar las direcciones de los clente y mostrarlas con los nomnbres

SELECT tb_cliente.nombre, tb_direccion.calle, tb_direccion.carrera,
tb_direccion.numero, tb_direccion.barrio, tb_direccion.ciudad
FROM tb_cliente
INNER JOIN tb_direccion ON tb_cliente.id_direccion= tb_direccion.id_direccion;
/*++---------+-------------------+---------+--------+-----------------------+-----------+
| nombre  | calle             | carrera | numero | barrio                | ciudad    |
+---------+-------------------+---------+--------+-----------------------+-----------+
| Augusta | Plymouth Street   | 03      | 30     | Abington              | Austin    |
| Harriet | Jungle Road       | 01      | 77     | Framingham            | Phoenix   |
| Peter   | Curran Memorial   | 54      | 12     | North Adams           | Atlanta   |
| Greg    | Otis Street       | 74      | 987    |  Brooksby Village Way | Cleveland |
| Rose    | North King Street | 41      | 717    | Russell St            | Buffalo   |
+---------+-------------------+---------+--------+-----------------------+-----------+
*/
-- Consultar que tipo de producto compra cada cliente y mostrarlo con el
--- nombre del cliente y del productos

SELECT tb_cliente.nombre, tb_categoria.categoria
FROM tb_cliente
INNER JOIN tb_venta ON tb_cliente.id_cliente=tb_venta.id_cliente
INNER JOIN tb_producto ON tb_venta.id_producto=tb_producto.id_producto
INNER JOIN tb_categoria ON tb_producto.id_categoria= tb_categoria.id_categoria
ORDER BY tb_cliente.nombre ASC;

/*+---------+-----------+
| nombre  | categoria |
+---------+-----------+
| Augusta | enlatado  |
| Augusta | gaseosa   |
| Augusta | gaseosa   |
| Greg    | gaseosa   |
| Harriet | Frutas    |
| Peter   | gaseosa   |
| Peter   | enlatado  |
| Rose    | Frutas    |
+---------+-----------+*/

-- UPDATE

--  actualizar para que Augusta aparezca que llevo 3 enlatados

UPDATE tb_venta
SET id_producto = 1
WHERE id_cliente = 1;
