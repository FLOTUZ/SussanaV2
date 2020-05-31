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
-- Table `SUSSANA`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `Tipo` VARCHAR(45) NULL,
  `Contraseña` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`Grupo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Grupo` (
  `idGrupo` INT NOT NULL,
  `area` VARCHAR(45) NULL,
  `semestre` VARCHAR(45) NULL,
  PRIMARY KEY (`idGrupo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Persona` (
  `idPersona` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellidos` VARCHAR(45) NULL,
  `No. Control` VARCHAR(45) NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idPersona`),
  INDEX `fk_Persona_Usuario_idx` (`Usuario_idUsuario` ASC) ,
  CONSTRAINT `fk_Persona_Usuario`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `SUSSANA`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Alumno` (
  `idAlumno` INT NOT NULL,
  `Semestre` VARCHAR(45) NULL,
  `Carrera` VARCHAR(45) NULL,
  `Grupo_idGrupo` INT NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idAlumno`),
  INDEX `fk_Alumno_Grupo1_idx` (`Grupo_idGrupo` ASC) ,
  INDEX `fk_Alumno_Persona1_idx` (`Persona_idPersona` ASC) ,
  CONSTRAINT `fk_Alumno_Grupo1`
    FOREIGN KEY (`Grupo_idGrupo`)
    REFERENCES `SUSSANA`.`Grupo` (`idGrupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alumno_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `SUSSANA`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`Credito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Credito` (
  `idCredito` INT NOT NULL,
  `Solicitud` VARCHAR(45) NULL,
  `Alumno_idAlumno` INT NOT NULL,
  PRIMARY KEY (`idCredito`),
  INDEX `fk_Credito_Alumno1_idx` (`Alumno_idAlumno` ASC) ,
  CONSTRAINT `fk_Credito_Alumno1`
    FOREIGN KEY (`Alumno_idAlumno`)
    REFERENCES `SUSSANA`.`Alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`Solicitud`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Solicitud` (
  `idSolicitud` INT NOT NULL,
  `Generacion` VARCHAR(45) NULL,
  `No. de Boleta` VARCHAR(45) NULL,
  `Alumno_idAlumno` INT NOT NULL,
  PRIMARY KEY (`idSolicitud`),
  INDEX `fk_Solicitud_Alumno1_idx` (`Alumno_idAlumno` ASC) ,
  CONSTRAINT `fk_Solicitud_Alumno1`
    FOREIGN KEY (`Alumno_idAlumno`)
    REFERENCES `SUSSANA`.`Alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `SUSSANA`.`Canalizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Canalizacion` (
  `idCanalizacion` INT NOT NULL,
  `Fecha` VARCHAR(45) NULL,
  `Motivo` VARCHAR(45) NULL,
  `Carrera` VARCHAR(45) NULL,
  `Semestre` VARCHAR(45) NULL,
  `Solicitud_idSolicitud` INT NOT NULL,
  PRIMARY KEY (`idCanalizacion`),
  INDEX `fk_Canalizacion_Solicitud1_idx` (`Solicitud_idSolicitud` ASC) ,
  CONSTRAINT `fk_Canalizacion_Solicitud1`
    FOREIGN KEY (`Solicitud_idSolicitud`)
    REFERENCES `SUSSANA`.`Solicitud` (`idSolicitud`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SUSSANA`.`Tutor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUSSANA`.`Tutor` (
  `idTutor` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellidos` VARCHAR(45) NULL,
  `No. Control` VARCHAR(45) NULL,
  `Grupo_idGrupo` INT NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idTutor`),
  INDEX `fk_Tutor_Grupo1_idx` (`Grupo_idGrupo` ASC) ,
  INDEX `fk_Tutor_Persona1_idx` (`Persona_idPersona` ASC) ,
  CONSTRAINT `fk_Tutor_Grupo1`
    FOREIGN KEY (`Grupo_idGrupo`)
    REFERENCES `SUSSANA`.`Grupo` (`idGrupo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tutor_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `SUSSANA`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE USER 'susana'@'localhost' IDENTIFIED VIA mysql_native_password;
SET PASSWORD FOR 'susana'@'localhost' = PASSWORD('patata');
GRANT ALL PRIVILEGES ON `usuario`.* TO 'susana'@'localhost';
