CREATE TABLE usuario (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	usuario VARCHAR(50) NOT NULL,
	nome VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO usuario (usuario, nome) values ('andre_matos', 'André Amorim de Matos');