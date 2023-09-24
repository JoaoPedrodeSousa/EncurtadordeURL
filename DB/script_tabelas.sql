CREATE TABLE url(
	id_url SERIAL,
	url_original text NOT NULL,
	url_encurtada varchar(30) NOT NULL,
	
	CONSTRAINT pk_url PRIMARY KEY (id_url),
	CONSTRAINT un_url_original UNIQUE (url_original),
	CONSTRAINT un_url_encurtada UNIQUE (url_encurtada)
);

CREATE TABLE informacoes(
	id_informacoes SERIAL,
	id_url INTEGER NOT NULL,
	data_geracao DATE NOT NULL,
	data_ultimo_acesso DATE,
	data_expiracao DATE NOT NULL,
	
	CONSTRAINT pk_inf PRIMARY KEY (id_informacoes),
	CONSTRAINT fk_id_url FOREIGN KEY (id_url) REFERENCES url(id_url)
);