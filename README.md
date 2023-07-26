# Java E Clean Architecture

# Aplicação Escola

A aplicação Escola é um sistema desenvolvido para gerenciar informações de alunos em uma escola. Ela permite realizar ações como cadastrar novos alunos, registrar indicações feitas por alunos, realizar matrículas e manter um repositório de alunos. Além disso, a aplicação inclui testes automatizados utilizando JUnit para garantir o bom funcionamento das funcionalidades implementadas.

## Funcionalidades

### 1. Classe Aluno

A classe Aluno é responsável por representar um aluno na escola e possui os seguintes atributos:

- **CPF**: número de identificação único para cada aluno.
- **Nome**: nome completo do aluno.
- **Email**: endereço de email do aluno.
- **Telefones**: lista de números de telefone do aluno, que pode conter um ou mais números.

### 2. Indicação

A funcionalidade de indicação permite que um aluno indique outro aluno para a escola. Isso pode ser útil para que novos alunos sejam atraídos por meio de indicações de alunos já matriculados, incentivando assim a comunidade escolar.

### 3. Matricular

A funcionalidade de matricular permite que um novo aluno seja cadastrado no sistema da escola. Ao realizar a matrícula, são solicitados os dados do aluno, como CPF, nome, email e telefones, e essas informações são armazenadas no repositório de alunos da escola.


