-- VIDEO AULA 1 DO XUXU TRIGGER

CREATE FUNCTION DO_NOTHING() RETURNS TRIGGER AS
$BODY$
BEGIN

RETURN NULL;

END;
$BODY$ LANGUAGE PLPGSQL;


CREATE TRIGGER DO_NOTHING_CARGOS BEFORE INSERT ON CARGOS
FOR EACH ROW EXECUTE PROCEDURE DO_NOTHING();

INSERT INTO cargos(nome, descricao)
    VALUES ('VIGILANTE', 'VIGIA ALGUMA COISA');

-- AULA 2

DROP FUNCTION DO_NOTHING()

-- AULA 3

CREATE OR REPLACE FUNCTION CHECK_DATE() RETURNS TRIGGER AS
$BODY$
BEGIN

	IF NEW.DATA_EMISSAO > NEW.DATA_VENCIMENTO THEN
		RAISE EXCEPTION 'IMPOSSIVEL VENDER ALGO JA VENCIDO.';
	END IF;

	IF NEW.DATA_EMISSAO IS NULL THEN
		NEW.DATA_EMISSAO = NOW();
	END IF;

	IF NEW.DATA_EMISSAO = NEW.DATA_VENCIMENTO THEN
		NEW.DATA_BAIXA = NOW();
	END IF;
	
	RETURN NEW;

END;
$BODY$ LANGUAGE PLPGSQL;

-- OBS: XUXU NAO FEZ ISSO, VEIO DE NARNIA
CREATE TRIGGER CHECK_DATE_ENTRADAS BEFORE INSERT ON FINANCEIRO_ENTRADAS
FOR EACH ROW EXECUTE PROCEDURE CHECK_DATE();


INSERT INTO FINANCEIRO_ENTRADAS(FK_VENDAS, DATA_EMISSAO, DATA_VENCIMENTO, DATA_BAIXA, VALOR) VALUES
	(3, NULL, '26-06-2016', NULL, 999);

-- AULA 4

CREATE TABLE LOG(
	PK_LOG SERIAL PRIMARY KEY,
	DATA DATE,
	USUARIO VARCHAR(40),
	DES VARCHAR(100)
);

CREATE OR REPLACE FUNCTION GRAVA_LOG() RETURNS TRIGGER AS
$BODY$
BEGIN

	INSERT INTO LOG (DATA, USUARIO, DES) 
	VALUES (NOW(), current_user, 'Tipo: ' || TG_OP || ', Tabela: ' || TG_TABLE_NAME || ': ' || NEW.*);

	RETURN NEW;

END;
$BODY$ LANGUAGE PLPGSQL;

-- INVENÇÃO DE NARNIA
CREATE OR REPLACE FUNCTION GRAVA_LOG_DELETE() RETURNS TRIGGER AS
$BODY$
BEGIN

	INSERT INTO LOG (DATA, USUARIO, DES) 
	VALUES (NOW(), current_user, 'Tipo: ' || TG_OP || ', Tabela: ' || TG_TABLE_NAME || ': ' || OLD.*);

	RETURN NEW;

END;
$BODY$ LANGUAGE PLPGSQL;

CREATE TRIGGER LOG_CARGOS AFTER INSERT OR UPDATE ON CARGOS
FOR EACH ROW EXECUTE PROCEDURE GRAVA_LOG();

-- VEIO DE NARNIA
CREATE TRIGGER LOG_CARGOS_DELETE AFTER DELETE ON CARGOS
FOR EACH ROW EXECUTE PROCEDURE GRAVA_LOG_DELETE();

CREATE TRIGGER LOG_PRODUTOS AFTER INSERT OR UPDATE OR DELETE ON PRODUTOS
FOR EACH ROW EXECUTE PROCEDURE GRAVA_LOG();

INSERT INTO cargos(nome, descricao)
    VALUES ('COORDENADOR DE VENDAS', 'COORDENA AS VENDAS');

UPDATE CARGOS SET NOME = 'COORDENADOR DE PIRULUTOS' WHERE NOME = 'COORDENADOR DE VENDAS'; -- OTIMIZADO

-- DESAFIO

/*  
toda vez que insere compra_item somar a qtd_estoque nos produtos
toda vez que insere vendas_item subtrair do qtd_estoque nos produtos
toda vez que delete vendas_item somar do qtd_estoque nos produtos
trigger after insert do compra_item e vendas_item
trigger after update do compra_item e vendas_item
trigger after delete do compra_item e vendas_item
*/

-----------------------------------------------------------------

-------------------- RESOLUÇÃO DO DESAFIO -----------------------

-----------------------------------------------------------------

CREATE OR REPLACE FUNCTION atualiza_estoque() RETURNS trigger AS
$BODY$
DECLARE

	x integer;

BEGIN
	IF (TG_TABLE_NAME = 'compras_itens') THEN
		x = 1;
	ELSIF (TG_TABLE_NAME = 'vendas_itens') THEN
		x = -1;
	END IF;

	IF (TG_OP = 'DELETE') THEN
		UPDATE Produtos set QTD_ESTOQUE = QTD_ESTOQUE + (x * - old.qtd) 
		WHERE pk_produto = OLD.fk_produto;
		return old;

	ELSIF (TG_OP = 'INSERT') THEN
		UPDATE Produtos SET QTD_ESTOQUE = QTD_ESTOQUE + (x * + NEW.QTD) 
                WHERE pk_produto = NEW.fk_produto;
		RETURN new;	

	ELSIF (TG_OP = 'UPDATE') THEN
		UPDATE Produtos SET QTD_ESTOQUE = (QTD_ESTOQUE + (x * (-OLD.QTD))) + (x * NEW.QTD) 
                WHERE pk_produto = NEW.fk_produto;
		Return new;
	
	END IF;

END;
$BODY$
LANGUAGE PLPGSQL;

CREATE TRIGGER atualiza_compras AFTER INSERT OR UPDATE OR DELETE ON compras_itens FOR EACH ROW EXECUTE PROCEDURE atualiza_estoque();
CREATE TRIGGER atualiza_vendas AFTER INSERT OR UPDATE OR DELETE ON vendas_itens FOR EACH ROW EXECUTE PROCEDURE atualiza_estoque();