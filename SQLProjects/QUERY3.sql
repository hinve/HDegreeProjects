DROP DATABASE IF EXISTS EJERCICIO1;

CREATE DATABASE EJERCICIO1 CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;

USE EJERCICIO1;

CREATE TABLE CLIENTE (
	codcliente SMALLINT AUTO_INCREMENT PRIMARY KEY,
    dni CHAR(9)
    CHECK(dni COLLATE utf8mb4_bin RLIKE '^[0-9]{8}[a-z]{1}$')
    UNIQUE
    NOT NULL,
    poblacion VARCHAR(6) DEFAULT 'Málaga',
    telefono CHAR(9),
    socio ENUM('s', 'n', 'S', 'N'),
    fecha_insc DATE
    CHECK(fecha_insc BETWEEN '2024-11-01' AND '2024-11-30')
);

