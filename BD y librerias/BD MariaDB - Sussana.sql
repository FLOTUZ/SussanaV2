-- 
-- ░█████╗░████████╗███████╗███╗░░██╗░█████╗░██╗░█████╗░███╗░░██╗  ██╗██╗██╗
-- ██╔══██╗╚══██╔══╝██╔════╝████╗░██║██╔══██╗██║██╔══██╗████╗░██║  ██║██║██║
-- ███████║░░░██║░░░█████╗░░██╔██╗██║██║░░╚═╝██║██║░░██║██╔██╗██║  ██║██║██║
-- ██╔══██║░░░██║░░░██╔══╝░░██║╚████║██║░░██╗██║██║░░██║██║╚████║  ╚═╝╚═╝╚═╝
-- ██║░░██║░░░██║░░░███████╗██║░╚███║╚█████╔╝██║╚█████╔╝██║░╚███║  ██╗██╗██╗
-- ╚═╝░░╚═╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░╚════╝░╚═╝░╚════╝░╚═╝░░╚══╝  ╚═╝╚═╝╚═╝

-- ---------------------------------------------------------------------------------------------------
-- ---------------------------------------------------------------------------------------------------
-- 	Este script está diseñado exclusivamente para correr en MARIADB 10.4.12 						--
-- 	está un usuario incluido																		--
-- ---------------------------------------------------------------------------------------------------
-- ---------------------------------------------------------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `SUSSANA` ;
USE `SUSSANA` ;

