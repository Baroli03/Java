# 🎸 Bandas Curitiba - Console App

Um programa de console desenvolvido em **Java** que exibe as bandas que irão tocar em Curitiba. O aplicativo permite visualizar as bandas por diferentes critérios e utiliza **JSON** para armazenar os dados dos usuários.

## 🚀 Funcionalidades

- 📅 Exibe bandas que irão tocar **hoje** em Curitiba.
- 🎶 Filtragem por **gênero musical**.
- ⏳ Mostra bandas para os próximos **7 dias** e **30 dias**.
- 👤 Gerenciamento de **usuários** (armazenados em JSON).

## 🛠️ Tecnologias Utilizadas

- **Java** (versão X.X)
- **Gradle** para gerenciamento de dependências
- **Jackson** para manipulação de arquivos JSON

## 📂 Estrutura do Projeto

```
📂 projeto-bandas-curitiba
├── 📁 gradle
├── 📁 app
│   ├── 📁 src
│   │   ├── 📁 main
│   │   │   ├── 📁 java
│   │   │   │   ├── 📁 meuPacote
│   │   │   │   │   ├── 📄 Main.java  # Ponto de entrada do programa
│   │   │   │   │   ├── 📄 Banda.java # Classe que representa uma banda
│   │   │   │   │   ├── 📄 Genero.java # Classe de gêneros de bandas
│   │   │   │   │   ├── 📄 GravadorJson.java # Manipulação de arquivos JSON
│   │   │   │   │   ├── 📄 Metodos.java # Lógica do programa
│   │   │   │   │   ├── 📄 Usuario.java # Classe que representa um usuário
├── 📄 build.gradle.kts  # Configuração do Gradle
├── 📄 settings.gradle.kts  # Configuração do projeto Gradle
├── 📄 usuario.json  # Dados dos usuários
├── 📄 .gitattributes
├── 📄 .gitignore
├── 📄 gradle.properties
├── 📄 gradlew
├── 📄 gradlew.bat
├── 📄 README.md  # Documentação do projeto
```

## ⚙️ Como Executar o Projeto

### 1️⃣ Pré-requisitos

- Ter o **Java** e **Gradle** instalados
- Clonar este repositório:
  ```sh
  git clone https://github.com/Baroli03/Java
  ```

### 2️⃣ Compilar e Executar

Dentro do diretório do projeto, execute:

```sh
./gradlew run
```

## 📌 Exemplos de Uso

### Exibir bandas que tocarão hoje:

```
> Escolha uma opção:
1 - Sobre nós
2 - Pesquisa por Gêneros de banda
3 - Bandas que vão tocar nos próximos 7 dias
4 - Bandas que vão tocar nos próximos 30 dias
5 - Todas as bandas
6 - Sair
Opção: 3

🎸 Bandas que tocarão hoje:
- Essas são as bandas do Gênero (Alternative) que tocarão nos próximos 7 dias:
Garbage 23/3

- Essas são as bandas do Gênero (Rock) que tocarão nos próximos 7 dias:
O gênero (Rock) não terá show nos próximos 7 dias.
```

## 📜 Licença

Este projeto é distribuído sob a licença MIT. Sinta-se à vontade para contribuir! 😊


