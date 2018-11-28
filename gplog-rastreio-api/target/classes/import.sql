insert into cliente (id, nome, endereco) values (13579, 'Guilherme', 'Emitente');
insert into cliente (id, nome, endereco) values (24680, 'Guilherme', 'Centro de triagem');
insert into cliente (id, nome, endereco) values (24348, 'Guilherme', 'Centro de Distribuição SP');
insert into cliente (id, nome, endereco) values (45987, 'Guilherme', 'Trasnportadora local SP');
insert into cliente (id, nome, endereco) values (5, 'Maria', 'Rua da Laranja, 257');

insert into local (id, nome) values (1, 'Emitente'); 
insert into local (id, nome) values (2, 'Destino');
insert into local (id, nome) values (3, 'Centro de triagem');
insert into local (id, nome) values (4, 'Centro de Distribuição SP');
insert into local (id, nome) values (5, 'Centro de Distribuição MG');
insert into local (id, nome) values (6, 'Trasnportadora local SP');
insert into local (id, nome) values (7, 'Trasportadora local MG');
insert into local (id, nome) values (8, 'Em transito');

insert into encomenda (id, cliente_id, postagem) values (1, 13579, '2018-11-18');
insert into encomenda (id, cliente_id, postagem) values (2, 24680, '2018-11-22');
insert into encomenda (id, cliente_id, postagem) values (3, 24348, '2018-11-24');
insert into encomenda (id, cliente_id, postagem) values (4, 45987, '2018-11-27');


insert into step (id, encomenda_nome, local_id, recebimento) values (1, 'Emitente', 1, '2018-10-25');
insert into step (id, encomenda_nome, local_id, recebimento) values (2, 'Centro de triagem', 2, '2018-10-25');

