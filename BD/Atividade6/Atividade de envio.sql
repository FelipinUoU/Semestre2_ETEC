update categoria set descricao = 'Queijo' 			where descricao = 'Cheeses';

update categoria set Nome_categoria = 'Confeitos' 	where Nome_categoria = 'Confections';

update categoria set descricao = 'Peixes'			where Cod_categoria = 8;


	update Territorio set Territoriodescricao = 'Nova Iorque' where Territoriodescricao = 'New york';
    
    update Territorio set Cod_Regiao = 22 where Cod_Regiao = 2;
    
    update Territorio set Cod_Regiao = 9 where Cod_Territorio < 3000;
    
    update Territorio set Territoriodescricao = 'São Francisco' where Territoriodescricao = 'San Francisco';
    
		
		update Envio set Cidade = 'Leão' where Cidade = 'Lyon';
        
        update Envio set Pais = 'Suécia' where Pais = 'Switzerland';
        
		Update Envio set Pais = 'Nada' where Regiao is null;
        
        update Envio set NomeNavio = 'Canarinho' where  NomeNavio = 'Hanari Carnes';
        
        update Envio set Frete = 200 where Frete >= 100;  
        
        update Envio set Regiao = 'Norte' where Regiao = 'Sudeste'; 



