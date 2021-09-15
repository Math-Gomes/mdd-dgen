<p align="center"> 
    <img src="https://i.imgur.com/2iJZfJz.png" width="50" height="50">
</p>

<h1 align="center">DGen</h1>

Esta ferramenta consiste em um **gerador de código**, no qual a partir da gramática _DGen_, geramos um **CRUD** das entidades definidas na gramática para uma aplicação web em _Django_. 

Para construir este gerador, utilizamos o _[Xtext](https://www.eclipse.org/Xtext/)_ para criar uma gramática com sintaxe simplificada, em que podemos definir tipos de dados, entidades, atributos, relacionamentos e as ações do CRUD que estarão disponíveis para cada entidade.

A partir da definição da gramática, recorremos ao _[Xtend](https://www.eclipse.org/xtend/)_ para, finalmente, gerar o código para a aplicação em _Django_.

## Criando uma nova aplicação

Primeiramente é necessário criar o seu `<filename>.dgen`. 

Como mencionado anteriormente, nele serão definidos:
- Tipos de dados (`Datatype`'s);
- Entidades (`Entity`'s);
- Atributos (podem ser `Datatype`'s ou `Entity`'s);
- Ações 
    - Criar: `@Create`;
    - Ler: `@Read`;
    - Atualizar: `@Update`;
    - Deletar: `@Delete`;
    - Todas as anteriores: `@All`;
    - Nenhuma: `@None`.

Com o projeto do gerador aberto no eclipse, seguir estes passos:

- Clicar com botão direito sobre o diretório `org.xtext.mdd.dgen`
- Clicar em `Run As` -> `Eclipse Application` -> `Next, next, next...`

Uma nova aba do _eclipse_ será aberta. É nela que iremos criar e escrever o arquivo `<filename>.dgen`, ou seja, estaremos instanciando a gramática que foi definida.

Primeiramente, devemos criar um novo _Projeto Java_.

- `File` -> `New` -> `Other` -> `Java Project` -> `Next` -> [_Dar um nome ao Projeto_] -> `Finish` -> `Create`
- **<CRIAR O ARQUIVO .dgen DE ALGUMA FORMA>**

Exemplo de um modelo em _DGen_:
```
datatype String
datatype Int
datatype Float
datatype Date

@All
entity Funcionario {
	nome: String
	idade: Int
	dtAdmissao: Date
}

@Create
@Read
@Update
entity Departamento {
	nome: String
	many funcionarios: Funcionario
}

@All
entity Empresa {
	nome: String
	many deptos: Departamento
}
```

Após criar o arquivo `.dgen`, identificando nele as entidades do projeto, o código será gerado na pasta `src-gen`.

Para executar a aplicação _Django_ que foi gerada, devemos usar os seguintes comandos: 

```bash
# Executar o script que criamos para instalar algumas dependências do projeto...
./scripts/init

# Para entrar no env...
> cd src-gen
> source env/bin/activate 

# Para atualizar a estrutura do banco de dados...
> python manage.py makemigrations app 
> python manage.py migrate

# E finalmente, para executar o servidor...
> python manage.py runserver 
```

E por fim, a última consideração é que, o código gerado servirá como base para o programador começar a construir sua a aplicação, ou seja, eventualmente poderão ocorrer mudanças nas entidades (classes definidas no arquivo `models.py`). Quando houverem alterações na(s) classe(s) do projeto, pare de executar o servidor e rode os seguintes comandos para atualizar a estrutura do banco de dados.
```bash
python manage.py makemigrations app 
python manage.py migrate
```

