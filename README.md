# 🎸 Bands in City - Console App

Um programa de console desenvolvido em Java que exibe as bandas que irão tocar em Curitiba. O aplicativo permite visualizar as bandas por diferentes critérios.

## 🚀 Funcionalidades

- 📅 Exibe bandas que irão tocar hoje em Curitiba.
- 🎶 Filtragem por gênero musical.
- ⏳ Mostra bandas para os próximos 7 dias e 30 dias. &#x20;

## ⚙️ Tecnologias Utilizadas

- Java&#x20;

## 📂 Estrutura do Projeto

```
projeto-bandas-curitiba
├── meuPacote
│   ├── Banda.java        # Classe que representa uma banda
│   ├── Genero.java       # Classe de gêneros de bandas
│   ├── Main.java         # Ponto de entrada do programa
│   ├── Metodos.java      # Lógica do programa
│   ├── Usuario.java      # Classe que representa um usuário
├── README.md             # Documentação do projeto
```

## ⚡ Como Executar o Projeto

### 1. Pré-requisitos

Certifique-se de ter o Java instalado. Caso não tenha, baixe e instale a versão mais recente do Java no [site oficial](https://www.java.com/).

### 2. Clonar o repositório

```sh
git clone https://github.com/Baroli03/Java.git
cd Java
```

### 3. Compilar e Executar

No terminal, dentro do diretório do projeto, execute:

```sh
javac meuPacote/*.java
java meuPacote.Main
```

## 📈 Exemplos de Uso

Ao executar o programa, um menu será exibido:

```
Escolha uma opção:
1 - Sobre nós
2 - Pesquisa por gêneros de banda
3 - Bandas que vão tocar nos próximos 7 dias
4 - Bandas que vão tocar nos próximos 30 dias
5 - Todas as bandas
6 - Sair
```

Exemplo de saída:

```
🎸 Bandas que tocarão hoje:
- Essas são as bandas do Gênero (Alternative) que tocarão nos próximos 7 dias:
  Garbage - 23/03

- Essas são as bandas do Gênero (Rock) que tocarão nos próximos 7 dias:
  O gênero (Rock) não terá show nos próximos 7 dias.
```

## 📚 Licença

Este projeto é distribuído sob a licença MIT. Sinta-se à vontade para contribuir! 😊

