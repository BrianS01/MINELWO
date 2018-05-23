drop database if exists MUNDULERY;
create database MUNDULERY;
use MUNDULERY;

CREATE TABLE IF NOT EXISTS MUNDULERY.Interprete
(
	    idInterprete INT NOT NULL,
	nombreInterprete VARCHAR(45) NULL,
	PRIMARY KEY (idInterprete)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS MUNDULERY.Sencillo
(
	    idSencillo INT NOT NULL,
    nombreSencillo VARCHAR(45) NULL,
      idInterprete INT NULL,
    PRIMARY KEY (idSencillo),
    FOREIGN KEY (idInterprete) REFERENCES MUNDULERY.Interprete(idInterprete)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS MUNDULERY.Album
(
	     idAlbum INT NOT NULL,
     nombreAlbum VARCHAR(45) NULL,
    idInterprete INT NULL,
    PRIMARY KEY (idAlbum),
    FOREIGN KEY (idInterprete) REFERENCES MUNDULERY.Interprete(idInterprete)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS MUNDULERY.Cancion
(
	    idCancion INT NOT NULL,
    nombreCancion VARCHAR(45) NULL,
          idAlbum INT NULL,
    PRIMARY KEY (idCancion),
    FOREIGN KEY (idAlbum) REFERENCES MUNDULERY.Album(idAlbum)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS MUNDULERY.VentaSencillo
(
	idVentaSencillo INT NOT NULL,
              fecha DATE NULL,
           cantidad INT NULL,
         idSencillo INT NULL,
	PRIMARY KEY (idVentaSencillo),
    FOREIGN KEY (idSencillo) REFERENCES MUNDULERY.Sencillo(idSencillo)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS MUNDULERY.VentaAlbum
(
	idVentaAlbum INT NOT NULL,
           fecha DATE NULL,
        cantidad INT NULL,
         idAlbum INT NULL,
    PRIMARY KEY (idVentaAlbum),
    FOREIGN KEY (idAlbum) REFERENCES MUNDULERY.Album(idAlbum)
)ENGINE = InnoDB;
