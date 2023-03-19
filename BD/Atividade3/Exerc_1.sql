CREATE DATABASE AtividadeBacana;

use AtividadeBacana;

CREATE TABLE Funcionarios 
(
Codigo_func int PRIMARY KEY auto_increment,
NomeFunc varchar (80),
SobreNome varchar (40),
DataNasci date,
/* TIREI ESSE CPF PORQUE NÃO ESTAVA FUNCIONANDO*/
RG integer,
Endereco varchar (80),
CEP int,
Cidade varchar (20),
Fone int,
CodigoDepartamento int,
Funcao varchar (20),
Salario int
);

insert into Funcionarios values
(0, 'Felipe', 	'Silva', 		'2004-12-23', 	89461358, 	'Rua davi incrivel', 		12542491, 'São Paulo', 1195952224, 1, 'Chefe Geral', 6000),
(0, "Marya", 	"Regina", 		'2005-10-29', 	97515467, 	"Rua davi insatisfeito", 	12542491, "São Paulo", 1197844156, 2, 'Funcionario', 3000),
(0, "Yasmim", 	"Lourdes", 		'2000-01-28', 	44282875, 	"Rua davi lixo", 			15642200, "São Paulo", 1199875540, 4, 'Funcionario', 3000),
(0, 'Biel', 	'Silva', 		'2001-12-23', 	89546554, 	'Rua davi indesejavel', 	22315491, 'São Paulo', 1195952224, 4, 'Chefe Geral', 3000),
(0, 'Joao', 	'Andardes', 	'2002-05-28', 	87214167, 	"Rua davi pobre", 			97845611, "São Paulo", 1195555126, 3, 'Funcionario', 3000),
(0, 'Sandra', 	'Regina', 		'2003-05-05', 	13219812, 	"Rua davi rico", 			76512322, "São Paulo", 1199898540, 3, 'Funcionario', 3000);

/*
insert into Funcionarios (DataNasci) values ('2004-12-23');
delete from Funcionarios where DataNasci='2004-12-23';

texte de como funciona o insert de data
*/

select * from Funcionarios

-----------------------------------------------

				create table Departamentos
				(
				CodigoDepartamento int primary key,
				NomeDepartamento varchar (80)
				);
				
				insert into Departamentos values
				(1, "Gerenciamento"),
				(2, "Recursos Humanos"),
				(3, "Limpeza"),
                (4, "Pessoal");
				
				select CodigoDepartamento, NomeDepartamento from departamentos;
                
-----------------------------------------------
/*
Liste os nomes dos funcionários que trabalham no departamento Pessoal
*/

				select NomeFunc, SobreNome from Funcionarios where NomeFunc not in (select NomeDepartamento from Departamentos);
        
        
        
        
        
        