-- -----------------------------------------------------
-- Table `SUSSANA`.`grupo`
-- -----------------------------------------------------
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema SUSSANA
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SUSSANA
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SUSSANA` ;
USE `SUSSANA` ;

-- -----------------------------------------------------
-- Table `SUSSANA`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`persona` (
  `idPersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellidos` VARCHAR(90) NULL,
  `NC` INT NULL,
  PRIMARY KEY (`idPersona`),
  UNIQUE INDEX `idPersona_UNIQUE` (`idPersona` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`tutor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`tutor` (
  `iddocente` INT NOT NULL AUTO_INCREMENT,
  `departamento` VARCHAR(45) NULL,
  `puesto` VARCHAR(45) NULL,
  `correo` VARCHAR(45) NULL,
  `telefono` INT(20) NULL,
  `extension` INT(4) NULL,
  `persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`iddocente`),
  UNIQUE INDEX `iddocente_UNIQUE` (`iddocente` ASC) ,
  INDEX `fk_docente_persona1_idx` (`persona_idPersona` ASC) ,
  CONSTRAINT `fk_docente_persona1`
    FOREIGN KEY (`persona_idPersona`)
    REFERENCES `SUSSANA`.`persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`grupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`grupo` (
  `idGrupo` INT NOT NULL AUTO_INCREMENT,
  `letra` VARCHAR(1) NULL,
  `tutor_iddocente` INT NOT NULL,
  PRIMARY KEY (`idGrupo`),
  UNIQUE INDEX `idGrupo_UNIQUE` (`idGrupo` ASC) ,
  INDEX `fk_grupo_tutor1_idx` (`tutor_iddocente` ASC) ,
  CONSTRAINT `fk_grupo_tutor1`
    FOREIGN KEY (`tutor_iddocente`)
    REFERENCES `SUSSANA`.`tutor` (`iddocente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`carrera`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`carrera` (
  `idcarrera` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idcarrera`),
  UNIQUE INDEX `idcarrera_UNIQUE` (`idcarrera` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`alumno` (
  `idAlumno` INT NOT NULL AUTO_INCREMENT,
  `semestre` INT(2) NULL,
  `Grupo_idGrupo` INT NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  `carrera_idcarrera` INT NOT NULL,
  PRIMARY KEY (`idAlumno`),
  INDEX `fk_Alumno_Grupo1_idx` (`Grupo_idGrupo` ASC) ,
  INDEX `fk_Alumno_Persona1_idx` (`Persona_idPersona` ASC) ,
  INDEX `fk_alumno_carrera1_idx` (`carrera_idcarrera` ASC) ,
  UNIQUE INDEX `idAlumno_UNIQUE` (`idAlumno` ASC) ,
  CONSTRAINT `fk_Alumno_Grupo1`
    FOREIGN KEY (`Grupo_idGrupo`)
    REFERENCES `SUSSANA`.`grupo` (`idGrupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alumno_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `SUSSANA`.`persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_alumno_carrera1`
    FOREIGN KEY (`carrera_idcarrera`)
    REFERENCES `SUSSANA`.`carrera` (`idcarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`credito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`credito` (
  `idCredito` INT NOT NULL,
  `folio` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `status` TEXT NULL,
  `fecha` DATE NULL,
  `tipo` VARCHAR(45) NULL,
  `Alumno_idAlumno` INT NOT NULL,
  PRIMARY KEY (`idCredito`),
  INDEX `fk_Credito_Alumno1_idx` (`Alumno_idAlumno` ASC) ,
  UNIQUE INDEX `idCredito_UNIQUE` (`idCredito` ASC) ,
  UNIQUE INDEX `folio_UNIQUE` (`folio` ASC) ,
  CONSTRAINT `fk_Credito_Alumno1`
    FOREIGN KEY (`Alumno_idAlumno`)
    REFERENCES `SUSSANA`.`alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`canalizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`canalizacion` (
  `idCanalizacion` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `tutor` VARCHAR(255) NULL,
  `Alumno_idAlumno` INT NOT NULL,
  `carrera_idcarrera` INT NOT NULL,
  `tristeza` TINYINT NULL,
  `angustia` TINYINT NULL,
  `ansiedad` TINYINT NULL,
  `desesperacion` TINYINT NULL,
  `llanto` TINYINT NULL,
  `conducta` TINYINT NULL,
  `animo` TINYINT NULL,
  `exitacion` TINYINT NULL,
  `irritabilidad` TINYINT NULL,
  `drogas` TINYINT NULL,
  `aprendizaje` TINYINT NULL,
  `autoAgresiones` TINYINT NULL,
  `otro` VARCHAR(255) NULL,
  `Descripcion` TEXT(255) NULL,
  PRIMARY KEY (`idCanalizacion`),
  UNIQUE INDEX `idCanalizacion_UNIQUE` (`idCanalizacion` ASC) ,
  INDEX `fk_Canalizacion_Alumno1_idx` (`Alumno_idAlumno` ASC) ,
  INDEX `fk_Canalizacion_carrera1_idx` (`carrera_idcarrera` ASC) ,
  CONSTRAINT `fk_Canalizacion_Alumno1`
    FOREIGN KEY (`Alumno_idAlumno`)
    REFERENCES `SUSSANA`.`alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Canalizacion_carrera1`
    FOREIGN KEY (`carrera_idcarrera`)
    REFERENCES `SUSSANA`.`carrera` (`idcarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`bajaAusentismo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`bajaAusentismo` (
  `idbajaAusentismo` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `docenteReporta` VARCHAR(45) NOT NULL,
  `asignatura` VARCHAR(45) NOT NULL,
  `clave` INT NULL,
  `fechasInasistenciasInjustificadas` JSON NULL,
  `posibleCausa` VARCHAR(50) NULL,
  `resultadoinvestigacion` VARCHAR(255) NULL,
  `alumno_idAlumno` INT NOT NULL,
  PRIMARY KEY (`idbajaAusentismo`),
  UNIQUE INDEX `idbajaAusentismo_UNIQUE` (`idbajaAusentismo` ASC) ,
  INDEX `fk_bajaAusentismo_alumno1_idx` (`alumno_idAlumno` ASC) ,
  CONSTRAINT `fk_bajaAusentismo_alumno1`
    FOREIGN KEY (`alumno_idAlumno`)
    REFERENCES `SUSSANA`.`alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


CREATE USER 'susana'@'localhost' IDENTIFIED VIA mysql_native_password;
SET PASSWORD FOR 'susana'@'localhost' = PASSWORD('patata');
GRANT ALL PRIVILEGES ON `usuario`.* TO 'susana'@'localhost';
