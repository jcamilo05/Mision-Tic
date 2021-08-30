-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bdreto
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdreto
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdreto` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bdreto` ;

-- -----------------------------------------------------
-- Table `bdreto`.`tb_direcciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`tb_direcciones` (
  `idDireccion` INT NOT NULL AUTO_INCREMENT,
  `calle` VARCHAR(45) NOT NULL,
  `carrera` VARCHAR(45) NOT NULL,
  `numero` VARCHAR(45) NOT NULL,
  `barrio` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idDireccion`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdreto`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `documentoIdentidad` VARCHAR(20) NOT NULL,
  `nombreCliente` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `idDireccion` INT NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `documentoIdentidad_UNIQUE` (`documentoIdentidad` ASC) VISIBLE,
  INDEX `fk_tb_Cliente_tb_direcciones1_idx` (`idDireccion` ASC) VISIBLE,
  CONSTRAINT `fk_tb_Cliente_tb_direcciones1`
    FOREIGN KEY (`idDireccion`)
    REFERENCES `bdreto`.`tb_direcciones` (`idDireccion`))
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8mb3
ROW_FORMAT = COMPRESSED;


-- -----------------------------------------------------
-- Table `bdreto`.`tb_categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`tb_categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombreCategoria` VARCHAR(45) NOT NULL,
  `descripcionCategoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdreto`.`tb_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`tb_productos` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombreProducto` VARCHAR(45) NOT NULL,
  `precioActual` VARCHAR(45) NOT NULL,
  `existencia` VARCHAR(45) NOT NULL,
  `idproveedores` VARCHAR(45) NOT NULL,
  `idCategoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproducto`),
  INDEX `fk_tb_productos_tb_proveedores_idx` (`idproveedores` ASC) VISIBLE,
  INDEX `fk_tb_productos_tb_categoria1_idx` (`idCategoria` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdreto`.`tb_proveedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`tb_proveedores` (
  `idproveedores` INT NOT NULL AUTO_INCREMENT,
  `nit` VARCHAR(20) NOT NULL,
  `razonSocial` VARCHAR(45) NOT NULL,
  `correoElectronico` VARCHAR(20) NOT NULL,
  `representanteLegal` VARCHAR(45) NOT NULL,
  `sitioWeb` VARCHAR(45) NOT NULL,
  `idDireccion` INT NOT NULL,
  PRIMARY KEY (`idproveedores`),
  INDEX `fk_tb_proveedores_tb_direcciones1_idx` (`idDireccion` ASC) VISIBLE,
  CONSTRAINT `fk_tb_proveedores_tb_direcciones1`
    FOREIGN KEY (`idDireccion`)
    REFERENCES `bdreto`.`tb_direcciones` (`idDireccion`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdreto`.`tb_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`tb_venta` (
  `idFactura` INT NOT NULL AUTO_INCREMENT,
  `idproducto` INT NOT NULL,
  `idCliente` INT NOT NULL,
  `fechaVenta` DATE NOT NULL,
  `descuentoVenta` DECIMAL(10,2) NOT NULL DEFAULT '0.00',
  `totalVenta` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`idFactura`, `idproducto`, `idCliente`),
  INDEX `fk_tb_productos_has_tb_Cliente_tb_Cliente1_idx` (`idCliente` ASC) VISIBLE,
  INDEX `fk_tb_productos_has_tb_Cliente_tb_productos1_idx` (`idproducto` ASC) VISIBLE,
  CONSTRAINT `fk_tb_productos_has_tb_Cliente_tb_Cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bdreto`.`cliente` (`idCliente`),
  CONSTRAINT `fk_tb_productos_has_tb_Cliente_tb_productos1`
    FOREIGN KEY (`idproducto`)
    REFERENCES `bdreto`.`tb_productos` (`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `bdreto`.`telefonocliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdreto`.`telefonocliente` (
  `idTelefono` INT NOT NULL AUTO_INCREMENT,
  `numeroTelefono` VARCHAR(20) NOT NULL,
  `idCliente` INT NOT NULL,
  PRIMARY KEY (`idTelefono`),
  INDEX `fk_telefono_tb_Cliente1_idx` (`idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_telefono_tb_Cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bdreto`.`cliente` (`idCliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
