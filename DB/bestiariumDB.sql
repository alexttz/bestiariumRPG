create database bestiariumDB;
use bestiariumDB;

create table Criaturas(
    id int primary key not null auto_increment,
    nome_criatura varchar(100) not null ,
    tipo_criatura varchar(50) not null,
    habitat_criatura varchar(50) not null ,
    ameaca int not null ,
    descricao text
);