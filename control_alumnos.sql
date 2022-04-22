CREATE DATABASE control_alumnos;
USE control_alumnos;

CREATE TABLE direccion(
id_direccion INT,
calle VARCHAR(50),
numero VARCHAR(50),
ciudad VARCHAR(50),
tipo enum ('CASA', 'TRABAJO', 'OTRO'),
CONSTRAINT pk_direccion PRIMARY KEY (id_direccion)
);

CREATE TABLE alumno(
id_alumno INT,
rut VARCHAR(50),
nombre VARCHAR(50),
apellido VARCHAR(50),
email VARCHAR(50),
edad INT,
fecha_ingreso DATE,
id_direccion INT,
CONSTRAINT pk_alumno PRIMARY KEY (id_alumno),
CONSTRAINT fk_direccion FOREIGN KEY (id_direccion) REFERENCES direccion(id_direccion)
);

SELECT * FROM direccion;
SELECT * FROM alumno;


INSERT INTO direccion (id_direccion, calle, numero, ciudad, tipo)
VALUE (1, "Los Robles", 15, "Quilpue", "CASA");

INSERT INTO alumno (id_alumno, rut, nombre, apellido, email, edad, fecha_ingreso, id_direccion)
VALUE (1, 159587654-5, "henry", "gomez", "henry15@gmail.com", 20, "2005-10-15", 1);

