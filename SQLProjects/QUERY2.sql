-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS EmpleadosDB CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;

-- Usar la base de datos
USE EmpleadosDB;

-- Eliminar la tabla empleados si existe
DROP TABLE IF EXISTS empleados;

-- Crear la tabla empleados
CREATE TABLE empleados (
    id_empleado SMALLINT PRIMARY KEY AUTO_INCREMENT,
    salario DECIMAL(6, 2) CHECK (salario > 1000) DEFAULT 1500.00,
    nombre VARCHAR(20) NOT NULL,
    fecha_ingreso DATE NOT NULL CHECK (fecha_ingreso >= '2024-01-01' AND fecha_ingreso <= '2024-12-31'),
    nivel_academico CHAR(3) NOT NULL UNIQUE,
    sexo ENUM('masculino', 'femenino') DEFAULT 'femenino'
);