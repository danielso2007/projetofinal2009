INSERT INTO USUARIO VALUES(1,'admin@pinngo.com','Daniel','admin','bnVsbGFkbWluQHBpbm5nby5jb20xMi8wNC8yMDE0');
INSERT INTO USUARIO VALUES(2,'teste@pinngo.com','Daniel Teste','123','bnVsbGFkbWluQHBpbm5nby5jb20xMi8wNC8yMDE0');
INSERT INTO ENDERECO (id, cep, cidade, endereco, estado, numero) VALUES (1,'20210-030','Centro','Avenida Presidente Vargas','Rio de Janeiro',1875); 
INSERT INTO ENDERECO (id, cep, cidade, endereco, estado, numero) VALUES (2,'20221-420','Centro','Rua Barão de São Félix','Rio de Janeiro',148);
INSERT INTO ENDERECO (id, cep, cidade, endereco, estado, numero) VALUES (3,'20220-410','Santo Cristo','Rua Equador','Rio de Janeiro',650);
INSERT INTO ENDERECO (id, cep, cidade, endereco, estado, numero) VALUES (4,'20540-410','Centro','Rua Chile','Rio de Janeiro',250);
INSERT INTO PONTO (id, dataAtualizacao, dataCriacao, latitude, longitude, mensagemApresentacao, nome, statusPesquisa, endereco_id, usuario_id) VALUES (1,'2014-03-18 20:08:08','2014-03-18 20:08:08',-22.906598,-43.1959672,'Avaliar o serviço e qualidade do estabelecimento','Auto Posto Metro',0, 1, 1);
INSERT INTO PONTO (id, dataAtualizacao, dataCriacao, latitude, longitude, mensagemApresentacao, nome, statusPesquisa, endereco_id, usuario_id) VALUES (2,'2014-03-18 20:08:08','2014-03-20 13:40:13',-22.9090337,-43.1979205,'Avaliar o serviço e qualidade do estabelecimento','Posto Garagem Barão de São Félix',0, 2, 1);
INSERT INTO PONTO (id, dataAtualizacao, dataCriacao, latitude, longitude, mensagemApresentacao, nome, statusPesquisa, endereco_id, usuario_id) VALUES (3,'2014-03-18 20:08:08','2014-03-18 11:08:08',-22.9090337,-43.1979205,'Avaliar o serviço e qualidade do estabelecimento','Posto Mega Equador',0, 3, 1);
INSERT INTO PONTO (id, dataAtualizacao, dataCriacao, latitude, longitude, mensagemApresentacao, nome, statusPesquisa, endereco_id, usuario_id) VALUES (4,'2014-03-17 22:08:08','2014-03-20 14:20:08',-22.9090337,-43.1979205,'Avaliar o serviço e qualidade do estabelecimento','Posto Brazil',4, 4, 1);