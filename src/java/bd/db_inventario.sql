CREATE TABLE Area (
  idArea INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idPersona INTEGER UNSIGNED NOT NULL,
  area VARCHAR(45) NULL,
  ubicacion VARCHAR(45) NULL,
  telefono NUMERIC(8) NULL,
  estado NUMERIC(1) NULL,
  idEscuela INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idArea, idPersona)
);

CREATE TABLE Categoria (
  idCategoria INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NULL,
  descripcion VARCHAR(45) NULL,
  estado NUMERIC(1) NULL,
  PRIMARY KEY(idCategoria)
);

CREATE TABLE Componente (
  idComponente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NULL,
  estado INTEGER UNSIGNED NULL,
  idCategoria INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idComponente)
);

CREATE TABLE Detalle_Inventario (
  idDetalleInventario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idUsuario INTEGER UNSIGNED NOT NULL,
  idPersona INTEGER UNSIGNED NOT NULL,
  nombre VARCHAR(20) NULL,
  modelo VARCHAR(20) NULL,
  serie VARCHAR(20) NULL,
  material VARCHAR(20) NULL,
  color VARCHAR(20) NULL,
  marca VARCHAR(20) NULL,
  cantidad INTEGER UNSIGNED NULL,
  fecha DATETIME NULL,
  idInventario INTEGER UNSIGNED NOT NULL,
  idSubComponente INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idDetalleInventario, idUsuario, idPersona)
);

CREATE TABLE Escuela (
  idEscuela INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idPersona INTEGER UNSIGNED NOT NULL,
  escuela VARCHAR(20) NULL,
  ubicacion VARCHAR(20) NULL,
  idFacultad INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idEscuela, idPersona)
);

CREATE TABLE Facultad (
  idFacultad INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idPersona INTEGER UNSIGNED NOT NULL,
  facultad VARCHAR(45) NULL,
  ubicion VARCHAR(20) NULL,
  telefono INTEGER UNSIGNED NULL,
  PRIMARY KEY(idFacultad, idPersona)
);

CREATE TABLE Inventario (
  idInventario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idPersona INTEGER UNSIGNED NOT NULL,
  descripcion VARCHAR(45) NULL,
  cantidad INTEGER UNSIGNED NULL,
  estado NUMERIC(1) NULL,
  fecha_registro DATETIME NULL,
  ubicacion VARCHAR(20) NULL,
  PRIMARY KEY(idInventario, idPersona)
);

CREATE TABLE Persona (
  idPersona INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  paterno VARCHAR(45) NULL,
  materno VARCHAR(45) NULL,
  sexo CHAR(1) NULL,
  dni NUMERIC(8) NULL,
  telefono INTEGER UNSIGNED NULL,
  PRIMARY KEY(idPersona)
);

CREATE TABLE Sub_Area (
  idSubArea INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idPersona INTEGER UNSIGNED NOT NULL,
  subArea VARCHAR(45) NULL,
  ubicacion VARCHAR(45) NULL,
  telefono NUMERIC(8) NULL,
  estado NUMERIC(1) NULL,
  PRIMARY KEY(idSubArea, idPersona)
);

CREATE TABLE Sub_Componente (
  idSubComponente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NULL,
  estado INTEGER UNSIGNED NULL,
  idComponente INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idSubComponente)
);

CREATE TABLE Usuario (
  idUsuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  idPersona INTEGER UNSIGNED NOT NULL,
  usuario VARCHAR(20) NULL,
  clave VARCHAR(20) NULL,
  PRIMARY KEY(idUsuario, idPersona)
);


