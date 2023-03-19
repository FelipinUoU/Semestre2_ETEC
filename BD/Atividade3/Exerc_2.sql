CREATE DATABASE AtividadeBacana_2;

use AtividadeBacana_2;

CREATE TABLE CD
(
Codigo int PRIMARY KEY auto_increment,
Nome_CD varchar(40),
DataCompra date,
ValorPago double,
AlbumOuSingle varchar(80)
);

insert into CD values
(0, 'Cybertapes', '2022-03-02', '29.99', 'Album'),
(0, 'Booty Call', '2022-05-02', '4.99' , 'Single'),
(0, 'Spider-Man: Into the Spider Verse OST', '2018-12-14', '45.99', 'Album'),
(0, 'After Hours', '2020-03-20', '39.99', 'Album'),
(0, 'Forever', '2014-10-27', '19.99', 'Album');



-----------------------	

		create table Musicas
        (
        Codigo int,
        foreign key (Codigo) references CD (Codigo),
        NumeroMusica int,
        NomeMusica varchar (40),
        Artista varchar (40),
        Tempo double
        );

		insert into Musicas values
		(1, '2', 'GhostChroma', 'Yung Lixo', '2.23'),
        (1, '7', 'Festa', 'Yung Lixo', '2.41'),
        (3, '1', 'What´s Up Danger (with Black Caviar)', 'Blackway, Black Caviar', '3.42'),
        (4, '11', 'Save Your Tears', 'The Weeknd', '3.35'),
        (5, '11', 'Every Note', 'Mystery Skulls', '5.08');

-----------------------	
/*
Mostre o cd que custou mais caro
*/

select Codigo, Nome_CD, ValorPago from CD where ValorPago=(select max(ValorPago) from CD);

