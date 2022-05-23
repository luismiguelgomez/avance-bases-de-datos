/*ESQUEMA*/
CREATE SCHEMA tienda;

/*ENUM*/
CREATE TYPE tienda.enum_tipo_usuario AS ENUM ('admin','buyer', 'seller');

/*TABLAS*/
CREATE TABLE tienda.usuario (
	usuario_id INT NOT NULL PRIMARY KEY,
	Id_type_usuario tienda.enum_tipo_usuario NOT NULL,
	usuario_email VARCHAR(100) UNIQUE NOT NULL,
	usuario_name VARCHAR(100) UNIQUE NOT NULL,
	usuario_password VARCHAR(100) NOT NULL,
	creation_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP  NOT NULL
);

CREATE TABLE tienda.PROVEDOR (
	provedor_id INT NOT NULL PRIMARY KEY,
	empresa_prevedora varchar(100) unique not null,
	user_id INT not null,
	creation_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP  NOT NULL,
	CONSTRAINT "user_id" FOREIGN KEY ("user_id")
		REFERENCES tienda.usuario("usuario_id")
);

CREATE TABLE tienda.ORDEN (
	product_name varchar(100) not null,
	precio_producto varchar (100) not null,
	creacion_date TIMESTAMP not null,
	id_usuario_comprador INT not null,
	user_id INT not null,
	provedor_producto varchar (100) not null,
	CONSTRAINT "user_id" FOREIGN KEY ("user_id")
		REFERENCES tienda.usuario("usuario_id")
);

CREATE TABLE tienda.AUDIT_ORDEN (
	tienda_audit_id Serial NOT NULL PRIMARY KEY,
	product_name varchar(100) NOT NULL,
	precio_producto varchar (100) not null,
	creacion_date TIMESTAMP not null,
	id_usuario_comprador INT not null
);
