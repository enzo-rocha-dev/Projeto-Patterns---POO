# Projeto-Patterns---POO

##Desenvolvedores da atividade
- Enzo Guilherme Elias da Rocha - 15449850
- Giovana Leite Paião - 16869044 

## visão geral

Este projeto implementa um catálogo de livros em Java utilizando o padrão de projeto **Strategy**, permitindo filtrar livros por autor ou gênero de forma desacoplada, extensível e alinhada às boas práticas de orientação a objetos.

A arquitetura é composta por:

- **Book** – classe que modela o livro.  
- **Catalog** – responsável por armazenar e disponibilizar o catálogo.  
- **Strategy Pattern**:
  - **BookFilterStrategy** — interface base para filtros.  
  - **AuthorFilterStrategy** — implementação de filtro por autor.  
  - **GenreFilterStrategy** — implementação de filtro por gênero.  
- **Main** — interface de execução via console, responsável pela interação com o usuário.

---

## fluxo de uso

Ao executar o programa, o usuário acessa um menu interativo com as seguintes funcionalidades:

### **1. Cadastrar um livro**
- Inserir **título**  
- Inserir **gênero**  
- Inserir **autor**  
- Inserir **editora**

### **2. Filtrar livros**
- **Filtro por gênero**  
- **Filtro por autor**

### **3. Listar catálogo completo**
- Exibe todos os livros cadastrados no sistema.

### **4. Sair**
- Finaliza a aplicação.

---