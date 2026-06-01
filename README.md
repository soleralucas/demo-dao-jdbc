
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

## Sobre o projeto

Projeto desenvolvido em Java com foco na aplicação prática de conceitos de Programação Orientada a Objetos. O sistema consiste em uma aplicação de xadrez executada via console, implementando as regras do jogo e a movimentação das peças através de uma lógica orientada a objetos.

Durante o desenvolvimento foram utilizados conceitos como:

* Encapsulamento
* Herança
* Polimorfismo
* Abstração
* Tratamento de exceções

## Modelo conceitual
![Modelo Conceitual](https://github.com/soleralucas/assets/blob/main/chess-system-java/chess-system-design.png)


# Tecnologias utilizadas

## Back end

* Java
* Programação Orientada a Objetos

# Como executar o projeto

## Pré-requisitos

* Java 25
* Git Bash
* Spring Tools Suite (STS), Eclipse ou IntelliJ

## Clonar repositório

Abra o Git Bash e execute os comandos abaixo:

```bash
# clonar repositório
git clone git@github.com:soleralucas/chess-system-java.git

# entrar na pasta do projeto
cd chess-system-java
```

## Abrir o projeto na IDE

### Spring Tools Suite / Eclipse

1. Abra a IDE.
2. Clique em:

```text
File → Import
```

3. Expanda a opção:

```text
General
```

4. Selecione:

```text
Existing Projects into Workspace
```

5. Clique em:

```text
Next
```

6. Em:

```text
Select root directory
```

clique em:

```text
Browse
```

7. Selecione a pasta do projeto clonado.
8. Aguarde a IDE reconhecer o projeto.
9. Clique em:

```text
Finish
```

Após a compilação, a pasta `bin` será criada automaticamente pela IDE.

## Executar o projeto

O projeto pode ser executado diretamente pela IDE através da classe principal:

```text
src/application/Program.java
```

Clique com o botão direito no arquivo e selecione:

```text
Run As → Java Application
```

Após a execução inicial pela IDE, a forma recomendada para executar o projeto é através da pasta `bin`, permitindo visualizar apenas a interface do jogo no console, sem exibição do código-fonte.

No Git Bash, execute os comandos:

```bash
# entrar na pasta bin
cd bin

# executar o programa
java application.Program
```

O jogo será iniciado diretamente no console.



# Autor

Lucas Pereira Solera

https://www.linkedin.com/in/lucas-pereira-solera/
