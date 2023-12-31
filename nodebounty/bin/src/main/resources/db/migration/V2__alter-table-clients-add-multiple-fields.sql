ALTER TABLE clientes
ADD COLUMN Numero INT NOT NULL;

ALTER TABLE clientes
ADD COLUMN Rg VARCHAR(12) NOT NULL;

ALTER TABLE clientes
ADD COLUMN Cpf VARCHAR(14) NOT NULL;

ALTER TABLE clientes
ADD COLUMN DataNascimento DATE NOT NULL;

ALTER TABLE clientes
ADD COLUMN Telefone VARCHAR(17) NOT NULL;

ALTER TABLE clientes
ADD COLUMN Email TEXT NOT NULL;

ALTER TABLE clientes
ADD COLUMN Senha TEXT NOT NULL;

ALTER TABLE clientes
ADD CONSTRAINT UQ_Rg UNIQUE (Rg);

ALTER TABLE clientes
ADD CONSTRAINT UQ_Cpf UNIQUE (Cpf);

ALTER TABLE clientes
ADD CONSTRAINT UQ_Email UNIQUE (Email);
