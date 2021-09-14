# Dgen

Consiste em um gerador de código, cuja ideia seria definir uma sintaxe simplificada onde seria possível definir classes, atributos e relações, e a partir disso gerar um CRUD para cada classe em uma aplicação web Django.

Com o projeto do gerador aberto no eclipse, seguir estes passos:

- Clicar com botão direito sobre a pasta `org.xtext.mdd.dgen`
- Clicar em `Run As` -> `Eclipse Application` -> `Next, next, next...`

Uma nova instância do eclipse será aberta. Nela podemos definir os arquivos `.dgen` (gramática que especificamos).

Primeiramente, devemos criar um novo _Projeto Java_.

- `File` -> `New` -> `Other` -> `Java Project` -> `Next` -> [Dar um nome ao Projeto] -> Finish -> Create
- **<CRIAR O ARQUIVO .dgen DE ALGUMA FORMA>**
- Após criar o arquivo `.dgen`, indentificando nele as entidades do projeto, o código será 	gerado na pasta `src-gen`.

Para executar o projeto django que foi gerado, primeiramente devemos usar os seguintes comandos: 

```bash
# Para entrar no env...
cd src-gen
source env/bin/activate 

# Quando houver alguma alteração na(s) classe(s)...
python manage.py makemigrations app 
python manage.py migrate

# E finalmente, para executar o servidor...
python manage.py runserver 
```