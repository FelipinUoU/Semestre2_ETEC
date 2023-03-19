create database Etec;

use Etec;

create table Alunos (

Codigo Int,
Nome varchar(80),
Email varchar(100));


insert into Alunos values 
(1, "Felipe", "FelipeSilva@hotmail.com"),  
(2, "Maria", "MariaSilva@hotmail.com"),
(3, "Jucelina", "Juju@gmail.com"),
(4, "Luna", "Luneta@gmail.com"),
(5, "Yasmin", "YasminBolada@hotmail.com");

select * from Alunos order by Codigo desc;

delete from Alunos where Codigo = 5;


 