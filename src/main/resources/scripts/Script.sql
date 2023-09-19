drop schema EXEMPLOS;

CREATE SCHEMA EXEMPLOS;
USE EXEMPLOS;

CREATE TABLE exemplos.fabricantes (
	id int auto_increment NOT NULL,
	nome varchar(400) NOT NULL,
	cnpj varchar(14) NOT NULL,
	CONSTRAINT fabricantes_pk PRIMARY KEY (id),
	cidade varchar(100) NOT NULL,
	cep char(8) NOT NULL,
	uf char(2) NOT NULL
);

CREATE TABLE exemplos.produtos (
	id int auto_increment NOT NULL,
	nome varchar(400) NOT NULL,
	id_fabricante int NOT NULL,
	valor DECIMAL NOT NULL,
	peso DECIMAL NOT NULL,
	data_cadastro DATE NOT NULL,
	CONSTRAINT produtos_pk PRIMARY KEY (id),
	CONSTRAINT id_fabricante foreign key (id_fabricante) references exemplos.fabricantes(ID)
);