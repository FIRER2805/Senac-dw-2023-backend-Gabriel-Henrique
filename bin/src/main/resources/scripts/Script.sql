use exemplo;

create table produto(
	id int not null auto_increment primary key
	,nome varchar(100) not null
	,fabricante varchar(100) not null
	,valor double not null
	,preso double not null
	,data_cadastro datetime not null
);